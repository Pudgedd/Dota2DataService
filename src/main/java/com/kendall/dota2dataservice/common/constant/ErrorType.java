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
 * 异常类型
 *
 * @since 2016/7/4
 */
public enum ErrorType implements CodeMessagePair {

    COMMON_ERROR_CODE("1001", "系统维护中"),

    RESPONSE_ERROR_CODE("1002", "第三方系统返回码不正确"),

    //数据库操作相关code
    DB_RESULT_QUERY_EMPTY("1501", "数据库查询结果为空"),

    DB_OPERATION_EXCEPTION("1502", "数据库操作异常"),

    DB_RESULT_QUERY_MORE("1503", "期望查询结果是一条，实际查询结果是多条"),

    DB_INSERT_DUPLICATE_KEY("1504", "数据库重复插入"),
    
    DB_UPDATE_EMPTY_RECORD("1505", "数据库更新操作没有找到合适的记录"),

    URL_ENCODE_ERR("1801", "URL编码失败."),

    AES_DECRYPT_ERR("1810", "Aes解密失败"),

    AES_ENCRYPT_ERR("1811", "Aes加密失败"),

    VERIFY_SIGN_ERR("1812", "验证签名失败."),

    SIGNATURE_ERR("1813", "生成签名失败."),

    ENCRYPT_ERR("1814", "加密失败."),

    DECRYPT_ERR("1815", "解密失败."),

    REDIS_LOCK_ERR("1816", "操作失败"),

    //参数校验相关
    TIMESTAMP_EXPIRED("1831", "时间戳无效"),

    CALL_INTERFACE_ERROR("1832", "接口调用失败"),

    CUSTOMER_NO_BIND("1440", "客户未绑定"),

    CUSTOMER_NO_FOLLOW("1441", "客户未关注"),

    OAUTH_CHECK_ERR("1451", "Oauth验签失败"),

    CHANNEL_NOT_SUPPOERTED("2002", "当前渠道不支持"),

    MSGTYPE_NOT_SUPPORTED("2003", "消息类型不支持"),

    VALIDATE_ERROR("9501", "参数校验错误"),

    OPENID_INVALID("9502", "渠道openId不合法"),

    SFTP_DOWNLOAD_ERROR("9503", "sftp下载文件出错"),

    SFTP_UPLOAD_ERROR("9504", "sftp上传文件出错");

    private final String code;
    private final String message;

    ErrorType(String code, String description) {
        this.code = code;
        this.message = description;
    }

    public static ErrorType get(String code) {
        ErrorType[] list = values();

        for (ErrorType errorType : list) {
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