package com.kendall.dota2dataservice.service.impl;

import com.google.common.collect.Maps;
import com.kendall.dota2dataservice.pojo.bean.StoreOptionBean;
import com.kendall.dota2dataservice.service.C5GameApiService;
import com.kendall.dota2dataservice.utils.HttpClientUtil;
import com.kendall.dota2dataservice.utils.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @description:
 * @author: kendall
 * @since: 2019/9/14
 */
@Service
public class C5GameApiServiceImpl implements C5GameApiService {
    private static final String URI_OPTION_LIST = "https://open.c5game.com/v4/sys/item/option";
    private static final String URI_STORE_LIST = "https://open.c5game.com/v1/store";
    private static final String DOTA2_APPID = "570";

    @Autowired
    private HttpClientUtil httpClientUtil;

    @Cacheable(value = "options")
    @Override
    public String getOptionList() throws Exception {
        Map<String, Object> params = getRequestParams();
        return httpClientUtil.doGet(URI_OPTION_LIST, params);
    }

    @Cacheable(value = "stores", key = "#optionBean.toString()", unless = "#optionBean.toString() == ''")
    @Override
    public String getStoreList(StoreOptionBean optionBean) throws Exception {
        Map<String, Object> params = getRequestParams();
        String paramsString = JsonUtils.objectToJsonString(optionBean);
        Map<String, Object> map = JsonUtils.stringToMap(paramsString);
        params.putAll(map);

        return httpClientUtil.doGet(URI_STORE_LIST, params);
    }

    private Map<String, Object> getRequestParams() {
        Map<String, Object> params = Maps.newHashMap();
        params.put("appid", DOTA2_APPID);
        params.put("android_version_code", "207040");
        return params;
    }
}
