package com.kendall.dota2dataservice.pojo.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/27
 */
@NoArgsConstructor
@Data
public class MaxHeroDetail {
    /**
     * hero_a_win_rate : 48.8403
     * hero_attr : {"ArmorGain":"0.2000","ArmorPhysical":"-1","AttackAnimationPoint":"0.300000","AttackDamageMax":"33","AttackDamageMin":"29","AttackRate":"1.400000","AttackSpeedGain":"1.2500","AttributeAgilityGain":"3.200000","AttributeBaseAgility":"24","AttributeBaseIntelligence":"12","AttributeBaseStrength":"23","AttributeIntelligenceGain":"1.800000","AttributePrimary":"DOTA_ATTRIBUTE_AGILITY","AttributeStrengthGain":"1.300000","HealthGain":"18.0000","ManaGain":"12.0000","MovementGain":"0.1938","MovementSpeed":"310","MovementTurnRate":"0.500000","StatusHealth":"200.0000","StatusMana":"75.0000"}
     * hero_base_info : {"attribs":{"agi":{"b":22,"g":"2.80"},"armor":"2.0800","dmg":{"max":31,"min":27},"int":{"b":15,"g":"1.80"},"ms":315,"str":{"b":22,"g":"1.20"}},"dac":"近战","dname":"敌法师","droles":"核心 - 逃生 - 爆发","key_name":"antimage","name":"敌法师","pa":"agi","u":"Anti-Mage"}
     * hero_img : http://cdn.max-c.com/app/dota2/antimage@3x.png
     * hero_info : {"DOTA_ATTRIBUTE_AGILITY":true,"hero_id":1,"hero_name":"敌法师","img_name":"antimage"}
     * hero_items : [{"item_detail":145,"item_info":{"alternative_name":"狂战斧","cost":4400,"id":145,"img_name":"bfury","item_name":"狂战斧","name":"狂战斧","visable":1},"used_count":2617509,"used_count_percent":"100.0000","win_rate":"50.4283","win_rate_percent":"50.4283"},{"item_detail":147,"item_info":{"alternative_name":"幻影斧","cost":4700,"id":147,"img_name":"manta","item_name":"幻影斧","name":"幻影斧","visable":1},"used_count":2330653,"used_count_percent":"89.0409","win_rate":"56.4820","win_rate_percent":"56.4820"},{"item_detail":63,"item_info":{"alternative_name":"动力鞋","cost":1450,"id":63,"img_name":"power_treads","item_name":"动力鞋","name":"动力鞋","visable":1},"used_count":2185581,"used_count_percent":"83.4985","win_rate":"46.6224","win_rate_percent":"46.6224"},{"item_detail":208,"item_info":{"alternative_name":"深渊之刃","cost":6650,"id":208,"img_name":"abyssal_blade","item_name":"深渊之刃","name":"深渊之刃","visable":1},"used_count":1356205,"used_count_percent":"51.8128","win_rate":"67.7633","win_rate_percent":"67.7633"},{"item_detail":75,"item_info":{"alternative_name":"怨灵系带","cost":515,"id":75,"img_name":"wraith_band","item_name":"怨灵系带","name":"怨灵系带","visable":1},"used_count":982679,"used_count_percent":"37.5425","win_rate":"34.3388","win_rate_percent":"34.3388"},{"item_detail":139,"item_info":{"alternative_name":"蝴蝶","cost":5475,"id":139,"img_name":"butterfly","item_name":"蝴蝶","name":"蝴蝶","visable":1},"used_count":785929,"used_count_percent":"30.0258","win_rate":"74.0657","win_rate_percent":"74.0657"},{"item_detail":182,"item_info":{"alternative_name":"圆盾","cost":200,"id":182,"img_name":"stout_shield","item_name":"圆盾","name":"圆盾","visable":1},"used_count":716315,"used_count_percent":"27.3663","win_rate":"21.4679","win_rate_percent":"21.4679"},{"item_detail":116,"item_info":{"alternative_name":"黑皇杖","cost":4050,"id":116,"img_name":"black_king_bar","item_name":"黑皇杖","name":"黑皇杖","visable":1},"used_count":581281,"used_count_percent":"22.2074","win_rate":"52.6663","win_rate_percent":"52.6663"},{"item_detail":143,"item_info":{"alternative_name":"碎颅锤","cost":2950,"id":143,"img_name":"basher","item_name":"碎颅锤","name":"碎颅锤","visable":1},"used_count":551266,"used_count_percent":"21.0607","win_rate":"45.4015","win_rate_percent":"45.4015"}]
     * hero_name : antimage
     * match_count : 2858117
     * match_count_rank : 23
     * match_ups_enemy_best : [{"enemy_match_count":183643,"enemy_match_ups":"12.6545","enemy_match_ups_color":"green","enemy_match_ups_percent":"59.3002","enemy_win_rate":"48.9275","estimate_enemy_win_rate":"43.4315","estimate_team_win_rate":"54.2765","hero_b_info":{"DOTA_ATTRIBUTE_INTELLECT":true,"hero_id":22,"hero_name":"宙斯","img_name":"zuus"},"hero_b_win_rate":"55.4254","team_match_count":147786,"team_match_ups":"1.0198","team_match_ups_color":"green","team_match_ups_percent":"7.7047","team_win_rate":"54.8300"},{"enemy_match_count":43482,"enemy_match_ups":"9.6480","enemy_match_ups_color":"green","enemy_match_ups_percent":"45.2116","enemy_win_rate":"51.5317","estimate_enemy_win_rate":"46.9974","estimate_team_win_rate":"50.6865","hero_b_info":{"DOTA_ATTRIBUTE_STRENGTH":true,"hero_id":51,"hero_name":"发条技师","img_name":"rattletrap"},"hero_b_win_rate":"51.8456","team_match_count":44059,"team_match_ups":"3.4930","team_match_ups_color":"green","team_match_ups_percent":"26.3903","team_win_rate":"52.4569"},{"enemy_match_count":87267,"enemy_match_ups":"7.8784","enemy_match_ups_color":"green","enemy_match_ups_percent":"36.9189","enemy_win_rate":"48.3436","estimate_enemy_win_rate":"44.8131","estimate_team_win_rate":"52.8827","hero_b_info":{"DOTA_ATTRIBUTE_AGILITY":true,"hero_id":67,"hero_name":"幽鬼","img_name":"spectre"},"hero_b_win_rate":"54.0370","team_match_count":14823,"team_match_ups":"-4.8707","team_match_ups_color":"red","team_match_ups_percent":"36.7999","team_win_rate":"50.3070"},{"enemy_match_count":163495,"enemy_match_ups":"7.8039","enemy_match_ups_color":"green","enemy_match_ups_percent":"36.5697","enemy_win_rate":"55.3962","estimate_enemy_win_rate":"51.3861","estimate_team_win_rate":"46.3006","hero_b_info":{"DOTA_ATTRIBUTE_INTELLECT":true,"hero_id":17,"hero_name":"风暴之灵","img_name":"storm_spirit"},"hero_b_win_rate":"47.4559","team_match_count":118737,"team_match_ups":"-1.8116","team_match_ups_color":"red","team_match_ups_percent":"13.6870","team_win_rate":"45.4618"},{"enemy_match_count":128111,"enemy_match_ups":"7.1794","enemy_match_ups_color":"green","enemy_match_ups_percent":"33.6434","enemy_win_rate":"55.9421","estimate_enemy_win_rate":"52.1948","estimate_team_win_rate":"45.4963","hero_b_info":{"DOTA_ATTRIBUTE_INTELLECT":true,"hero_id":34,"hero_name":"修补匠","img_name":"tinker"},"hero_b_win_rate":"46.6489","team_match_count":125724,"team_match_ups":"2.1089","team_match_ups_color":"green","team_match_ups_percent":"15.9334","team_win_rate":"46.4557"}]
     * match_ups_enemy_worst : [{"enemy_match_count":54615,"enemy_match_ups":"-21.3397","enemy_match_ups_color":"red","enemy_match_ups_percent":"100.0000","enemy_win_rate":"35.2248","estimate_enemy_win_rate":"44.7809","estimate_team_win_rate":"52.9152","hero_b_info":{"DOTA_ATTRIBUTE_AGILITY":true,"hero_id":82,"hero_name":"米波","img_name":"meepo"},"hero_b_win_rate":"54.0693","team_match_count":42725,"team_match_ups":"-0.4999","team_match_ups_color":"red","team_match_ups_percent":"3.7767","team_win_rate":"52.6507"},{"enemy_match_count":211861,"enemy_match_ups":"-9.0016","enemy_match_ups_color":"red","enemy_match_ups_percent":"42.1824","enemy_win_rate":"44.7194","estimate_enemy_win_rate":"49.1431","estimate_team_win_rate":"48.5377","hero_b_info":{"DOTA_ATTRIBUTE_STRENGTH":true,"hero_id":104,"hero_name":"军团指挥官","img_name":"legion_commander"},"hero_b_win_rate":"49.6971","team_match_count":153940,"team_match_ups":"-1.3422","team_match_ups_color":"red","team_match_ups_percent":"10.1411","team_win_rate":"47.8862"},{"enemy_match_count":98075,"enemy_match_ups":"-8.6659","enemy_match_ups_color":"red","enemy_match_ups_percent":"40.6093","enemy_win_rate":"44.9768","estimate_enemy_win_rate":"49.2443","estimate_team_win_rate":"48.4366","hero_b_info":{"DOTA_ATTRIBUTE_STRENGTH":true,"hero_id":28,"hero_name":"斯拉达","img_name":"slardar"},"hero_b_win_rate":"49.5959","team_match_count":90825,"team_match_ups":"-0.3740","team_match_ups_color":"red","team_match_ups_percent":"2.8254","team_win_rate":"48.2554"},{"enemy_match_count":143185,"enemy_match_ups":"-8.2884","enemy_match_ups_color":"red","enemy_match_ups_percent":"38.8405","enemy_win_rate":"44.1576","estimate_enemy_win_rate":"48.1483","estimate_team_win_rate":"49.5328","hero_b_info":{"DOTA_ATTRIBUTE_AGILITY":true,"hero_id":6,"hero_name":"卓尔游侠","img_name":"drow_ranger"},"hero_b_win_rate":"50.6926","team_match_count":63499,"team_match_ups":"-10.2434","team_match_ups_color":"red","team_match_ups_percent":"77.3921","team_win_rate":"44.4590"},{"enemy_match_count":129189,"enemy_match_ups":"-7.2799","enemy_match_ups_color":"red","enemy_match_ups_percent":"34.1144","enemy_win_rate":"40.8982","estimate_enemy_win_rate":"44.1093","estimate_team_win_rate":"53.5922","hero_b_info":{"DOTA_ATTRIBUTE_AGILITY":true,"hero_id":32,"hero_name":"力丸","img_name":"riki"},"hero_b_win_rate":"54.7440","team_match_count":109703,"team_match_ups":"0.7684","team_match_ups_color":"green","team_match_ups_percent":"5.8053","team_win_rate":"54.0040"}]
     * match_ups_team_best : [{"enemy_match_count":106016,"enemy_match_ups":"3.5405","enemy_match_ups_color":"green","enemy_match_ups_percent":"16.5912","enemy_win_rate":"51.7299","estimate_enemy_win_rate":"49.9611","estimate_team_win_rate":"47.7208","hero_b_info":{"DOTA_ATTRIBUTE_INTELLECT":true,"hero_id":105,"hero_name":"工程师","img_name":"techies"},"hero_b_win_rate":"48.8793","team_match_count":103621,"team_match_ups":"6.1766","team_match_ups_color":"green","team_match_ups_percent":"46.6660","team_win_rate":"50.6683"},{"enemy_match_count":14805,"enemy_match_ups":"2.3381","enemy_match_ups_color":"green","enemy_match_ups_percent":"10.9565","enemy_win_rate":"50.8409","estimate_enemy_win_rate":"49.6794","estimate_team_win_rate":"48.0019","hero_b_info":{"DOTA_ATTRIBUTE_STRENGTH":true,"hero_id":78,"hero_name":"酒仙","img_name":"brewmaster"},"hero_b_win_rate":"49.1608","team_match_count":14424,"team_match_ups":"4.8124","team_match_ups_color":"green","team_match_ups_percent":"36.3590","team_win_rate":"50.3120"},{"enemy_match_count":49566,"enemy_match_ups":"6.9337","enemy_match_ups_color":"green","enemy_match_ups_percent":"32.4919","enemy_win_rate":"55.3383","estimate_enemy_win_rate":"51.7502","estimate_team_win_rate":"45.9384","hero_b_info":{"DOTA_ATTRIBUTE_INTELLECT":true,"hero_id":45,"hero_name":"帕格纳","img_name":"pugna"},"hero_b_win_rate":"47.0925","team_match_count":46443,"team_match_ups":"4.7286","team_match_ups_color":"green","team_match_ups_percent":"35.7258","team_win_rate":"48.1106"},{"enemy_match_count":41224,"enemy_match_ups":"-1.3962","enemy_match_ups_color":"red","enemy_match_ups_percent":"6.5426","enemy_win_rate":"50.1067","estimate_enemy_win_rate":"50.8162","estimate_team_win_rate":"46.8681","hero_b_info":{"DOTA_ATTRIBUTE_AGILITY":true,"hero_id":88,"hero_name":"司夜刺客","img_name":"nyx_assassin"},"hero_b_win_rate":"48.0249","team_match_count":43867,"team_match_ups":"3.6838","team_match_ups_color":"green","team_match_ups_percent":"27.8324","team_win_rate":"48.5946"},{"enemy_match_count":44158,"enemy_match_ups":"4.0904","enemy_match_ups_color":"green","enemy_match_ups_percent":"19.1682","enemy_win_rate":"52.3597","estimate_enemy_win_rate":"50.3021","estimate_team_win_rate":"47.3805","hero_b_info":{"DOTA_ATTRIBUTE_INTELLECT":true,"hero_id":112,"hero_name":"寒冬飞龙","img_name":"winter_wyvern"},"hero_b_win_rate":"48.5384","team_match_count":44936,"team_match_ups":"3.5465","team_match_ups_color":"green","team_match_ups_percent":"26.7950","team_win_rate":"49.0609"}]
     * match_ups_team_worst : [{"enemy_match_count":275359,"enemy_match_ups":"5.7379","enemy_match_ups_color":"green","enemy_match_ups_percent":"26.8882","enemy_win_rate":"52.7737","estimate_enemy_win_rate":"49.9099","estimate_team_win_rate":"47.7718","hero_b_info":{"DOTA_ATTRIBUTE_AGILITY":true,"hero_id":8,"hero_name":"主宰","img_name":"juggernaut"},"hero_b_win_rate":"48.9304","team_match_count":54566,"team_match_ups":"-13.2357","team_match_ups_color":"red","team_match_ups_percent":"100.0000","team_win_rate":"41.4489"},{"enemy_match_count":115161,"enemy_match_ups":"2.7017","enemy_match_ups_color":"green","enemy_match_ups_percent":"12.6607","enemy_win_rate":"49.6270","estimate_enemy_win_rate":"48.3215","estimate_team_win_rate":"49.3594","hero_b_info":{"DOTA_ATTRIBUTE_STRENGTH":true,"hero_id":54,"hero_name":"噬魂鬼","img_name":"life_stealer"},"hero_b_win_rate":"50.5192","team_match_count":32023,"team_match_ups":"-11.1054","team_match_ups_color":"red","team_match_ups_percent":"83.9048","team_win_rate":"43.8778"},{"enemy_match_count":56546,"enemy_match_ups":"-6.3051","enemy_match_ups_color":"red","enemy_match_ups_percent":"29.5463","enemy_win_rate":"48.2899","estimate_enemy_win_rate":"51.5395","estimate_team_win_rate":"46.1479","hero_b_info":{"DOTA_ATTRIBUTE_AGILITY":true,"hero_id":109,"hero_name":"恐怖利刃","img_name":"terrorblade"},"hero_b_win_rate":"47.3028","team_match_count":8055,"team_match_ups":"-10.4706","team_match_ups_color":"red","team_match_ups_percent":"79.1087","team_win_rate":"41.3160"},{"enemy_match_count":143185,"enemy_match_ups":"-8.2884","enemy_match_ups_color":"red","enemy_match_ups_percent":"38.8405","enemy_win_rate":"44.1576","estimate_enemy_win_rate":"48.1483","estimate_team_win_rate":"49.5328","hero_b_info":{"DOTA_ATTRIBUTE_AGILITY":true,"hero_id":6,"hero_name":"卓尔游侠","img_name":"drow_ranger"},"hero_b_win_rate":"50.6926","team_match_count":63499,"team_match_ups":"-10.2434","team_match_ups_color":"red","team_match_ups_percent":"77.3921","team_win_rate":"44.4590"},{"enemy_match_count":246614,"enemy_match_ups":"0.9683","enemy_match_ups_color":"green","enemy_match_ups_percent":"4.5377","enemy_win_rate":"47.4576","estimate_enemy_win_rate":"47.0024","estimate_team_win_rate":"50.6814","hero_b_info":{"DOTA_ATTRIBUTE_AGILITY":true,"hero_id":41,"hero_name":"虚空假面","img_name":"faceless_void"},"hero_b_win_rate":"51.8405","team_match_count":49320,"team_match_ups":"-9.2457","team_match_ups_color":"red","team_match_ups_percent":"69.8541","team_win_rate":"45.9955"}]
     * recommend_hero_id : 1
     * recommend_match_detail : []
     * skill_seq : {"abilities_list":[{"affects":"","attrib":"每次攻击损毁魔法：28 40 52 64\n技能：被动\n伤害类型：物理\n无视技能免疫：否\n","cmb":"","desc":"每次攻击损毁目标一定量的魔法值，并额外造成相当于损毁魔法值50%的伤害。\n\ntips: 法力损毁对技能免疫单位无效。\n受到吸血光环的效果就能根据该技能造成的伤害吸血。\n","dmg":"","dname":"法力损毁\n","hurl":"","lore":"","name":"antimage_mana_break","notes":""},{"affects":"","attrib":"距离：925 1000 1075 1150\n技能：点目标\n魔法消耗：60\n冷却时间：15 12 9 6\n","cmb":"","desc":"让敌法师自由出入战场的短距离传送。\n\ntips: 闪烁可以躲避多种飞行过程中的攻击和技能弹道。\n","dmg":"","dname":"闪烁\n","hurl":"","lore":"","name":"antimage_blink","notes":""},{"affects":"","attrib":"持续时间：1.2\n魔法抗性：15 25 35 45%\n技能：无目标\n施法距离：0\n魔法消耗：45 50 55 60\n冷却时间：15 11 7 3\n","cmb":"","desc":"被动提升魔法抗性。可以主动开启，创造一个围绕自身的反魔法外壳，将所有指向性技能反弹给敌人，自己则不受任何影响。\n","dmg":"","dname":"法术反制\n","hurl":"","lore":"","name":"antimage_counterspell","notes":""},{"affects":"","attrib":"眩晕时间：0.3\n作用范围：500\n伤害：0.8 0.95 1.1\n神杖升级冷却时间增加：70\n神杖升级眩晕时间：1.3\n影响：敌方单位\n技能：单位目标\n施法距离：600\n伤害类型：魔法\n无视技能免疫：是\n可用阿哈利姆神杖升级技能威力。法力虚空击杀英雄后将敌人冷却时间最长的技能增加一定冷却时间，并且提升眩晕时间。\n魔法消耗：125 200 275\n冷却时间：70.0 70.0 70.0\n","cmb":"","desc":"根据目标损失的魔法值，对目标和其周围的敌人造成伤害。主要目标受到短暂眩晕。\n\n可用神杖升级。\n\ntips: 眩晕效果无视技能免疫。\n伤害的计算根据主目标失去的魔法，但是对作用范围内所有敌人均有效。\n","dmg":"","dname":"法力虚空\n","hurl":"","lore":"","name":"antimage_mana_void","notes":""}],"skill_builds_list":[],"skill_desc_list":[]}
     * special_bonus : [[{"desc":"+20 攻击速度","effect":"0.6754","name":"special_bonus_attack_speed_20","usage_rate":"83.3004","win_rate":"49.7085"},{"desc":"+10 力量","effect":"-1.8481","name":"special_bonus_strength_10","usage_rate":"16.0857","win_rate":"47.9623"}],[{"desc":"+15 敏捷","effect":"2.4433","name":"special_bonus_agility_15","usage_rate":"34.5526","win_rate":"51.7202"},{"desc":"+400 闪烁施法距离","effect":"-1.2286","name":"special_bonus_unique_antimage_3","usage_rate":"64.7612","win_rate":"51.0677"}],[{"desc":"-2.5秒 闪烁冷却","effect":"0.1507","name":"special_bonus_unique_antimage","usage_rate":"72.9883","win_rate":"56.7289"},{"desc":"闪烁产生不可控幻象","effect":"-0.1304","name":"special_bonus_unique_antimage_5","usage_rate":"26.3843","win_rate":"55.0042"}],[{"desc":"-50秒 法力虚空冷却","effect":"-1.1952","name":"special_bonus_unique_antimage_2","usage_rate":"57.1330","win_rate":"63.1282"},{"desc":"+25% 法术反制魔法抗性","effect":"1.7315","name":"special_bonus_unique_antimage_4","usage_rate":"41.6312","win_rate":"66.0550"}]]
     * win_count : 1395914
     * win_rate : 48.8403
     * win_rate_rank : 73
     */

