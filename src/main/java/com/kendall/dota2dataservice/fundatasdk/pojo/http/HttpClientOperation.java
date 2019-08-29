package com.kendall.dota2dataservice.fundatasdk.pojo.http;

import com.kendall.dota2dataservice.fundatasdk.exception.ClientException;
import org.apache.http.client.HttpClient;


/**
 * http客户端操作
 * @author baoyl
 * @created 2018/5/9
 */
public interface HttpClientOperation {

    /**
     * 获取httpclient
     * @return
     */
    public HttpClient getClient();

    /**
     * get请求
     * @param url
     * @return
     * @throws ClientException
     */
    public String get(String url) throws ClientException;

    /**
     * get请求
     * @param url
     * @param form
     * @return
     * @throws ClientException
     */
    public String get(String url, Form form) throws ClientException;

    /**
     * get请求
     * @param url
     * @param json
     * @return
     * @throws ClientException
     */
    public String get(String url, Json json) throws ClientException;

    /**
     * get请求
     * @param url
     * @param form
     * @param config
     * @return
     * @throws ClientException
     */
    public String get(String url, Form form, RequsetConfig config) throws ClientException;

    /**
     * get请求
     * @param url
     * @param json
     * @param config
     * @return
     * @throws ClientException
     */
    public String get(String url, Json json, RequsetConfig config) throws ClientException;

    /**
     * post请求
     * @param url
     * @param form
     * @return
     * @throws ClientException
     */
    public String post(String url, Form form) throws ClientException;

    /**
     * post请求
     * @param url
     * @param json
     * @return
     * @throws ClientException
     */
    public String post(String url, Json json) throws ClientException;

    /**
     * post请求
     * @param url
     * @param form
     * @param config
     * @return
     * @throws ClientException
     */
    public String post(String url, Form form, RequsetConfig config) throws ClientException;

    /**
     * post请求
     * @param url
     * @param json
     * @param config
     * @return
     * @throws ClientException
     */
    public String post(String url, Json json, RequsetConfig config) throws ClientException;

}
