package com.kendall.dota2dataservice.fundatasdk.executor.pub;

import com.kendall.dota2dataservice.fundatasdk.exception.ClientException;
import com.kendall.dota2dataservice.fundatasdk.executor.FunDataExecutor;

/**
 * @author baoyl
 * @created 2019/3/25
 */
public class Dota2RawExecutor extends FunDataExecutor {

    public Dota2RawExecutor(String key, String secret) {
        super(key, secret, "/fundatasdk-dota2-free/v2/raw");
    }

    public String getRawHero() throws ClientException {
        return clientOperation.get("/hero");
    }

    public String getRawItem() throws ClientException {
        return clientOperation.get("/item");
    }

    public String getRawAbility() throws ClientException {
        return clientOperation.get("/ability");
    }

}