    private String hero_a_win_rate;
    private HeroAttrBean hero_attr;
    private HeroBaseInfoBean hero_base_info;
    private String hero_img;
    private HeroInfoBean hero_info;
    private String hero_name;
    private int match_count;
    private int match_count_rank;
    private int recommend_hero_id;
    private SkillSeqBean skill_seq;
    private int win_count;
    private String win_rate;
    private int win_rate_rank;
    private List<HeroItemsBean> hero_items;
    private List<MatchUpsEnemyBestBean> match_ups_enemy_best;
    private List<MatchUpsEnemyWorstBean> match_ups_enemy_worst;
    private List<MatchUpsTeamBestBean> match_ups_team_best;
    private List<MatchUpsTeamWorstBean> match_ups_team_worst;
    private List<?> recommend_match_detail;
    private List<List<SpecialBonusBean>> special_bonus;

    @NoArgsConstructor
    @Data
    public static class HeroAttrBean {
        /**
         * ArmorGain : 0.2000
         * ArmorPhysical : -1
         * AttackAnimationPoint : 0.300000
         * AttackDamageMax : 33
         * AttackDamageMin : 29
         * AttackRate : 1.400000
         * AttackSpeedGain : 1.2500
         * AttributeAgilityGain : 3.200000
         * AttributeBaseAgility : 24
         * AttributeBaseIntelligence : 12
         * AttributeBaseStrength : 23
         * AttributeIntelligenceGain : 1.800000
         * AttributePrimary : DOTA_ATTRIBUTE_AGILITY
         * AttributeStrengthGain : 1.300000
         * HealthGain : 18.0000
         * ManaGain : 12.0000
         * MovementGain : 0.1938
         * MovementSpeed : 310
         * MovementTurnRate : 0.500000
         * StatusHealth : 200.0000
         * StatusMana : 75.0000
         */

