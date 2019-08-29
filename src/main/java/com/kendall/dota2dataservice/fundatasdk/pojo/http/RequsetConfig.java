package com.kendall.dota2dataservice.fundatasdk.pojo.http;

import org.apache.http.HttpRequest;

/**
 * 请求配置
 * @author baoyl
 * @created 2018/5/9
 */
public interface RequsetConfig {
    /**
     * 配置httpRequest
     * @param request
     */
    void config(HttpRequest request);
}
