package com.kendall.dota2dataservice.pojo.bean;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/1
 */
@NoArgsConstructor
@Data
public class ItemBean extends BaseBean{
    /**
     * id : 1
     * img : blink_lg.png?3
     * name : blink
     * dname : 闪烁匕首
     * qual : component/common/secret_shop
     * cost : 2250
     * desc : <h1>主动：闪烁</h1>传送到最远1200距离的位置。<br><br>受到来自敌方英雄或肉山的攻击时，闪烁匕首将在3秒内无法使用。
     * notes : 快速点击两次会将自己往己方泉水方向传送。<br />如果闪烁传送的距离超过最长施法距离，那么只能传送到最长距离的4/5。
     * attrib :
     * mc : false
     * cd : 15
     * lore : 传说中这片大陆上来去如风的刺客使用的匕首。
     * components : null
     * created : false
     */

    private int id;
    private String img;
    @SerializedName(alternate = "dname", value = "localName")
    private String localName;
    private String qual;
    private int cost;
    private String desc;
    private String notes;
    private String attrib;
    private String mc;
    private String cd;
    private String lore;
    private Object components;
    private boolean created;
    private Date createTime;
    private Date updateTime;
}