package com.kendall.dota2dataservice.pojo.bean;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: kendall
 * @since: 2019/8/1
 */
@NoArgsConstructor
@Data
public class HeroDataBean extends BaseBean {

    /**
     * dname : 敌法师
     * u : antimage
     * pa : agi
     * attribs : {"str":{"b":23,"g":"1.30"},"int":{"b":12,"g":"1.80"},"agi":{"b":24,"g":"3.20"},"ms":310,"dmg":{"min":29,"max":33},"armor":2.36}
     * dac : 近战
     * droles : 核心 - 逃生 - 爆发
     */

    @SerializedName(alternate = "dname", value = "localName")
    private String localName;

    private String u;

    @SerializedName(alternate = "pa", value = "primaryAttr")
    private String primaryAttr;

    private AttribsBean attribs;
    private String dac;

    @SerializedName(alternate = "droles", value = "roles")
    private String roles;

    @NoArgsConstructor
    @Data
    public static class AttribsBean {
        /**
         * str : {"b":23,"g":"1.30"}
         * int : {"b":12,"g":"1.80"}
         * agi : {"b":24,"g":"3.20"}
         * ms : 310
         * dmg : {"min":29,"max":33}
         * armor : 2.36
         */

        private StrBean str;
        private IntBean intX;
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
            private String g;
        }

        @NoArgsConstructor
        @Data
        public static class IntBean {
            /**
             * b : 12
             * g : 1.80
             */

            private int b;
            private String g;
        }

        @NoArgsConstructor
        @Data
        public static class AgiBean {
            /**
             * b : 24
             * g : 3.20
             */

            private int b;
            private String g;
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
}
