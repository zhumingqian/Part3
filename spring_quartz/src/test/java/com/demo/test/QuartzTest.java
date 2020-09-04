package com.demo.test;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ZMQ
 * @Date 2020/9/4
 * @since 1.8
 */
public class QuartzTest {
    public static void main(String[] args) throws SchedulerException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scheduler scheduler = new StdSchedulerFactory().getScheduler("scheduler");
    }
}
