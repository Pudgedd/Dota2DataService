package com.kendall.dota2dataservice.pojo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/31
 */
@NoArgsConstructor
@Data
public class ItemVo {
    /**
     * cost : 2250
     * id : 1
     * en_name : Blink Dagger
     * cn_name : 闪烁匕首
     * name : item_blink
     * recipe : 0
     * secret_shop : 0
     * side_shop : 1
     */

    private int cost;
    private int id;
    private String en_name;
    private String cn_name;
    private String name;
    private int recipe;
    private int secret_shop;
    private int side_shop;
}
