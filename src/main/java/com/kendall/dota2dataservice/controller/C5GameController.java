package com.kendall.dota2dataservice.controller;

import com.kendall.dota2dataservice.pojo.bean.StoreOptionBean;
import com.kendall.dota2dataservice.service.C5GameApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: kendall
 * @since: 2019/9/14
 */
@RestController
public class C5GameController {
    @Autowired
    private C5GameApiService c5GameApiService;

    @GetMapping(value = "/c5/getOptionList.json")
    public String getOptionList() throws Exception {
        return c5GameApiService.getOptionList();
    }

    @GetMapping(value = "/c5/getStoreList.json")
    public String getOptionList(StoreOptionBean option) throws Exception {
        return c5GameApiService.getStoreList(option);
    }
}
