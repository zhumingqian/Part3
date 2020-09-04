package com.demo.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @Author ZMQ
 * @Date 2020/9/4
 * @since 1.8
 */
public class MyJob implements Job {
    /**
     * 重写执行方法
     * @param jobExecutionContext
     * @throws JobExecutionException
     */
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("execute..."+System.currentTimeMillis());
    }
}