        private String ArmorGain;
        private String ArmorPhysical;
        private String AttackAnimationPoint;
        private String AttackDamageMax;
        private String AttackDamageMin;
        private String AttackRate;
        private String AttackSpeedGain;
        private String AttributeAgilityGain;
        private String AttributeBaseAgility;
        private String AttributeBaseIntelligence;
        private String AttributeBaseStrength;
        private String AttributeIntelligenceGain;
        private String AttributePrimary;
        private String AttributeStrengthGain;
        private String HealthGain;
        private String ManaGain;
        private String MovementGain;
        private String MovementSpeed;
        private String MovementTurnRate;
        private String StatusHealth;
        private String StatusMana;
    }

    @NoArgsConstructor
    @Data
    public static class HeroBaseInfoBean {
        /**
         * attribs : {"agi":{"b":22,"g":"2.80"},"armor":"2.0800","dmg":{"max":31,"min":27},"int":{"b":15,"g":"1.80"},"ms":315,"str":{"b":22,"g":"1.20"}}
         * dac : 近战
         * dname : 敌法师
         * droles : 核心 - 逃生 - 爆发
         * key_name : antimage
         * name : 敌法师
         * pa : agi
         * u : Anti-Mage
         */

        private AttribsBean attribs;
        private String dac;
        private String dname;
        private String droles;
        private String key_name;
        private String name;
        private String pa;
        private String u;

