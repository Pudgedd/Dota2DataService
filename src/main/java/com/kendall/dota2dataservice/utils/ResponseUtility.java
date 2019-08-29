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

package com.kendall.dota2dataservice.utils;

import com.google.common.reflect.TypeParameter;
import com.google.common.reflect.TypeToken;
import com.kendall.dota2dataservice.common.constant.CommonConstants;
import com.kendall.dota2dataservice.exception.SystemException;
import com.kendall.dota2dataservice.pojo.vo.ResponseVo;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.Map;

/**
 * 用于生产符合现有HTTP接口标准的json响应体
 */
public class ResponseUtility {

    /**
     * 生成失败的Json响应
     *
     * @param respCode 响应码
     * @param respMsg  响应提示消息
     * @return 符合当前http api接口规范的json响应
     */
    public static ResponseVo buildErrorResponse(String respCode, String respMsg) {
        ResponseVo repsVO = new ResponseVo<>();
        repsVO.setRespCode(respCode);
        repsVO.setRespMsg(respMsg);

        return repsVO;
    }

    /**
     * 生成失败的Json响应
     *
     * @param codeMessagePair
     * @return 符合当前http api接口规范的json响应
     */
    public static ResponseVo buildErrorResponse(CodeMessagePair codeMessagePair) {
        ResponseVo repsVO = new ResponseVo<>();
        repsVO.setRespCode(codeMessagePair.getCode());
        repsVO.setRespMsg(codeMessagePair.getMessage());

        return repsVO;
    }

    /**
     * 快速生成成功的Json响应，没有data参数
     *
     * @return 符合当前http api接口规范的json响应
     */
    public static ResponseVo buildSuccessResponse() {
        ResponseVo repsVO = new ResponseVo<>();
        repsVO.setRespCode(CommonConstants.COMMON_SUCCESS_CODE);
        repsVO.setRespMsg(CommonConstants.COMMON_SUCCESS_MESSAGE);

        return repsVO;
    }

    /**
     * 生成成功的Json响应
     *
     * @param dataMap 响应数据
     * @return 符合当前http api接口规范的json响应
     */
    public static ResponseVo<Map<String, ?>> buildSuccessResponse(Map<String, ?> dataMap) {
        ResponseVo<Map<String, ?>> repsVO = new ResponseVo<>();
        repsVO.setRespCode(CommonConstants.COMMON_SUCCESS_CODE);
        repsVO.setRespMsg(CommonConstants.COMMON_SUCCESS_MESSAGE);
        repsVO.setData(dataMap);

        return repsVO;
    }

    /**
     * 生成成功的Json响应
     *
     * @param dataList 响应数据
     * @return 符合当前http api接口规范的json响应
     */
    public static ResponseVo<List<?>> buildSuccessResponse(List<?> dataList) {
        ResponseVo<List<?>> repsVO = new ResponseVo<>();
        repsVO.setRespCode(CommonConstants.COMMON_SUCCESS_CODE);
        repsVO.setRespMsg(CommonConstants.COMMON_SUCCESS_MESSAGE);
        repsVO.setData(dataList);

        return repsVO;
    }

    /**
     * 生成成功的Json响应
     *
     * @param dataList 响应数据
     * @param total    分页所在父集合的size
     * @return 符合当前http api接口规范的json响应
     */
    public static ResponseVo<List<?>> buildSuccessResponse(List<?> dataList, long total) {
        ResponseVo<List<?>> repsVO = new ResponseVo<>();
        repsVO.setRespCode(CommonConstants.COMMON_SUCCESS_CODE);
        repsVO.setRespMsg(CommonConstants.COMMON_SUCCESS_MESSAGE);
        repsVO.setTotal(total);
        repsVO.setData(dataList);

        return repsVO;
    }

    /**
     * 生成成功的Json响应
     *
     * @param numberData 响应数据
     * @return 符合当前http api接口规范的json响应
     */
    public static <T extends Number> ResponseVo<T> buildSuccessResponse(T numberData) {
        ResponseVo<T> repsVO = new ResponseVo<>();
        repsVO.setRespCode(CommonConstants.COMMON_SUCCESS_CODE);
        repsVO.setRespMsg(CommonConstants.COMMON_SUCCESS_MESSAGE);
        repsVO.setData(numberData);

        return repsVO;
    }

    /**
     * 生成成功的Json响应
     *
     * @param stringData 响应数据
     * @return 符合当前http api接口规范的json响应
     */
    public static ResponseVo<String> buildSuccessResponse(String stringData) {
        ResponseVo<String> repsVO = new ResponseVo<>();
        repsVO.setRespCode(CommonConstants.COMMON_SUCCESS_CODE);
        repsVO.setRespMsg(CommonConstants.COMMON_SUCCESS_MESSAGE);
        repsVO.setData(stringData);

        return repsVO;
    }

    /**
     * 生成成功的Json响应
     *
     * @param boolData 响应数据
     * @return 符合当前http api接口规范的json响应
     */
    public static ResponseVo<Boolean> buildSuccessResponse(Boolean boolData) {
        ResponseVo<Boolean> repsVO = new ResponseVo<>();
        repsVO.setRespCode(CommonConstants.COMMON_SUCCESS_CODE);
        repsVO.setRespMsg(CommonConstants.COMMON_SUCCESS_MESSAGE);
        repsVO.setData(boolData);

        return repsVO;
    }

