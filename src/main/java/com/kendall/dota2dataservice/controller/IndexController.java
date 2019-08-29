package com.kendall.dota2dataservice.controller;

import com.kendall.dota2dataservice.pojo.vo.ResponseVo;
import com.kendall.dota2dataservice.utils.ResponseUtility;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/14
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public ResponseVo health() {
        return ResponseUtility.buildSuccessResponse("我运行的很好～");
    }
}
