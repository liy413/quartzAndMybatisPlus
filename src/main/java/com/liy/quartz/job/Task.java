package com.liy.quartz.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author liy
 * @create 2021/3/15 10:04
 */
@Slf4j
@Component
public class Task {
    @Async //开启异步注解  同时发送请求
    public void doTaskOne() throws Exception {
       log.info("taskOne");
    }

    @Async
    public void doTaskTwo() throws Exception {
        log.info("doTaskTwo");
    }

    @Async
    public void doTaskThree() throws Exception {
        log.info("doTaskThree");
    }
}
