package com.liy.quartz.job;

import lombok.extern.slf4j.Slf4j;
import org.quartz.JobExecutionContext;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class Job  extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext){
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-ss");
        String format1 = format.format(date);
        log.info("定时任务启动===="+ format1);
    }
}
