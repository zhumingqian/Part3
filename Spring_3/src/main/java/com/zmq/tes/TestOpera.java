package com.zmq.tes;

import com.zmq.entity.TestInfo;
import com.zmq.service.TestService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zmq
 * @date 2020/8/29
 * @since 1.8
 */
public class TestOpera {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestService testService = (TestService) applicationContext.getBean("testService");
        testService.openAop();
    }

}
