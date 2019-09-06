package com.kendall.dota2dataservice.fundatasdk.executor.pub;

import com.kendall.dota2dataservice.fundatasdk.pojo.http.Form;
import com.kendall.dota2dataservice.fundatasdk.exception.ClientException;
import com.kendall.dota2dataservice.fundatasdk.executor.FunDataExecutor;

import java.util.Date;

/**
 * @author baoyl
 * @created 2019/3/25
 */
public class Dota2MatchExecutor extends FunDataExecutor {

    public Dota2MatchExecutor(String key, String secret) {
        super(key, secret, "/fundata-dota2-free/v2/match");
    }

    public String getMatchBasicInfo(int matchId) throws ClientException {
        return clientOperation.get("/basic-info", makeMatchForm(matchId));
    }

    public String getMatchBanPicks(int matchId) throws ClientException {
        return clientOperation.get("/ban-picks", makeMatchForm(matchId));
    }

    public String getMatchGeneralInfo(int matchId) throws ClientException {
        return clientOperation.get("/general-info", makeMatchForm(matchId));
    }

    public String getMatchPlayers(int matchId) throws ClientException {
        return clientOperation.get("/players", makeMatchForm(matchId));
    }

    public String getMatchPlayersAbilityUpgrades(int matchId) throws ClientException {
        return clientOperation.get("/players-ability-upgrades", makeMatchForm(matchId));
    }

    private Form makeMatchBatchForm(Date startTime, Date startFrom, int limit) {
        limit = limit < 0 ? 0 : limit;
        limit = limit > 200 ? 200 : limit;
        Form form = new Form().add("start_time", startTime.getTime() / 1000L)
                .add("limit", limit);
        if (startFrom != null) {
            form.add("start_from", startFrom.getTime() / 1000L);
        }
        return form;
    }

    public String batchMatchBasicInfo(Date startTime, Date startFrom, int limit) throws ClientException {
        return clientOperation.get("/basic-info/batch", makeMatchBatchForm(startTime, startFrom, limit));
    }

    public String batchMatchBanPicks(Date startTime, Date startFrom, int limit) throws ClientException {
        return clientOperation.get("/ban-picks/batch", makeMatchBatchForm(startTime, startFrom, limit));
    }

    public String batchMatchPlayers(Date startTime, Date startFrom, int limit) throws ClientException {
        return clientOperation.get("/players/batch", makeMatchBatchForm(startTime, startFrom, limit));
    }

    public String batchMatchPlayersAbilityUpgrades(Date startTime, Date startFrom, int limit) throws ClientException {
        return clientOperation.get("/players-ability-upgrades/batch", makeMatchBatchForm(startTime, startFrom, limit));
    }

}
