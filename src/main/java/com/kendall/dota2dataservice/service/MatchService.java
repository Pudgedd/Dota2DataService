package com.kendall.dota2dataservice.service;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/25
 */
public interface MatchService {

    /**
     * 获取对局基本信息
     * @param matchId
     * @return
     */
    String getMatchBasicInfo(Integer matchId);
}
