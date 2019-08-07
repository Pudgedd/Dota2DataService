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

import com.kendall.dota2dataservice.utils.CodeMessagePair;

/**
 * @description: 业务异常
 * @author: kendall
 * @since: 2019/2/5
 */
public class BusinessException extends BaseException {

    /**
     *
     * @param message 给程序员定位问题用的message
     */
    public BusinessException(String message) {
        super(message);
    }

    /**
     *
     * @param message 给程序员定位问题用的message
     * @param cause
     */
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     *
     * @param codeMessagePair 预定义的code和提示给用户的message
     * @param message 给程序员定位问题用的message
     */
    public BusinessException(CodeMessagePair codeMessagePair, String message) {
        super(codeMessagePair, message);
    }

    /**
     *
     * @param codeMessagePair 预定义的code和提示给用户的message
     * @param message 给程序员定位问题用的message
     * @param cause
     */
    public BusinessException(CodeMessagePair codeMessagePair, String message, Throwable cause) {
        super(codeMessagePair, message, cause);
    }

}