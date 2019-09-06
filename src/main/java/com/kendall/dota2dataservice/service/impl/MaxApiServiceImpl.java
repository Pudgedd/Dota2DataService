package com.kendall.dota2dataservice.service.impl;

import com.google.common.collect.Maps;
import com.kendall.dota2dataservice.service.MaxApiService;
import com.kendall.dota2dataservice.utils.HttpClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/29
 */
@Service
public class MaxApiServiceImpl implements MaxApiService {
    private static final String URI_HERO_DETAIL = "https://api.maxjia.com/api/hero/detail/overview/";
    public static final String URI_HERO_STAT = "https://api.maxjia.com/api/hero/stat/v3/";
    public static final String URI_ITEM_STAT = "https://api.maxjia.com/api/item/stat/v2/";
    private static final String URI_ITEM_DETAIL = "https://api.maxjia.com/api/item/detail/overview/";
    private static final String URI_LEAGUE_LIST = "https://api.maxjia.com/api/league/get_league_list/";
    private static final String URI_LEAGUE_MATCHES = "https://api.maxjia.com/api/league/get_league_matches/";

    @Autowired
    private HttpClientUtil httpClientUtil;

    @Cacheable(value = "heroStat")
    @Override
    public String getHeroStat() throws Exception {
        Map<String, Object> params = getRequestParams();
        return httpClientUtil.doGet(URI_HERO_STAT, params);
    }

    @Cacheable(value = "itemStat")
    @Override
    public String getItemStat() throws Exception {
        Map<String, Object> params = getRequestParams();
        return httpClientUtil.doGet(URI_ITEM_STAT, params);
    }

    @Cacheable(value = "heroDetail")
    @Override
    public String getHeroDetail(String name) throws Exception {
        Map<String, Object> params = getRequestParams();
        params.put("name", name);

        return httpClientUtil.doGet(URI_HERO_DETAIL, params);
    }

    @Cacheable(value = "itemDetail")
    @Override
    public String getItemDetail(String name) throws Exception {
        Map<String, Object> params = getRequestParams();
        params.put("name", name);

        return httpClientUtil.doGet(URI_ITEM_DETAIL, params);
    }

    @Cacheable(value = "leagueList")
    @Override
    public String getLeagueList(Integer offset, Integer limit) throws Exception {
        Map<String, Object> params = getRequestParams();
        params.put("offset", offset);
        params.put("limit", limit);

        return httpClientUtil.doGet(URI_LEAGUE_LIST, params);
    }

    @Cacheable(value = "leagueMatches", key = "#leagueId")
    @Override
    public String getLeagueMatches(String leagueId) throws Exception {
        Map<String, Object> params = getRequestParams();
        params.put("leagueid", leagueId);

        return httpClientUtil.doGet(URI_LEAGUE_MATCHES, params);
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
