package com.liy.quartz.config;

import com.liy.quartz.job.Job;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail uploadTaskDetail1() {
        return JobBuilder.newJob(Job.class).withIdentity("Job").storeDurably().build();
    }

    @Bean
    public Trigger uploadTaskTrigger1() {
        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule("5 * 0 * * ?");
        return TriggerBuilder.newTrigger().forJob(uploadTaskDetail1()).withIdentity("Job")
                .withSchedule(scheduleBuilder).build();
    }
}
