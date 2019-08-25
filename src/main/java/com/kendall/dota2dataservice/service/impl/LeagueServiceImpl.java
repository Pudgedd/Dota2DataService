package com.kendall.dota2dataservice.service.impl;

import com.google.common.collect.Lists;
import com.kendall.dota2dataservice.common.config.Dota2Properties;
import com.kendall.dota2dataservice.fundata.exception.ClientException;
import com.kendall.dota2dataservice.fundata.executor.pub.Dota2LeagueExecutor;
import com.kendall.dota2dataservice.pojo.ResponseVo;
import com.kendall.dota2dataservice.pojo.vo.LeagueDetailVo;
import com.kendall.dota2dataservice.pojo.vo.LeagueVo;
import com.kendall.dota2dataservice.pojo.vo.PlayerVo;
import com.kendall.dota2dataservice.pojo.vo.TeamVo;
import com.kendall.dota2dataservice.service.LeagueService;
import com.kendall.dota2dataservice.utils.ResponseUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/21
 */
@Service
public class LeagueServiceImpl implements LeagueService, InitializingBean {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Dota2Properties properties;

    private Dota2LeagueExecutor executor;

    @Override
    public List<LeagueVo> getLeagueList(Integer pageNum, Integer pageSize) {
        try {
            String respStr = executor.getLeagueList(pageSize, pageNum);
            ResponseVo<List<LeagueVo>> result = ResponseUtility.parseResponseWithListData(respStr, LeagueVo.class);

            return result.getData();
        } catch (ClientException e) {
            log.error("getLeagueList error", e);
        }
        return Lists.newArrayList();
    }

    @Override
    public LeagueDetailVo getLeagueDetail(String detailId) {
        try {
            String respStr = executor.getLeagueDetail(detailId);
            ResponseVo<LeagueDetailVo> result = ResponseUtility.parseResponse(respStr, LeagueDetailVo.class);
            return result.getData();
        } catch (ClientException e) {
            log.error("getLeagueDetail error", e);
        }
        return null;
    }

    @Override
    public List<PlayerVo> getLeaguePlayer(Integer playerId) {
        try {
            String respStr = executor.getLeaguePlayer(playerId);
            ResponseVo<List<PlayerVo>> result = ResponseUtility.parseResponseWithListData(respStr, PlayerVo.class);
            return result.getData();
        } catch (ClientException e) {
            log.error("getLeaguePlayer error", e);
        }
        return Lists.newArrayList();
    }

    @Override
    public List<TeamVo> getLeagueTeam(Integer pageNum, Integer pageSize) {
        try {
            String respStr = executor.getLeagueTeam(pageNum, pageSize);
            ResponseVo<List<TeamVo>> result = ResponseUtility.parseResponseWithListData(respStr, TeamVo.class);
            return result.getData();
        } catch (ClientException e) {
            log.error("getLeagueTeam error", e);
        }
        return Lists.newArrayList();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.executor = new Dota2LeagueExecutor(properties.getKey(), properties.getSecret());
    }

}
