/*
 *  CMB Confidential
 *
 *  Copyright (C) 2018 China Merchants Bank Co., Ltd. All rights reserved.
 *
 *  No part of this file may be reproduced or transmitted in any form or by any
 *  means, electronic, mechanical, photocopying, recording, or otherwise, without
 *  prior written permission of China Merchants Bank Co., Ltd.
 *
 */

package com.kendall.dota2dataservice.common.constant;

import com.kendall.dota2dataservice.utils.CodeMessagePair;

/**
 * fundata异常类型
 */
public enum FunDataErrorType implements CodeMessagePair {

    /**
     * 通用异常
     */
    COMMON_ERROR_CODE("1001", "系统维护中"),
    GET_LEAGUE_LIST_ERROR("10001", "获取赛事列表失败");

    private final String code;
    private final String message;

    FunDataErrorType(String code, String description) {
        this.code = code;
        this.message = description;
    }

    /**
     * 根据code获取message
     *
     * @param code
     * @return
     */
    public static FunDataErrorType get(String code) {
        FunDataErrorType[] list = values();

        for (FunDataErrorType errorType : list) {
            if (code.equalsIgnoreCase(errorType.getCode())) {
                return errorType;
            }
        }

        return null;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}