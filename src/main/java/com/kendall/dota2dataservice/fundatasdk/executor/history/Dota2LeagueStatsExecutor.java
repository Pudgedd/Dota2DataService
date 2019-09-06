package com.kendall.dota2dataservice.fundatasdk.executor.history;

import com.kendall.dota2dataservice.fundatasdk.executor.FunDataExecutor;
import com.kendall.dota2dataservice.fundatasdk.pojo.http.Form;
import com.kendall.dota2dataservice.fundatasdk.exception.ClientException;

/**
 * @author baoyl
 * @created 2019/3/25
 */
public class Dota2LeagueStatsExecutor extends FunDataExecutor {
    public Dota2LeagueStatsExecutor(String key, String secret) {
        super(key, secret, "/fundata-dota2-basic/league/stats");
    }

    private Form makeLeagueStatsForm(String vLeagueId, Integer limit, Integer offset) {
        Form form = makeLeagueForm(vLeagueId);
        if (limit == null || offset == null) {
            return form;
        } else {
            return form.add("limit", limit)
                    .add("offset", offset);
        }
    }

    public String getTeamStats(String vLeagueId, Integer limit, Integer offset) throws ClientException {
        return clientOperation.get("/team", makeLeagueStatsForm(vLeagueId, limit, offset));
    }

    public String getPlayerStats(String vLeagueId, Integer limit, Integer offset) throws ClientException {
        return clientOperation.get("/player", makeLeagueStatsForm(vLeagueId, limit, offset));
    }

    public String getHeroStats(String vLeagueId, Integer limit, Integer offset) throws ClientException {
        return clientOperation.get("/hero", makeLeagueStatsForm(vLeagueId, limit, offset));
    }

    public String getItemStats(String vLeagueId, Integer limit, Integer offset) throws ClientException {
        //TODO
        return null;
    }

    public String getTeamFightAnalysis(int matchId) throws ClientException {
        return clientOperation.get("/team-fight-analysis", makeMatchForm(matchId));
    }

    public String getLaneAnalysis(int matchId) throws ClientException {
        return clientOperation.get("/lane-analysis", makeMatchForm(matchId));
    }

    public String getPlayerRoleLane(int matchId) throws ClientException {
        return clientOperation.get("/player-role-lane", makeMatchForm(matchId));
    }

    public String getRoushanLog(int matchId) throws ClientException {
        return clientOperation.get("/roushan-log", makeMatchForm(matchId));
    }

    public String getTowerTracking(int matchId) throws ClientException {
        return clientOperation.get("/tower-tracking", makeMatchForm(matchId));
    }

}
