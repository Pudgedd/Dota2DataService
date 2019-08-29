package com.kendall.dota2dataservice.service;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/29
 */
public interface MaxApiService {
    String getHeroStat() throws Exception;

    String getItemStat() throws Exception;

    String getHeroDetail(String name) throws Exception;

    String getItemDetail(String name) throws Exception;
}
