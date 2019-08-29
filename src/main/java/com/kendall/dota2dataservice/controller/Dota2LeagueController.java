package com.kendall.dota2dataservice.controller;

import com.kendall.dota2dataservice.pojo.vo.ResponseVo;
import com.kendall.dota2dataservice.service.LeagueService;
import com.kendall.dota2dataservice.utils.ResponseUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * @description: 比赛数据
 * @author: kendall
 * @since: 2019/7/20
 */
@Validated
@RestController
@RequestMapping("/league/")
public class Dota2LeagueController {
    @Autowired
    private LeagueService leagueService;

    @GetMapping("/getLeagueList.json")
    public ResponseVo getLeagueList(@NotNull Integer pageNum, @NotNull Integer pageSize) {
        return ResponseUtility.buildSuccessResponse(leagueService.getLeagueList(pageNum, pageSize));
    }

    @GetMapping("/getLeagueDetail.json")
    public ResponseVo getLeagueDetail(@NotNull String detailId) {
        return ResponseUtility.buildSuccessResponse(leagueService.getLeagueDetail(detailId));
    }

    @GetMapping("/getLeaguePlayer.json")
    public ResponseVo getLeaguePlayer(@NotNull Integer playerId) {
        return ResponseUtility.buildSuccessResponse(leagueService.getLeaguePlayer(playerId));
    }

    @GetMapping("/getLeagueTeam.json")
    public ResponseVo getLeagueTeam(@NotNull Integer pageNum, @NotNull Integer pageSize) {
        return ResponseUtility.buildSuccessResponse(leagueService.getLeagueTeam(pageNum, pageSize));
    }
}
