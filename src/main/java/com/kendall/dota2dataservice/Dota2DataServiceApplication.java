package com.kendall.dota2dataservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableCaching
@MapperScan("com.kendall.dota2dataservice.dao")
@SpringBootApplication
public class Dota2DataServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Dota2DataServiceApplication.class, args);
    }

}
