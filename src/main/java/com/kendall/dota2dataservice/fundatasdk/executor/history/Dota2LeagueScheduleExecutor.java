package com.kendall.dota2dataservice.fundatasdk.executor.history;

import com.kendall.dota2dataservice.fundatasdk.executor.FunDataExecutor;
import com.kendall.dota2dataservice.fundatasdk.exception.ClientException;

/**
 * @author baoyl
 * @created 2019/3/25
 */
public class Dota2LeagueScheduleExecutor extends FunDataExecutor {
    public Dota2LeagueScheduleExecutor(String key, String secret) {
        super(key, secret, "/fundatasdk-dota2-basic/league/schedule");
    }

    public String getScheduleList() throws ClientException {
        return clientOperation.get("/list");
    }

    public String getScheduleDetail(String scheduleId) throws ClientException {
        return clientOperation.get("/detail", makeScheduleForm(scheduleId));
    }

}
