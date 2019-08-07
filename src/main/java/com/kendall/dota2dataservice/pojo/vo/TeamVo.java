package com.kendall.dota2dataservice.pojo.vo;

import com.kendall.dota2dataservice.utils.Responsable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/30
 */
@NoArgsConstructor
@Data
public class TeamVo implements Responsable {
    /**
     * id : 2626685
     * name : KG
     * intro : 原EHOME俱乐部旗下青训队EHOME.KEEN，于2017年9月分离出EHOME俱乐部独立，曾获VPCL S1第1，VPL第4，PGL第4
     * full_name : Keen Gaming
     * region : CN
     * nation : CN
     */

    private int id;
    private String name;
    private String intro;
    private String full_name;
    private String region;
    private String nation;
}
