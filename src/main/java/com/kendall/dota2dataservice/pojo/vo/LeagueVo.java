package com.kendall.dota2dataservice.pojo.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/21
 */
@NoArgsConstructor
@Data
public class LeagueVo {

    /**
     * league_id : 9601
     * v_league_id : dXXX
     * league_name : EPICENTER XL预选赛
     * organizer : Epic Esports Events
     * start_time : 1518192000
     * end_time : 1521129600
     * version : 7.08
     * prize_poll : 获胜者晋级主赛事
     * league_abbr : EPICENTER XL预选赛
     * is_integral_league : false
     * league_name_en : EPICENTER XL Qualifier
     * league_abbr_en : EPICENTER XL Qualifier
     * league_organize_en : Epic Esports Events
     * league_type : 0
     * integral : 0
     */

    private int league_id;
    private String v_league_id;
    private String league_name;
    private String organizer;
    private long start_time;
    private long end_time;
    private String version;
    private String prize_poll;
    private String league_abbr;
    private boolean is_integral_league;
    private String league_name_en;
    private String league_abbr_en;
    private String league_organize_en;
    private int league_type;
    private int integral;

}
