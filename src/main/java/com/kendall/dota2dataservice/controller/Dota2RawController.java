package com.kendall.dota2dataservice.controller;

import com.kendall.dota2dataservice.pojo.ResponseVo;
import com.kendall.dota2dataservice.service.RawDataService;
import com.kendall.dota2dataservice.utils.ResponseUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/31
 */
@Validated
@RestController
@RequestMapping("/raw/")
public class Dota2RawController {
    @Autowired
    private RawDataService rawDataService;

    @GetMapping("/getHeroList.json")
    public ResponseVo getHeroList() {
        return ResponseUtility.buildSuccessResponse(rawDataService.getHeroList());
    }

    @GetMapping("/getItemList.json")
    public ResponseVo getItemList() {
        return ResponseUtility.buildSuccessResponse(rawDataService.getItemList());
    }
}
