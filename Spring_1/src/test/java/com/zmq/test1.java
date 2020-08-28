package com.zmq;

import com.zmq.bean.MyBean;
import com.zmq.dao.UserDaoImpl;
import com.zmq.entity.Book;
import com.zmq.entity.User;
import com.zmq.service.UserService;
import com.zmq.service.UserServiceImpl;
import com.zmq.tools.MyFactory;
import com.zmq.tools.MyFactoryBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.sql.Connection;

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


    /**
     * 测试注入对象信息   数组  集合  properties
     */
    @Test
    public void testDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) applicationContext.getBean("user");
        System.out.println(user);
    }

    /**
     * 构造方法注入
     */
    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book2 = (Book) applicationContext.getBean("book2");
        System.out.println(book2);
    }

    /**
     * 自动注入
     */
    @Test
    public void testAutoDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.a1();
    }

    /**
     * 复杂对象注入
     */
    @Test
    public void testComplexObj(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Connection connection = (Connection) applicationContext.getBean("mfb");
        MyFactoryBean myFactoryBean = (MyFactoryBean) applicationContext.getBean("&mfb");
        System.out.println("MyFactoryBean对象:::"+myFactoryBean);
        System.out.println("Connection对象:::"+connection);
    }
}
