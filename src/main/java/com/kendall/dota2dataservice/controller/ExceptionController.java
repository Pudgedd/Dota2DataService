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

package com.kendall.dota2dataservice.controller;

import com.kendall.dota2dataservice.common.constant.ErrorType;
import com.kendall.dota2dataservice.exception.BusinessException;
import com.kendall.dota2dataservice.exception.SystemException;
import com.kendall.dota2dataservice.exception.ValidationException;
import com.kendall.dota2dataservice.pojo.vo.ResponseVo;
import com.kendall.dota2dataservice.utils.ResponseUtility;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.proxy.UndeclaredThrowableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolationException;

/**
 * 处理controller抛出的异常
 */
@ControllerAdvice
public class ExceptionController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionController.class);

    /**
     * 拦截捕捉自定义异常 ConstraintViolationException.class
     *
     * @param exception
     * @return
     */
    @ExceptionHandler(value = ConstraintViolationException.class)
    @ResponseBody
    public ResponseVo ConstraintViolationExceptionHandler(ConstraintViolationException exception) {

        return ResponseUtility.buildErrorResponse(ErrorType.VALIDATE_ERROR.getCode(), exception.getMessage());
    }

    /**
     * 处理controller中抛出的MethodArgumentNotValidException
     *
     * @param exception 异常
     * @return 返回码
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseVo handleMethodArgumentNotValidException(final MethodArgumentNotValidException exception) {
        LOGGER.warn("enter exception controller with MethodArgumentNotValidException exception. message:" + exception.getMessage(), exception);
        String messages = "";
        for (ObjectError objectError : exception.getBindingResult().getAllErrors()) {
            messages = messages + objectError.getDefaultMessage() + " ";

        }
        return ResponseUtility.buildErrorResponse(ErrorType.VALIDATE_ERROR.getCode(), messages);
    }

    /**
     * 处理controller中抛出的SystemException
     *
     * @param exception 异常
     * @return 返回码
     */
    @ExceptionHandler(value = SystemException.class)
    @ResponseBody
    public ResponseVo handleControllerSystemException(final SystemException exception) {
        LOGGER.error("enter exception controller with SystemException exception. message:" + exception.getMessage(), exception);
        return exception.toResponseVo();
    }

    /**
     * 处理controller中抛出的BusinessException
     *
     * @param exception 异常
     * @return 返回码
     */
    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public ResponseVo handleControllerBusinessException(final BusinessException exception) {
        LOGGER.warn("enter exception controller with BusinessException exception. message:" + exception.getMessage(), exception);
        return exception.toResponseVo();
    }

    /**
     * 处理切面中抛出的exception, 切面中抛出的异常需用UndeclaredThrowableException处理
     *
     * @return 返回码
     */
    @ExceptionHandler(UndeclaredThrowableException.class)
    @ResponseBody
    public ResponseVo handleUndeclaredThrowableException(UndeclaredThrowableException exception) {
        LOGGER.warn("enter exception controller with UndeclaredThrowableException exception. message:" + exception.getMessage(), exception);
        Throwable throwable = exception.getUndeclaredThrowable();

        if (throwable instanceof ValidationException) {
            return ResponseUtility.buildErrorResponse(ErrorType.VALIDATE_ERROR.getCode(), throwable.getMessage());
        }

        return ResponseUtility.buildErrorResponse(ErrorType.VALIDATE_ERROR.getCode(), throwable.getMessage());
    }

    /**
     * 处理controller中抛出的ValidationException
     *
     * @param exception 异常
     * @return 返回码
     */
    @ExceptionHandler(value = ValidationException.class)
    @ResponseBody
    public ResponseVo handleValidationException(ValidationException exception) {
        LOGGER.warn("enter exception controller with constraintViolationException exception. message:" + exception.getMessage(), exception);

        return ResponseUtility.buildErrorResponse(ErrorType.VALIDATE_ERROR.getCode(), exception.getMessage());
    }

    /**
     * 处理controller中抛出的exception
     *
     * @param exception 异常
     * @return 返回码
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseVo handleControllerException(final Exception exception) {
        LOGGER.error("enter exception controller with exception. message:" + exception.getMessage(), exception);
        return ResponseUtility.buildErrorResponse(ErrorType.COMMON_ERROR_CODE);
    }

    /**
     * 处理controller中抛出的error
     *
     * @param error 异常
     * @return 返回码
     */
    @ExceptionHandler(value = Error.class)
    @ResponseBody
    public ResponseVo handleControllerError(final Error error) {
        LOGGER.error("enter exception controller with error. message:" + error.getMessage(), error);
        return ResponseUtility.buildErrorResponse(ErrorType.COMMON_ERROR_CODE);
    }
}
