package com.kendall.dota2dataservice.job;

import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.kendall.dota2dataservice.dao.HeroMapper;
import com.kendall.dota2dataservice.dao.ItemMapper;
import com.kendall.dota2dataservice.dao.SkillMapper;
import com.kendall.dota2dataservice.pojo.bean.MaxHeroStatBean;
import com.kendall.dota2dataservice.pojo.bean.MaxItemStatBean;
import com.kendall.dota2dataservice.utils.HttpClientUtil;
import com.kendall.dota2dataservice.utils.JsonUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/27
 */
@Component("max")
public class MaxCrawlerThread implements Dota2CrawlerThread {
    private static final Logger LOGGER = LoggerFactory.getLogger(MaxCrawlerThread.class);

    private static final String URI_HERO_DETAIL = "https://api.maxjia.com/api/hero/detail/overview/";
    public static final String URI_HERO_STAT = "https://api.maxjia.com/api/hero/stat/v3/";
    public static final String URI_ITEM_STAT = "https://api.maxjia.com/api/item/stat/v2/";
    private static final String URI_ITEM_DETAIL = "https://api.maxjia.com/api/item/detail/overview/";

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
        Map<String, Object> params = getRequestParams();
        String resForHeroStat = httpClientUtil.doGet(URI_HERO_STAT, params);
        String resForItemStat = httpClientUtil.doGet(URI_ITEM_STAT, params);

        JsonObject heroStatJson = JsonUtils.stringToJsonObject(resForHeroStat);
        JsonObject resultForHero = heroStatJson.getAsJsonObject("result");
        MaxHeroStatBean heroStat = JsonUtils.jsonElementToTypeOfT(resultForHero, MaxHeroStatBean.class);

        JsonObject itemStatJson = JsonUtils.stringToJsonObject(resForItemStat);
        JsonObject resultForItem = itemStatJson.getAsJsonObject("result");
        MaxItemStatBean itemStat = JsonUtils.jsonElementToTypeOfT(resultForItem, MaxItemStatBean.class);

        batchInsertHeroDetails(heroStat);
    }

    private void batchInsertHeroDetails(MaxHeroStatBean heroStat) throws Exception {
        List<MaxHeroStatBean.StatBean> statBeanList = heroStat.getStat();
        if (CollectionUtils.isEmpty(statBeanList)) {
            return;
        }

        for (MaxHeroStatBean.StatBean stat : statBeanList) {
            String name = stat.getName();
            Map<String, Object> params = getRequestParams();
            params.put("name", name);
            String resForHeroDetail = httpClientUtil.doGet(URI_HERO_DETAIL, params);
        }
    }

    private Map<String, Object> getRequestParams() {
        Map<String, Object> params = Maps.newHashMap();
        params.put("lang", "zh-cn");
        params.put("os_type", "iOS");
        params.put("os_version", "12.4");
        params.put("version", "4.4.2");
        params.put("device_id", "2B99ADC4-7F59-47A6-900C-5A66C8813EC9");
        params.put("game_type", "dota2");
        params.put("max__id", "0");
        return params;
    }
}