        @NoArgsConstructor
        @Data
        public static class AttribsBean {
            /**
             * agi : {"b":22,"g":"2.80"}
             * armor : 2.0800
             * dmg : {"max":31,"min":27}
             * int : {"b":15,"g":"1.80"}
             * ms : 315
             * str : {"b":22,"g":"1.20"}
             */

            private AgiBean agi;
            private String armor;
            private DmgBean dmg;
            private IntBean intX;
            private int ms;
            private StrBean str;

            @NoArgsConstructor
            @Data
            public static class AgiBean {
                /**
                 * b : 22
                 * g : 2.80
                 */

                private int b;
                private String g;
            }

            @NoArgsConstructor
            @Data
            public static class DmgBean {
                /**
                 * max : 31
                 * min : 27
                 */

                private int max;
                private int min;
            }

            @NoArgsConstructor
            @Data
            public static class IntBean {
                /**
                 * b : 15
                 * g : 1.80
                 */

                private int b;
                private String g;
            }

            @NoArgsConstructor
            @Data
            public static class StrBean {
                /**
                 * b : 22
                 * g : 1.20
                 */

                private int b;
                private String g;
            }
        }
    }

    @NoArgsConstructor
    @Data
    public static class HeroInfoBean {
        /**
         * DOTA_ATTRIBUTE_AGILITY : true
         * hero_id : 1
         * hero_name : 敌法师
         * img_name : antimage
         */

