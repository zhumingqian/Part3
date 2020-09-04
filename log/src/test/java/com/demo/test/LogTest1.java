package com.demo.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

/**
 * @Author ZMQ
 * @Date 2020/9/3
 * @since 1.8
 *       日志处理 : log4j + commons-logging
 */
public class LogTest1 {

    Log log = LogFactory.getLog(LogTest1.class);

    @Test
    public void test1(){
        log.trace("trace   这是Trace");
        log.debug("debug  这是Debug");
        log.info("info  这是Info");
        log.warn("warn  这是Warn");
        log.error("error  这是Error");
    }
}
