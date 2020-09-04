package com.demo.test;

import com.demo.quartz.MyQuartz;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.GregorianCalendar;

/**
 * @Author ZMQ
 * @Date 2020/9/3
 * @since 1.8
 *      测试quartz
 */
public class QuartzTest {
    public static void main(String[] args) throws SchedulerException {
        //创建scheduler,调度器
        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
        //定义一个Trigger，触发条件类
        Trigger trigger = TriggerBuilder.newTrigger()
                        .withIdentity("trigger1", "group1")//定义name和group
                        .startNow()//一旦加入scheduler ， 立即生效 ， 即开始计时
                        .withSchedule(SimpleScheduleBuilder.simpleSchedule()
                                        .withIntervalInSeconds(1)//每隔1秒执行一次
                                        .repeatForever())//一直执行知道结束时间
                        .endAt(new GregorianCalendar(2020, 10, 15, 16, 7, 0).getTime())//设置结束时间
                        .build();

        //定义一个JobDetail
        //定义Job类为MyQuartz类，这是真正的执行逻辑所在
        JobDetail jobDetail = JobBuilder.newJob(MyQuartz.class)
                                .withIdentity("job1","group1")//定义name，group
                                .build();
        //调度器中加入任务和触发器
        scheduler.scheduleJob(jobDetail , trigger);
        //启动任务调度
        scheduler.start();
    }
}