        private boolean DOTA_ATTRIBUTE_AGILITY;
        private int hero_id;
        private String hero_name;
        private String img_name;
    }

    @NoArgsConstructor
    @Data
    public static class SkillSeqBean {
        private List<AbilitiesListBean> abilities_list;
        private List<?> skill_builds_list;
        private List<?> skill_desc_list;

        @NoArgsConstructor
        @Data
        public static class AbilitiesListBean {
            /**
             * affects :
             * attrib : 每次攻击损毁魔法：28 40 52 64
             * 技能：被动
             * 伤害类型：物理
             * 无视技能免疫：否
             * cmb :
             * desc : 每次攻击损毁目标一定量的魔法值，并额外造成相当于损毁魔法值50%的伤害。
             * <p>
             * tips: 法力损毁对技能免疫单位无效。
             * 受到吸血光环的效果就能根据该技能造成的伤害吸血。
             * dmg :
             * dname : 法力损毁
             * hurl :
             * lore :
             * name : antimage_mana_break
             * notes :
             */

            private String affects;
            private String attrib;
            private String cmb;
            private String desc;
            private String dmg;
            private String dname;
            private String hurl;
            private String lore;
            private String name;
            private String notes;
        }
    }

    @NoArgsConstructor
    @Data
    public static class HeroItemsBean {
        /**
         * item_detail : 145
         * item_info : {"alternative_name":"狂战斧","cost":4400,"id":145,"img_name":"bfury","item_name":"狂战斧","name":"狂战斧","visable":1}
         * used_count : 2617509
         * used_count_percent : 100.0000
         * win_rate : 50.4283
         * win_rate_percent : 50.4283
         */

