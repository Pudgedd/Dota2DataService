package com.kendall.dota2dataservice.pojo.vo;

import com.kendall.dota2dataservice.utils.Responsable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/21
 */
@NoArgsConstructor
@Data
public class LeagueDetailVo implements Responsable {

    /**
     * league_name : TI9国际邀请赛 预选赛
     * organizer : Valve
     * start_time : 1562428800
     * end_time : 1563120000
     * version :
     * prize_poll :
     * league_abbr : TI9 预选赛
     * league_en_name : The International 2019: Main Qualifiers
     * league_en_abbr : The International 2019: Main Qualifiers
     * league_en_organizer : Valve
     * league_type : 0
     * integral : 0
     * league_id : 10749
     * is_integral_league : false
     * v_league_id : VD001794
     */

    private String league_name;
    private String organizer;
    private long start_time;
    private long end_time;
    private String version;
    private String prize_poll;
    private String league_abbr;
    private String league_en_name;
    private String league_en_abbr;
    private String league_en_organizer;
    private int league_type;
    private int integral;
    private int league_id;
    private boolean is_integral_league;
    private String v_league_id;
}
