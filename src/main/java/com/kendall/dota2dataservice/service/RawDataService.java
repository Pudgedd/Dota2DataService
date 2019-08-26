package com.kendall.dota2dataservice.service;

import com.kendall.dota2dataservice.pojo.model.Hero;
import com.kendall.dota2dataservice.pojo.model.Item;
import com.kendall.dota2dataservice.pojo.vo.HeroDetailVo;
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

    List<Hero> getHeroListV2();

    List<Item> getItemListV2();

    HeroDetailVo getHeroDetail(String name);

    Item getItemDetail(Integer itemId);
}