        private int item_detail;
        private ItemInfoBean item_info;
        private int used_count;
        private String used_count_percent;
        private String win_rate;
        private String win_rate_percent;

        @NoArgsConstructor
        @Data
        public static class ItemInfoBean {
            /**
             * alternative_name : 狂战斧
             * cost : 4400
             * id : 145
             * img_name : bfury
             * item_name : 狂战斧
             * name : 狂战斧
             * visable : 1
             */

            private String alternative_name;
            private int cost;
            private int id;
            private String img_name;
            private String item_name;
            private String name;
            private int visable;
        }
    }

    @NoArgsConstructor
    @Data
    public static class MatchUpsEnemyBestBean {
        /**
         * enemy_match_count : 183643
         * enemy_match_ups : 12.6545
         * enemy_match_ups_color : green
         * enemy_match_ups_percent : 59.3002
         * enemy_win_rate : 48.9275
         * estimate_enemy_win_rate : 43.4315
         * estimate_team_win_rate : 54.2765
         * hero_b_info : {"DOTA_ATTRIBUTE_INTELLECT":true,"hero_id":22,"hero_name":"宙斯","img_name":"zuus"}
         * hero_b_win_rate : 55.4254
         * team_match_count : 147786
         * team_match_ups : 1.0198
         * team_match_ups_color : green
         * team_match_ups_percent : 7.7047
         * team_win_rate : 54.8300
         */

