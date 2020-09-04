package com.demo.quartz;


import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;

import java.util.Date;

/**
 * @Author ZMQ
 * @Date 2020/9/3
 * @since 1.8
 *  Quartz
 */
public class MyQuartz implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) {
        JobDetail jobDetail = jobExecutionContext.getJobDetail();
        System.out.println("job : " + jobDetail.getKey().getName());
        System.out.println("group : " + jobDetail.getKey().getGroup());
        System.out.println(new Date());
    }
}
