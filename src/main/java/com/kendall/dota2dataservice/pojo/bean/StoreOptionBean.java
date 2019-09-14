package com.kendall.dota2dataservice.pojo.bean;

import com.kendall.dota2dataservice.utils.JsonUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: kendall
 * @since: 2019/9/14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StoreOptionBean {
    private String price;
    private String only;
    private String page;
    private String rarity;
    private String hero;
    private String quality;
    private String type;
    private String tag;
    private String exterior;

    @Override
    public String toString() {
        return JsonUtils.objectToJsonString(this);
    }
}
