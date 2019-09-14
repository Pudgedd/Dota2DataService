package com.kendall.dota2dataservice.service;

import com.kendall.dota2dataservice.pojo.bean.StoreOptionBean;

/**
 * @description:
 * @author: kendall
 * @since: 2019/9/14
 */
public interface C5GameApiService {

    /**
     * 获取饰品查询规则
     * @return
     * @throws Exception
     */
    String getOptionList() throws Exception;

    /**
     * 获取饰品
     *
     * @param optionBean
     * @return
     */
    String getStoreList(StoreOptionBean optionBean) throws Exception;
}
