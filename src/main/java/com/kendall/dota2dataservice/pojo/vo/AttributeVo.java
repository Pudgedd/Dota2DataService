package com.kendall.dota2dataservice.pojo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/25
 */
@NoArgsConstructor
@Data
public class AttributeVo {
    /**
     * str : {"b":23,"g":"1.30"}
     * agi : {"b":24,"g":"3.20"}
     * ms : 310
     * dmg : {"min":29,"max":33}
     * armor : 2.36
     */

    private StrBean str;
    private AgiBean agi;
    private int ms;
    private DmgBean dmg;
    private double armor;

    @NoArgsConstructor
    @Data
    public static class StrBean {
        /**
         * b : 23
         * g : 1.30
         */

        private int b;
        private double g;
    }

    @NoArgsConstructor
    @Data
    public static class AgiBean {
        /**
         * b : 24
         * g : 3.20
         */

        private int b;
        private double g;
    }

    @NoArgsConstructor
    @Data
    public static class DmgBean {
        /**
         * min : 29
         * max : 33
         */

        private int min;
        private int max;
    }
}
