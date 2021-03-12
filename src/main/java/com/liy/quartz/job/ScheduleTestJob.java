package com.liy.quartz.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Component
public class ScheduleTestJob {

    @Scheduled(cron = "0 0 15 * *  ?")
    public void test (){
        Date date = new Date();
        SimpleDateFormat sim = new SimpleDateFormat("hh:MM:ss");
        log.info("schedule打印。。。。。。。。。"+sim.format(date));
    }

}
