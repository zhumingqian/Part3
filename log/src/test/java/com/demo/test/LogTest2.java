package com.demo.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author ZMQ
 * @Date 2020/9/3
 * @since 1.8
 *      日志处理 : logback + SLF4j
 */
public class LogTest2 {

    Logger logger = LoggerFactory.getLogger(LogTest2.class);
    @Test
    public void test1(){
        logger.trace("this is Trace");
        logger.debug("this is Debug");
        logger.info("this is Info");
        logger.warn("this is Warn");
        logger.error("this is Error");
    }
}
