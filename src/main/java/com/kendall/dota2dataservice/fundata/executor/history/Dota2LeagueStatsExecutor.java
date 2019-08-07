package com.kendall.dota2dataservice.fundata.executor.history;

import com.kendall.dota2dataservice.fundata.exception.ClientException;
import com.kendall.dota2dataservice.fundata.executor.FunDataExecutor;
import com.kendall.dota2dataservice.fundata.pojo.http.Form;

/**
 * @author baoyl
 * @created 2019/3/25
 */
public class Dota2LeagueStatsExecutor extends FunDataExecutor {
    public Dota2LeagueStatsExecutor(String key, String secret) {
        super(key, secret, "/fundata-dota2-basic/league/stats");
    }

    private Form makeLeagueStatsForm(int leagueId, Integer limit, Integer offset) {
        Form form = makeLeagueForm(leagueId);
        if (limit == null || offset == null) {
            return form;
        } else {
            return form.add("limit", limit)
                    .add("offset", offset);
        }
    }

    public String getTeamStats(int leagueId, Integer limit, Integer offset) throws ClientException {
        return clientOperation.get("/team", makeLeagueStatsForm(leagueId, limit, offset));
    }

    public String getPlayerStats(int leagueId, Integer limit, Integer offset) throws ClientException {
        return clientOperation.get("/player", makeLeagueStatsForm(leagueId, limit, offset));
    }

    public String getHeroStats(int leagueId, Integer limit, Integer offset) throws ClientException {
        return clientOperation.get("/hero", makeLeagueStatsForm(leagueId, limit, offset));
    }

    public String getItemStats(int leagueId, Integer limit, Integer offset) throws ClientException {
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
