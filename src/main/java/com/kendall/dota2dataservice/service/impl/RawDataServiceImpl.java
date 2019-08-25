package com.kendall.dota2dataservice.service.impl;

import com.google.common.collect.Lists;
import com.google.common.reflect.TypeToken;
import com.kendall.dota2dataservice.common.config.Dota2Properties;
import com.kendall.dota2dataservice.dao.HeroMapper;
import com.kendall.dota2dataservice.dao.ItemMapper;
import com.kendall.dota2dataservice.dao.SkillMapper;
import com.kendall.dota2dataservice.fundata.exception.ClientException;
import com.kendall.dota2dataservice.fundata.executor.pub.Dota2RawExecutor;
import com.kendall.dota2dataservice.pojo.ResponseVo;
import com.kendall.dota2dataservice.pojo.model.Hero;
import com.kendall.dota2dataservice.pojo.model.Item;
import com.kendall.dota2dataservice.pojo.model.Skill;
import com.kendall.dota2dataservice.pojo.vo.AttributeVo;
import com.kendall.dota2dataservice.pojo.vo.HeroDetailVo;
import com.kendall.dota2dataservice.pojo.vo.HeroVo;
import com.kendall.dota2dataservice.pojo.vo.ItemVo;
import com.kendall.dota2dataservice.service.RawDataService;
import com.kendall.dota2dataservice.utils.JsonUtils;
import com.kendall.dota2dataservice.utils.ResponseUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/31
 */
@Service
public class RawDataServiceImpl implements RawDataService, InitializingBean {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    private Dota2RawExecutor executor;

    @Autowired
    private Dota2Properties properties;
    @Autowired
    private HeroMapper heroMapper;
    @Autowired
    private ItemMapper itemMapper;
    @Autowired
    private SkillMapper skillMapper;

    @Override
    public List<HeroVo> getHeroList() {
        try {
            String respStr = executor.getRawHero();
            ResponseVo<List<HeroVo>> result = ResponseUtility.parseResponseWithListData(respStr, HeroVo.class);

            return result.getData();
        } catch (ClientException e) {
            log.error("getHeroList error", e);
        }
        return Lists.newArrayList();
    }

    @Override
    public List<ItemVo> getItemList() {
        try {
            String respStr = executor.getRawItem();
            ResponseVo<List<ItemVo>> result = ResponseUtility.parseResponseWithListData(respStr, ItemVo.class);
            return result.getData();
        } catch (ClientException e) {
            log.error("getItemList error", e);
        }
        return Lists.newArrayList();
    }

    @Override
    public List<Hero> getHeroListV2() {
        List<Hero> heroes = heroMapper.selectAll();
        return heroes;
    }

    @Override
    public List<Item> getItemListV2() {
        return itemMapper.selectAll();
    }

    @Override
    public HeroDetailVo getHeroDetail(Integer heroId) {
        Hero hero = heroMapper.selectByPrimaryKey(heroId);
        List<Skill> skills = skillMapper.selectByHeroId(heroId);

        HeroDetailVo heroDetailVo = new HeroDetailVo();
        String attribs = hero.getAttribs();
        AttributeVo attributeVo = JsonUtils.stringToTypeOfT(attribs, new TypeToken<AttributeVo>() {
        }.getType());

        BeanUtils.copyProperties(hero, heroDetailVo);
        heroDetailVo.setAttribute(attributeVo);
        heroDetailVo.setSkills(skills);

        return heroDetailVo;
    }

    @Override
    public Item getItemDetail(Integer itemId) {
        return itemMapper.selectByPrimaryKey(itemId);

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.executor = new Dota2RawExecutor(properties.getKey(), properties.getSecret());
    }

}
