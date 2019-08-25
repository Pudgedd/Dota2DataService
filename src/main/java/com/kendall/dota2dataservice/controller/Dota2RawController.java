package com.kendall.dota2dataservice.controller;

import com.kendall.dota2dataservice.pojo.ResponseVo;
import com.kendall.dota2dataservice.service.RawDataService;
import com.kendall.dota2dataservice.utils.ResponseUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

/**
 * @description:元数据：英雄、道具、技能
 * @author: kendall
 * @since: 2019/7/31
 */
@Validated
@RestController
@RequestMapping("/raw/")
public class Dota2RawController {
    @Autowired
    private RawDataService rawDataService;

    @GetMapping("/v1/getHeroList.json")
    public ResponseVo getHeroListV1() {
        return ResponseUtility.buildSuccessResponse(rawDataService.getHeroList());
    }

    @GetMapping("/v1/getItemList.json")
    public ResponseVo getItemListV1() {
        return ResponseUtility.buildSuccessResponse(rawDataService.getItemList());
    }

    @GetMapping("/v2/getHeroList.json")
    public ResponseVo getHeroListV2() {
        return ResponseUtility.buildSuccessResponse(rawDataService.getHeroListV2());
    }

    @GetMapping("/v2/getItemList.json")
    public ResponseVo getItemListV2() {
        return ResponseUtility.buildSuccessResponse(rawDataService.getItemListV2());
    }

    @GetMapping("/getHeroDetail.json")
    public ResponseVo getHeroDetail(@NotNull Integer heroId) {
        return ResponseUtility.buildSuccessResponse(rawDataService.getHeroDetail(heroId));
    }
}
