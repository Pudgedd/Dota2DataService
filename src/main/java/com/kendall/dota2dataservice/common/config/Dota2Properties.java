package com.kendall.dota2dataservice.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/20
 */
@Configuration
@PropertySource(value="classpath:application.yml")
@ConfigurationProperties(prefix = "dota2")
public class Dota2Properties {
    private String key;
    private String secret;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
