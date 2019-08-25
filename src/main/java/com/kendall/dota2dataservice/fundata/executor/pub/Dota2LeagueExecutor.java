package com.kendall.dota2dataservice.fundata.executor.pub;

import com.kendall.dota2dataservice.fundata.exception.ClientException;
import com.kendall.dota2dataservice.fundata.executor.FunDataExecutor;

/**
 * @author baoyl
 * @created 2019/3/25
 */
public class Dota2LeagueExecutor extends FunDataExecutor {


    public Dota2LeagueExecutor(String key, String secret) {
        super(key, secret, "/fundata-dota2-free/v2/league");
    }

    public String getLeagueList(int pageSize, int page) throws ClientException {
        return clientOperation.get("/list", makePageByPageSize(pageSize, page));
    }

    public String getLeagueDetail(String vLeagueId) throws ClientException {
        return clientOperation.get("/detail", makeLeagueForm(vLeagueId));
    }

    public String getLeaguePlayer(int playerId) throws ClientException {
        return clientOperation.get("/player", makePlayerForm(playerId));
    }

    public String getLeagueTeam(int page, int limit) throws ClientException {
        return clientOperation.get("/team", makePageByLimit(page, limit));
    }

}
