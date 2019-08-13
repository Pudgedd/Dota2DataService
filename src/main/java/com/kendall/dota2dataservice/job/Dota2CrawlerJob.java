package com.kendall.dota2dataservice.job;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import com.kendall.dota2dataservice.dao.HeroMapper;
import com.kendall.dota2dataservice.dao.ItemMapper;
import com.kendall.dota2dataservice.dao.SkillMapper;
import com.kendall.dota2dataservice.pojo.bean.AbilityBean;
import com.kendall.dota2dataservice.pojo.bean.BaseBean;
import com.kendall.dota2dataservice.pojo.bean.HeroDataBean;
import com.kendall.dota2dataservice.pojo.bean.HeroDescBean;
import com.kendall.dota2dataservice.pojo.bean.ItemBean;
import com.kendall.dota2dataservice.pojo.model.Hero;
import com.kendall.dota2dataservice.pojo.model.Item;
import com.kendall.dota2dataservice.pojo.model.Skill;
import com.kendall.dota2dataservice.utils.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/31
 */
@Component
public class Dota2CrawlerJob {
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private HeroMapper heroMapper;
    @Autowired
    private SkillMapper skillMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(Dota2CrawlerJob.class);

    private static final String URI_DOTA2_HERO = "http://www.dota2.com/jsfeed/heropickerdata?v=5264023b5264023&l=schinese";
    public static final String URI_DOTA2_RAW_DATA = "http://www.dota2.com/jsfeed/heropediadata?feeds=itemdata,abilitydata,herodata&v=52640234UDW7q_aaauo&l=schinese&callback=HeropediaDFReceive";

    private int count;

    /**
     * 每天凌晨1点执行一次
     */
    //    @Scheduled(fixedRate = 600000)
    @Scheduled(cron = "0 0 1 * * ?")
    private void process() {
        LOGGER.info("This is DOTA2 crawler job running {}", (count++));
        try {
            updateDota2RowData();
            LOGGER.info("This is DOTA2 crawler job success stopping {}", (count));
        } catch (Exception e) {
            LOGGER.error("DOTA2 crawler job encounter an error", e);
        }
    }

    private void updateDota2RowData() throws IOException {
        RequestConfig defaultRequestConfig = RequestConfig.custom()
                .setSocketTimeout(5000).setConnectTimeout(5000)
                .setConnectionRequestTimeout(5000).build();
        HttpClient httpclient = HttpClients.custom().setDefaultRequestConfig(defaultRequestConfig).build();
        // 创建一个GET请求
        HttpGet request = new HttpGet(URI_DOTA2_RAW_DATA);

        // 发送GET请求，并将响应内容转换成字符串
        String response = httpclient.execute(request, new BasicResponseHandler());

        HttpGet requestForHero = new HttpGet(URI_DOTA2_HERO);
        String responseForHero = httpclient.execute(requestForHero, new BasicResponseHandler());

        String res = response.substring(response.indexOf("(") + 1, response.indexOf(")"));
        JsonObject jsonObject = JsonUtils.stringToJsonObject(res);
        JsonObject itemJson = jsonObject.getAsJsonObject("itemdata");
        JsonObject abilityJson = jsonObject.getAsJsonObject("abilitydata");
        JsonObject heroDataJson = jsonObject.getAsJsonObject("herodata");

        JsonObject heroDescJson = JsonUtils.stringToJsonObject(responseForHero);

        //解析物品数据
        List<ItemBean> itemBeans = getRawData(itemJson, ItemBean.class);
        //解析英雄技能数据
        List<AbilityBean> abilityBeans = getRawData(abilityJson, AbilityBean.class);
        //解析英雄基础数据
        List<HeroDataBean> heroDataBeans = getRawData(heroDataJson, HeroDataBean.class);
        //解析英雄描述数据
        List<HeroDescBean> heroDescBeans = getRawData(heroDescJson, HeroDescBean.class);

        batchInsertItems(itemBeans);

        List<Hero> heroes = batchInsertHeroes(heroDataBeans, heroDescBeans);

        batchInsertSkills(abilityBeans, heroes);

        request.releaseConnection();
        requestForHero.releaseConnection();
    }

    private void batchInsertSkills(List<AbilityBean> abilityBeans, List<Hero> heroes) {
        List<Skill> skills = Lists.newArrayList();
        int skillId = 1;
        for (AbilityBean abilityBean : abilityBeans) {
            Skill skill = new Skill();
            BeanUtils.copyProperties(abilityBean, skill);
            skill.setId(skillId);
            skills.add(skill);
            skillId++;
        }

        int offset = 0;
        int hero_id = 0;
        for (int i = 0; i < heroes.size(); i++) {
            Hero hero = heroes.get(i);
            hero_id++;
            Skill skill = skills.get(offset);
            while (skill.getName().startsWith(hero.getName()) || skill.getName().startsWith(hero.getName().replaceAll("_", ""))) {
                skill.setHeroId(hero_id);
                offset++;
                skill = skills.get(offset);
            }
            while (skill.getName().startsWith("special_bonus")) {
                skill.setHeroId(hero_id);
                offset++;
                if (offset >= skills.size()) break;
                skill = skills.get(offset);
            }
        }

        skillMapper.batchInsert(skills);
    }

    private List<Hero> batchInsertHeroes(List<HeroDataBean> heroDataBeans, List<HeroDescBean> heroDescBeans) {
        int offset = 0;
        ArrayList<Hero> heroes = Lists.newArrayList();
        for (HeroDataBean dataBean : heroDataBeans) {
            Hero hero = new Hero();

            BeanUtils.copyProperties(dataBean, hero);
            hero.setAttribs(JsonUtils.objectToJsonString(dataBean.getAttribs()));
            hero.setAttack(dataBean.getDac());

            HeroDescBean heroDescBean = heroDescBeans.get(offset);
            hero.setDesc(heroDescBean.getDesc());
            offset++;

            heroes.add(hero);
        }
        heroMapper.batchInsert(heroes);
        return heroes;
    }


    private void batchInsertItems(List<ItemBean> itemBeans) {
        List<Item> items = Lists.newArrayList();
        for (ItemBean itemBean : itemBeans) {
            if (StringUtils.equals(itemBean.getMc(), "false")) {
                itemBean.setMc(null);
            }
            if (StringUtils.equals(itemBean.getCd(), "false")) {
                itemBean.setCd(null);
            }
            if (itemBean.getComponents() != null) {
                itemBean.setComponents(JsonUtils.objectToJsonString(itemBean.getComponents()));
            }
            Item item = new Item();
            BeanUtils.copyProperties(itemBean, item);
            items.add(item);
        }
        itemMapper.batchInsert(items);
    }

    /**
     * 解析数据
     *
     * @param jsonObject
     * @param classOfT
     * @param <T>
     * @return
     */
    private static <T extends BaseBean> ArrayList<T> getRawData(JsonObject jsonObject, Class<T> classOfT) {
        ArrayList<T> rawDatas = Lists.newArrayList();
        for (String key : jsonObject.keySet()) {
            try {
                T data = JsonUtils.jsonElementToTypeOfT(jsonObject.get(key).getAsJsonObject(), classOfT);
                data.setName(key);
                rawDatas.add(data);
            } catch (Exception e) {
                LOGGER.error("Parse dota2 " + classOfT.getSimpleName() + " error with key: " + key + " value: " + jsonObject.get(key), e);
            }
        }
        return rawDatas;
    }
}