    /**
     * 生成成功的Json响应
     *
     * @param responseData 响应数据
     * @return 符合当前http api接口规范的json响应
     */
    public static <T extends Responsable> ResponseVo<T> buildSuccessResponse(T responseData) {
        ResponseVo<T> repsVO = new ResponseVo<>();
        repsVO.setRespCode(CommonConstants.COMMON_SUCCESS_CODE);
        repsVO.setRespMsg(CommonConstants.COMMON_SUCCESS_MESSAGE);
        repsVO.setData(responseData);

        return repsVO;
    }

    /**
     * 解析标准响应返回值json，判code，成功则返回data
     *
     * @param json
     * @param dataClass
     * @param <T>
     * @return
     * @throws SystemException
     */
    public static <T> T parseData(String json, Class<T> dataClass) throws SystemException {
        final ResponseVo<T> responseVo = parseResponse(json, dataClass);

        checkResponseCode(responseVo.getRespCode(), new CodeMessagePair() {
            @Override
            public String getCode() {
                return responseVo.getRespCode();
            }

            @Override
            public String getMessage() {
                return responseVo.getRespMsg();
            }
        });

        return responseVo.getData();
    }

    /**
     * 解析标准响应返回值json，判code，成功则返回data，其中data为List
     *
     * @param json
     * @param dataListItemClass
     * @param <T>
     * @return
     * @throws SystemException
     */
    public static <T> List<T> parseDataWithListData(String json, Class<T> dataListItemClass) throws SystemException {
        final ResponseVo<List<T>> responseVo = parseResponseWithListData(json, dataListItemClass);

        checkResponseCode(responseVo.getRespCode(), new CodeMessagePair() {
            @Override
            public String getCode() {
                return responseVo.getRespCode();
            }

            @Override
            public String getMessage() {
                return responseVo.getRespMsg();
            }
        });

        return responseVo.getData();
    }

    /**
     * 解析标准响应返回值json，判code，成功则返回data，其中data为Map
     *
     * @param json
     * @param dataMapValueClass
     * @param <T>
     * @return
     * @throws SystemException
     */
    public static <T> Map<String, T> parseDataWithMapData(String json, Class<T> dataMapValueClass) throws SystemException {
        final ResponseVo<Map<String, T>> responseVo = ResponseUtility.parseResponseWithMapData(json, dataMapValueClass);

        checkResponseCode(responseVo.getRespCode(), new CodeMessagePair() {
            @Override
            public String getCode() {
                return responseVo.getRespCode();
            }

            @Override
            public String getMessage() {
                return responseVo.getRespMsg();
            }
        });

        return responseVo.getData();
    }

    /**
     * 解析标准响应json为ResponseVo
     *
     * @param json      标准响应json
     * @param dataClass ResponseVo中data的类型的Class
     * @param <T>       ResponseVo中data的类型
     * @return 解析后的 {@code ResponseVo<T>}
     */
    public static <T> ResponseVo<T> parseResponse(String json, Class<T> dataClass) {
        TypeToken<ResponseVo<T>> tTypeToken =
                new TypeToken<ResponseVo<T>>() {
                }.where(new TypeParameter<T>() {
                }, TypeToken.of(dataClass));

        return JsonUtils.stringToTypeOfT(json, tTypeToken.getType());
    }

    /**
     * 解析标准响应json为 {@code ResponseVo<List<T>>}，其中data是一个 {@code List<T>}
     *
     * @param json              标准响应json
     * @param dataListItemClazz ResponseVo中data的List中的元素类型的Class
     * @param <T>               ResponseVo中data的List中的元素类型
     * @return 解析后的 {@code ResponseVo<List<T>>}
     */
    public static <T> ResponseVo<List<T>> parseResponseWithListData(String json, Class<T> dataListItemClazz) {
        TypeToken<ResponseVo<List<T>>> tTypeToken =
                new TypeToken<ResponseVo<List<T>>>() {
                }.where(new TypeParameter<T>() {
                }, TypeToken.of(dataListItemClazz));

        return JsonUtils.stringToTypeOfT(json, tTypeToken.getType());
    }

    /**
     * 解析标准响应json为 {@code ResponseVo<Map<String, T>>}，其中data是一个 {@code <Map<String, T>}
     *
     * @param json              标准响应json
     * @param dataMapValueClazz ResponseVo中data的Map中的值类型的Class
     * @param <T>               ResponseVo中data的Map中的值类型
     * @return 解析后的 {@code ResponseVo<Map<String, T>>}
     */
    public static <T> ResponseVo<Map<String, T>> parseResponseWithMapData(String json, Class<T> dataMapValueClazz) {
        TypeToken<ResponseVo<Map<String, T>>> tTypeToken =
                new TypeToken<ResponseVo<Map<String, T>>>() {
                }.where(new TypeParameter<T>() {
                }, TypeToken.of(dataMapValueClazz));

        return JsonUtils.stringToTypeOfT(json, tTypeToken.getType());
    }

    private static void checkResponseCode(String respCode, CodeMessagePair codeMessagePair, String... messages) throws SystemException {
        if (!CommonConstants.COMMON_SUCCESS_CODE.equals(respCode)) {
            String detailMessage = ArrayUtils.isEmpty(messages) ? "Response code not success" + respCode : StringUtils.join(messages);
            throw new SystemException(codeMessagePair, detailMessage);
        }
    }
}
