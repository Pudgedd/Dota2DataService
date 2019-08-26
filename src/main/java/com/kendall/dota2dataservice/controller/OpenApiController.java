package com.kendall.dota2dataservice.controller;

import com.alibaba.fastjson.JSONObject;
import com.kendall.dota2dataservice.utils.HttpClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/26
 */
@RestController
public class OpenApiController {
    @Autowired
    private HttpClientUtil httpClientUtil;

    private String host = "https://api.opendota.com/api/";

    @GetMapping(value = "/open/doTransfer.json")
    public String transferOpenApi(String uri, @RequestParam("params") String params) throws Exception {
        return httpClientUtil.doGet(host + uri, JSONObject.parseObject(params));
    }
}
