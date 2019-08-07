package com.kendall.dota2dataservice.pojo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/31
 */
@NoArgsConstructor
@Data
public class HeroVo {

    /**
     * attack_type : Melee
     * cn_name : 敌法师
     * cn_roles : ["核心","逃生","爆发"]
     * en_name : Anti-Mage
     * en_roles : ["Carry","Escape","Nuker"]
     * hero_id : 1
     * hero_name : npc_dota_hero_antimage
     * legs : 2
     * primary_attr : agi
     */

    private String attack_type;
    private String cn_name;
    private String en_name;
    private int hero_id;
    private String hero_name;
    private int legs;
    private String primary_attr;
    private List<String> cn_roles;
    private List<String> en_roles;
}
