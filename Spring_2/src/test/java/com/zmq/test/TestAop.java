package com.zmq.test;

import com.zmq.aop.AopAfter;
import com.zmq.aop.AopBefore;
import com.zmq.aop.AroundAop;
import com.zmq.service.UsersService;
import com.zmq.service.UsersServiceImpl;
import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 */
public class TestAop {
    /**
     * 测试前置、后置增强
     */
    @Test
    public void testAop(){
        //创建目标对象
        UsersService userService = new UsersServiceImpl();
        //创建通知
        AopBefore aopBefore = new AopBefore();
        AopAfter aopAfter = new AopAfter();
        //创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        //设置目标对象
        proxyFactory.setTarget(userService);
        //设置通知
        proxyFactory.addAdvice(aopBefore);
        proxyFactory.addAdvice(aopAfter);
        //得到代理对象
        UsersService proxy = (UsersService) proxyFactory.getProxy();
        proxy.seeAop();
    }

    /**
     * 测试环绕型增强
     */
    @Test
    public void testAroundAop(){
        //创建目标对象
        UsersService usersService = new UsersServiceImpl();
        //创建通知
        AroundAop aroundAop = new AroundAop();
        //创建代理工厂
        ProxyFactory proxyFactory = new ProxyFactory();
        //设置目标对象
        proxyFactory.setTarget(usersService);
        //设置通知
        proxyFactory.addAdvice(aroundAop);
        //创建代理对象
        UsersService proxy = (UsersService) proxyFactory.getProxy();
        proxy.seeAop();
    }


    /**
     * AspectJ  无参  无返回值 测试
     */
    @Test
    public void testAspectJ(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersService us = (UsersService) applicationContext.getBean("us");
        us.seeAop();
    }

    /**
     * AspectJ 有参  有返回值  测试
     */
    @Test
    public void testAspectJHaveParam(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersService us = (UsersService) applicationContext.getBean("us");
        System.out.println(us.seeAop2(88));
    }


    /*************************配置文件方法***************************/
    @Test
    public void testXMLAspectJ(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        UsersService us = (UsersService) applicationContext.getBean("us");
        System.out.println(us.seeAop2(77));
    }
}
