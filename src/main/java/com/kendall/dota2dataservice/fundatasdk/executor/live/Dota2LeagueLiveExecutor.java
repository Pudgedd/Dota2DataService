package com.kendall.dota2dataservice.fundatasdk.executor.live;

import com.kendall.dota2dataservice.fundatasdk.exception.ClientException;
import com.kendall.dota2dataservice.fundatasdk.executor.FunDataExecutor;

/**
 * @author baoyl
 * @created 2019/3/25
 */
public class Dota2LeagueLiveExecutor extends FunDataExecutor {
    public Dota2LeagueLiveExecutor(String key, String secret) {
        super(key, secret, "/fundatasdk-dota2-pro/v2/league/live");
    }

    public String getLiveScoreboard(int matchId) throws ClientException {
        return clientOperation.get("/scoreboard", makeMatchForm(matchId));
    }

    public String getLivePlayer(int matchId) throws ClientException {
        return clientOperation.get("/player", makeMatchForm(matchId));
    }

    public String getLiveNetworth(int matchId) throws ClientException {
        return clientOperation.get("/networth", makeMatchForm(matchId));
    }

    public String getLiveEvents(int matchId, int lastLogScore) throws ClientException {
        return clientOperation.get("/events", makeMatchForm(matchId)
                .add("last_log_score", lastLogScore));
    }

}
