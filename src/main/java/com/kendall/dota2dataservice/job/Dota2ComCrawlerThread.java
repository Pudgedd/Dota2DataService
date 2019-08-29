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
import com.kendall.dota2dataservice.utils.HttpClientUtil;
import com.kendall.dota2dataservice.utils.JsonUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/27
 */
@Component("dota2Com")
public class Dota2ComCrawlerThread implements Dota2CrawlerThread{
    private static final Logger LOGGER = LoggerFactory.getLogger(Dota2ComCrawlerThread.class);

    private static final String URI_DOTA2_HERO = "http://www.dota2.com/jsfeed/heropickerdata?v=5264023b5264023&l=schinese";
    public static final String URI_DOTA2_RAW_DATA = "http://www.dota2.com/jsfeed/heropediadata?feeds=itemdata,abilitydata,herodata&v=52640234UDW7q_aaauo&l=schinese&callback=HeropediaDFReceive";

    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private HeroMapper heroMapper;
    @Autowired
    private SkillMapper skillMapper;
    @Autowired
    private HttpClientUtil httpClientUtil;

    @Override
    public void run() throws Exception {
        this.getDota2RowData();
    }


    private void getDota2RowData() throws Exception {
        String response = httpClientUtil.doGet(URI_DOTA2_RAW_DATA);
        String responseForHero = httpClientUtil.doGet(URI_DOTA2_HERO);

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
