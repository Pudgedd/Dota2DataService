package com.kendall.dota2dataservice.fundata.executor;

import com.kendall.dota2dataservice.fundata.exception.ClientException;
import com.kendall.dota2dataservice.fundata.pojo.http.Form;
import com.kendall.dota2dataservice.fundata.pojo.http.Json;

/**
 * fundata执行器
 *
 * @author baoyl
 * @created 2018/5/10
 */
public class FunDataExecutor {
    /**
     * 域名
     */
    private static final String VARENA_HOST = "api.varena.com";
    protected HttpClientTemplate clientOperation;

    public FunDataExecutor(String key, String secret, String rootPath) {
        this.clientOperation = new HttpClientTemplate(VARENA_HOST, rootPath, key, secret);
    }

    protected Form makeMatchForm(int matchId) {
        return new Form().add("match_id", matchId);
    }

    protected Form makeMatchForm(String matchId) {
        return new Form().add("match_id", matchId);
    }

    protected Form makeScheduleForm(String scheduleId) {
        return new Form().add("schedule_id", scheduleId);
    }

    protected Form makePageByPageSize(int pageSize, int page) {
        return new Form().add("page_size", pageSize)
                .add("page", page);
    }

    protected Form makePageByLimit(int page, int limit) {
        return new Form().add("page", page).add("limit", limit);
    }

    protected Form makeLeagueForm(String vLeagueId) {
        return new Form().add("v_league_id", vLeagueId);
    }

    protected Form makePlayerForm(int playerId) {
        return new Form().add("player_id", playerId);
    }

    public String commonForm(String url, Form form) throws ClientException {
        return this.clientOperation.get(url, form);
    }

    public String commonJson(String url, Json json) throws ClientException {
        return this.clientOperation.get(url, json);
    }

}