        private int enemy_match_count;
        private String enemy_match_ups;
        private String enemy_match_ups_color;
        private String enemy_match_ups_percent;
        private String enemy_win_rate;
        private String estimate_enemy_win_rate;
        private String estimate_team_win_rate;
        private HeroBInfoBean hero_b_info;
        private String hero_b_win_rate;
        private int team_match_count;
        private String team_match_ups;
        private String team_match_ups_color;
        private String team_match_ups_percent;
        private String team_win_rate;

        @NoArgsConstructor
        @Data
        public static class HeroBInfoBean {
            /**
             * DOTA_ATTRIBUTE_INTELLECT : true
             * hero_id : 22
             * hero_name : 宙斯
             * img_name : zuus
             */

            private boolean DOTA_ATTRIBUTE_INTELLECT;
            private int hero_id;
            private String hero_name;
            private String img_name;
        }
    }

    @NoArgsConstructor
    @Data
    public static class MatchUpsEnemyWorstBean {
        /**
         * enemy_match_count : 54615
         * enemy_match_ups : -21.3397
         * enemy_match_ups_color : red
         * enemy_match_ups_percent : 100.0000
         * enemy_win_rate : 35.2248
         * estimate_enemy_win_rate : 44.7809
         * estimate_team_win_rate : 52.9152
         * hero_b_info : {"DOTA_ATTRIBUTE_AGILITY":true,"hero_id":82,"hero_name":"米波","img_name":"meepo"}
         * hero_b_win_rate : 54.0693
         * team_match_count : 42725
         * team_match_ups : -0.4999
         * team_match_ups_color : red
         * team_match_ups_percent : 3.7767
         * team_win_rate : 52.6507
         */

