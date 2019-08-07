package com.kendall.dota2dataservice.service.impl;

import com.google.common.collect.Lists;
import com.kendall.dota2dataservice.common.config.Dota2Properties;
import com.kendall.dota2dataservice.fundata.exception.ClientException;
import com.kendall.dota2dataservice.fundata.executor.pub.Dota2RawExecutor;
import com.kendall.dota2dataservice.pojo.ResponseVo;
import com.kendall.dota2dataservice.pojo.vo.HeroVo;
import com.kendall.dota2dataservice.pojo.vo.ItemVo;
import com.kendall.dota2dataservice.service.RawDataService;
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
 * @since: 2019/7/31
 */
@Service
public class RawDataServiceImpl implements RawDataService, InitializingBean {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Dota2Properties properties;

    private Dota2RawExecutor executor;

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
    public void afterPropertiesSet() throws Exception {
        this.executor = new Dota2RawExecutor(properties.getKey(), properties.getSecret());
    }

}
