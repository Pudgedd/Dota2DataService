package com.kendall.dota2dataservice.utils;

import com.kendall.dota2dataservice.exception.BusinessException;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @description: 断言工具类
 * @author: kendall
 * @since: 2019/2/5
 */
public class AssertUtil {

    /**
     * 断言条件是否为true，如果不为true，抛出给定code/message的异常
     *
     * @param condition
     * @param codeMessagePair
     * @param messages message for debug,同创建
     * @throws BusinessException
     */
    public static void assertTrue(boolean condition, CodeMessagePair codeMessagePair, String... messages) throws
            BusinessException {
        if (!condition) {
            String detailMessage = ArrayUtils.isEmpty(messages) ? "Assert failed!" : StringUtils.join(messages);
            throw new BusinessException(codeMessagePair, detailMessage);
        }
    }

    /**
     * 断言条件是否为true，如果不为true，抛出给定code/message的异常
     *
     * @param condition
     * @param codeMessagePair
     * @param data 需要在异常响应带上的数据
     * @param messages message for debug,同创建
     * @throws BusinessException
     */
    public static void assertTrue(boolean condition, CodeMessagePair codeMessagePair, Responsable data,
                                  String... messages) throws BusinessException {
        if (!condition) {
            String detailMessage = ArrayUtils.isEmpty(messages) ? "Assert failed!" : StringUtils.join(messages);
            BusinessException businessException =  new BusinessException(codeMessagePair, detailMessage);
            businessException.setData(data);
            throw  businessException;
        }
    }

    /**
     * 断言对象不为空
     *
     * @param object
     * @param codeMessagePair
     * @param messages
     * @throws BusinessException
     */
    public static void assertNotNull(Object object, CodeMessagePair codeMessagePair, String... messages) throws
            BusinessException {
        assertTrue(object != null, codeMessagePair, messages);
    }
}