        private int enemy_match_count;
        private String enemy_match_ups;
        private String enemy_match_ups_color;
        private String enemy_match_ups_percent;
        private String enemy_win_rate;
        private String estimate_enemy_win_rate;
        private String estimate_team_win_rate;
        private HeroBInfoBeanX hero_b_info;
        private String hero_b_win_rate;
        private int team_match_count;
        private String team_match_ups;
        private String team_match_ups_color;
        private String team_match_ups_percent;
        private String team_win_rate;

        @NoArgsConstructor
        @Data
        public static class HeroBInfoBeanX {
            /**
             * DOTA_ATTRIBUTE_AGILITY : true
             * hero_id : 82
             * hero_name : 米波
             * img_name : meepo
             */

            private boolean DOTA_ATTRIBUTE_AGILITY;
            private int hero_id;
            private String hero_name;
            private String img_name;
        }
    }

    @NoArgsConstructor
    @Data
    public static class MatchUpsTeamBestBean {
        /**
         * enemy_match_count : 106016
         * enemy_match_ups : 3.5405
         * enemy_match_ups_color : green
         * enemy_match_ups_percent : 16.5912
         * enemy_win_rate : 51.7299
         * estimate_enemy_win_rate : 49.9611
         * estimate_team_win_rate : 47.7208
         * hero_b_info : {"DOTA_ATTRIBUTE_INTELLECT":true,"hero_id":105,"hero_name":"工程师","img_name":"techies"}
         * hero_b_win_rate : 48.8793
         * team_match_count : 103621
         * team_match_ups : 6.1766
         * team_match_ups_color : green
         * team_match_ups_percent : 46.6660
         * team_win_rate : 50.6683
         */

        private int enemy_match_count;
        private String enemy_match_ups;
        private String enemy_match_ups_color;
        private String enemy_match_ups_percent;
        private String enemy_win_rate;
        private String estimate_enemy_win_rate;
        private String estimate_team_win_rate;
        private HeroBInfoBeanXX hero_b_info;
        private String hero_b_win_rate;
        private int team_match_count;
        private String team_match_ups;
        private String team_match_ups_color;
        private String team_match_ups_percent;
        private String team_win_rate;

        @NoArgsConstructor
        @Data
        public static class HeroBInfoBeanXX {
            /**
             * DOTA_ATTRIBUTE_INTELLECT : true
             * hero_id : 105
             * hero_name : 工程师
             * img_name : techies
             */

            private boolean DOTA_ATTRIBUTE_INTELLECT;
            private int hero_id;
            private String hero_name;
            private String img_name;
        }
    }

    @NoArgsConstructor
    @Data
    public static class MatchUpsTeamWorstBean {
        /**
         * enemy_match_count : 275359
         * enemy_match_ups : 5.7379
         * enemy_match_ups_color : green
         * enemy_match_ups_percent : 26.8882
         * enemy_win_rate : 52.7737
         * estimate_enemy_win_rate : 49.9099
         * estimate_team_win_rate : 47.7718
         * hero_b_info : {"DOTA_ATTRIBUTE_AGILITY":true,"hero_id":8,"hero_name":"主宰","img_name":"juggernaut"}
         * hero_b_win_rate : 48.9304
         * team_match_count : 54566
         * team_match_ups : -13.2357
         * team_match_ups_color : red
         * team_match_ups_percent : 100.0000
         * team_win_rate : 41.4489
         */

        private int enemy_match_count;
        private String enemy_match_ups;
        private String enemy_match_ups_color;
        private String enemy_match_ups_percent;
        private String enemy_win_rate;
        private String estimate_enemy_win_rate;
        private String estimate_team_win_rate;
        private HeroBInfoBeanXXX hero_b_info;
        private String hero_b_win_rate;
        private int team_match_count;
        private String team_match_ups;
        private String team_match_ups_color;
        private String team_match_ups_percent;
        private String team_win_rate;

        @NoArgsConstructor
        @Data
        public static class HeroBInfoBeanXXX {
            /**
             * DOTA_ATTRIBUTE_AGILITY : true
             * hero_id : 8
             * hero_name : 主宰
             * img_name : juggernaut
             */

            private boolean DOTA_ATTRIBUTE_AGILITY;
            private int hero_id;
            private String hero_name;
            private String img_name;
        }
    }

    @NoArgsConstructor
    @Data
    public static class SpecialBonusBean {
        /**
         * desc : +20 攻击速度
         * effect : 0.6754
         * name : special_bonus_attack_speed_20
         * usage_rate : 83.3004
         * win_rate : 49.7085
         */

        private String desc;
        private String effect;
        private String name;
        private String usage_rate;
        private String win_rate;
    }
}
