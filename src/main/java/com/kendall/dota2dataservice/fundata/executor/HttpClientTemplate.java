package com.kendall.dota2dataservice.fundata.executor;

import com.kendall.dota2dataservice.common.constant.ErrorType;
import com.kendall.dota2dataservice.fundata.exception.ClientException;
import com.kendall.dota2dataservice.fundata.pojo.http.EntityEnclosingGet;
import com.kendall.dota2dataservice.fundata.pojo.http.Form;
import com.kendall.dota2dataservice.fundata.pojo.http.HttpClientOperation;
import com.kendall.dota2dataservice.fundata.pojo.http.Json;
import com.kendall.dota2dataservice.fundata.pojo.http.RequsetConfig;
import com.kendall.dota2dataservice.utils.AssertUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;

/**
 * fundata http请求操作
 *
 * @author baoyl
 * @created 2018/5/9
 */
public class HttpClientTemplate implements HttpClientOperation {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private static final String URL_START = "/";
    private String key;
    private String secret;
    private HttpClient client;
    private HttpHost host;
    private String rootPath;

    HttpClientTemplate(String host, String rootPath, String key, String secret) {
        this.key = key;
        this.secret = secret;
        this.rootPath = rootPath;
        this.client = HttpClientBuilder.create().build();
        this.host = new HttpHost(host);
    }

    @Override
    public HttpClient getClient() {
        return client;
    }

    @Override
    public String get(String url) throws ClientException {
        return get(url, (Json) null);
    }

    @Override
    public String get(String url, Form form) throws ClientException {
        return get(url, form, new FunDataRequestConfig(key, secret, rootPath + url, form == null ? null : form.merge()));
    }

    @Override
    public String get(String url, Json json) throws ClientException {
        return get(url, json, new FunDataRequestConfig(key, secret, rootPath + url, json == null ? null : json.merge()));
    }

    @Override
    public String get(String url, Form form, RequsetConfig config) throws ClientException {
        return get(url, null, form, config);
    }

    @Override
    public String get(String url, Json json, RequsetConfig config) throws ClientException {
        return get(url, json, null, config);
    }

    public String get(String url, Json json, Form form, RequsetConfig config) throws ClientException {
        url = handleUrl(url);
        HttpRequest get;
        if (json != null) {
            get = new EntityEnclosingGet(url);
        } else if (form == null || form.isEmpty()) {
            get = new HttpGet(url);
        } else {
            get = new HttpGet(buildURI(url, form));
        }
        return execute(get, json, null, config);
    }

    @Override
    public String post(String url, Form form) throws ClientException {
        return post(url, form, new FunDataRequestConfig(key, secret, rootPath + url, form == null ? null : form.merge()));
    }

    @Override
    public String post(String url, Json json) throws ClientException {
        return post(url, json, new FunDataRequestConfig(key, secret, rootPath + url, json == null ? null : json.merge()));
    }

    @Override
    public String post(String url, Form form, RequsetConfig config) throws ClientException {
        return post(url, null, form, config);
    }

    @Override
    public String post(String url, Json json, RequsetConfig config) throws ClientException {
        return post(url, json, null, config);
    }

    public String post(String url, Json json, Form form, RequsetConfig config) throws ClientException {
        url = handleUrl(url);
        return execute(new HttpPost(url), json, form, config);
    }

    private String handleUrl(String url) {
        if (StringUtils.isBlank(url)) {
            url = "";
        } else if (!url.startsWith(URL_START)) {
            url = "/" + url;
        }
        return host + rootPath + url;
    }

    private URI buildURI(String url, Form form) throws ClientException {
        try {
            return new URIBuilder(url).addParameters(form.values2NVP()).build();
        } catch (Exception e) {
            throw new ClientException(ClientException.DEFAULT_CLIENT_EXCEPTION_CODE, e);
        }
    }

    private String execute(HttpRequest request, Json json, Form form, RequsetConfig config) throws ClientException {
        try {
            if (json != null && !json.isEmpty()) {
                ((HttpEntityEnclosingRequest) request).setEntity(new StringEntity(json.toString(), "utf-8"));
            }
            if (form != null && !form.isEmpty()) {
                ((HttpEntityEnclosingRequest) request).setEntity(new UrlEncodedFormEntity(form.values(), "utf-8"));
            }
            if (config != null) {
                config.config(request);
            }
            HttpUriRequest httpUriRequest = (HttpUriRequest) request;
            return parseResult(client.execute(httpUriRequest));
        } catch (Exception e) {
            throw new ClientException(ClientException.DEFAULT_CLIENT_EXCEPTION_CODE, e);
        } finally {
            try {
                ((HttpRequestBase) request).releaseConnection();
            } catch (Exception e) {
                logger.error("release connection error", e);
            }
        }
    }

    private String parseResult(HttpResponse response) throws Exception {
        String result = response.getEntity() == null ? null : EntityUtils.toString(response.getEntity(), "UTF-8");
        int statusCode = response.getStatusLine().getStatusCode();

        AssertUtil.assertTrue(statusCode >= HttpStatus.SC_OK && statusCode <= HttpStatus.SC_MULTI_STATUS, ErrorType.RESPONSE_ERROR_CODE,
                "Call funData API error, statusCode is: " + statusCode);

        return result;
    }

}