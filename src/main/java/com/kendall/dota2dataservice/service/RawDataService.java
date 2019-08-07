package com.kendall.dota2dataservice.service;

import com.kendall.dota2dataservice.pojo.vo.HeroVo;
import com.kendall.dota2dataservice.pojo.vo.ItemVo;

import java.util.List;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/31
 */
public interface RawDataService {
    List<HeroVo> getHeroList();

    List<ItemVo> getItemList();
}
