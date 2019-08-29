package com.kendall.dota2dataservice.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @description:
 * @author: kendall
 * @since: 2019/7/31
 */
@Component
public class Dota2CrawlerJob {
    private static final Logger LOGGER = LoggerFactory.getLogger(Dota2CrawlerJob.class);

    @Resource(name = "dota2Com")
    private Dota2CrawlerThread dota2CrawlerThread;

    private int count;

    /**
     * 每天凌晨1点执行一次
     */
//    @Scheduled(fixedRate = 30000)
    @Scheduled(cron = "0 0 1 * * ?")
    private void process() {
        LOGGER.info("This is DOTA2 crawler job running {}", (count++));
        try {
            dota2CrawlerThread.run();
            LOGGER.info("This is DOTA2 crawler job success stopping {}", (count));
        } catch (Exception e) {
            LOGGER.error("DOTA2 crawler job encounter an error", e);
        }
    }
}
