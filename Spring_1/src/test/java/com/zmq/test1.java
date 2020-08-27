package com.zmq;

import com.zmq.bean.MyBean;
import com.zmq.dao.UserDaoImpl;
import com.zmq.service.UserServiceImpl;
import com.zmq.tools.MyFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author zmq
 * @date 2020/8/27
 * @since 1.8
 */
public class test1 {
    /**
     * 测试获取对象
     */
    @Test
    public void testSpring1() throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        MyFactory myFactory = new MyFactory("/bean.properties");
        //将配置文件传入
        UserDaoImpl userDao = (UserDaoImpl) myFactory.getBean("userDao");
        System.out.println(userDao);
    }

    @Test
    public void test2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        MyFactory myFactory = new MyFactory();
        MyBean myBean = (MyBean) applicationContext.getBean("mb");
        myBean.show();
    }

    @Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) applicationContext.getBean("userServiceImpl");
        userServiceImpl.a1();
    }
}
