package com.kendall.dota2dataservice.controller;

import com.kendall.dota2dataservice.service.MaxApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/26
 */
@RestController
public class MaxApiController {
    @Autowired
    private MaxApiService maxApiService;

    @GetMapping(value = "/max/getHeroDetail.json")
    public String getHeroDetail(String name) throws Exception {
        return maxApiService.getHeroDetail(name);
    }

    @GetMapping(value = "/max/getHeroStat.json")
    public String getHeroStat() throws Exception {
        return maxApiService.getHeroStat();
    }

    @GetMapping(value = "/max/getItemStat.json")
    public String getItemStat() throws Exception {
        return maxApiService.getItemStat();
    }

    @GetMapping(value = "/max/getItemDetail.json")
    public String getItemDetail(String name) throws Exception {
        return maxApiService.getItemDetail(name);
    }

    @GetMapping(value = "/max/getLeagueList.json")
    public String getLeagueList(Integer offset, Integer limit) throws Exception {
        return maxApiService.getLeagueList(offset, limit);
    }

    @GetMapping(value = "/max/getLeagueMatches.json")
    public String getLeagueMatches(String leagueId) throws Exception {
        return maxApiService.getLeagueMatches(leagueId);
    }

    @GetMapping(value = "/max/getVerifiedList.json")
    public String getVerifiedList(Integer offset, Integer limit) throws Exception {
        return maxApiService.getVerifiedList(offset, limit);
    }
}
