package com.kendall.dota2dataservice.service;

import com.kendall.dota2dataservice.pojo.vo.LeagueDetailVo;
import com.kendall.dota2dataservice.pojo.vo.LeagueVo;
import com.kendall.dota2dataservice.pojo.vo.PlayerVo;
import com.kendall.dota2dataservice.pojo.vo.TeamVo;

import java.util.List;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/21
 */
public interface LeagueService {
    /**
     * 获取比赛列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<LeagueVo> getLeagueList(Integer pageNum, Integer pageSize);

    /**
     * 获取比赛详情
     *
     * @param detailId
     * @return
     */
    LeagueDetailVo getLeagueDetail(String detailId);

    /**
     * 获取玩家信息
     *
     * @param playerId
     * @return
     */
    List<PlayerVo> getLeaguePlayer(Integer playerId);

    /**
     * 获取战队列表
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<TeamVo> getLeagueTeam(Integer pageNum, Integer pageSize);
}
