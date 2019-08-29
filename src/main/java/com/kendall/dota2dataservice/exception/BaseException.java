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

package com.kendall.dota2dataservice.exception;

import com.kendall.dota2dataservice.common.constant.ErrorType;
import com.kendall.dota2dataservice.pojo.vo.ResponseVo;
import com.kendall.dota2dataservice.utils.CodeMessagePair;
import com.kendall.dota2dataservice.utils.Responsable;

/**
 * @description: 基础异常
 * @author: kendall
 * @since: 2019/2/5
 */
public abstract class BaseException extends Exception implements CodeMessagePair {

    private final CodeMessagePair codeMessagePair;

    private Responsable data;

    /**
     * @param message 给程序员定位问题用的message
     */
    protected BaseException(String message) {
        super(message);
        this.codeMessagePair = ErrorType.COMMON_ERROR_CODE;
    }

    /**
     * @param message 给程序员定位问题用的message
     * @param cause
     */
    protected BaseException(String message, Throwable cause) {
        super(message, cause);
        this.codeMessagePair = ErrorType.COMMON_ERROR_CODE;
    }

    /**
     * @param codeMessagePair 预定义的code和提示给用户的message
     * @param message         给程序员定位问题用的message
     */
    protected BaseException(CodeMessagePair codeMessagePair, String message) {
        super(message);
        this.codeMessagePair = codeMessagePair;
    }

    /**
     * @param codeMessagePair 预定义的code和提示给用户的message
     * @param message         给程序员定位问题用的message
     * @param cause
     */
    protected BaseException(CodeMessagePair codeMessagePair, String message, Throwable cause) {
        super(message, cause);
        this.codeMessagePair = codeMessagePair;
    }

    @Override
    public String getMessage() {
        return codeMessagePair.getMessage();
    }

    @Override
    public String getCode() {
        return codeMessagePair.getCode();
    }
    
    public CodeMessagePair getCodeMessagePair() {
        return codeMessagePair;
    }

    public Responsable getData() {
        return data;
    }

    /**
     * 在出错响应的data里加数据
     *
     * @param data
     */
    public void setData(Responsable data) {
        this.data = data;
    }

    /**
     * 返回异常对应的ResponseVo，该vo的序列化后的String就是http response body
     *
     * @return
     */
    public ResponseVo<Responsable> toResponseVo(){
        return new ResponseVo<Responsable>(this.getCode(),this.getMessage(),data);
    }
}
