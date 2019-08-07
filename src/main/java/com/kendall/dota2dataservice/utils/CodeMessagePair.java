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

/**
 * 业务代码和消息的二元组
 *
 * @since 2017/5/18
 */
public interface CodeMessagePair {

    /**
     * 获得预先定义的错误码
     *
     * @return
     */
    String getCode();


    /**
     * 获得用户友好的消息提示
     *
     * @return
     */
    String getMessage();

}
