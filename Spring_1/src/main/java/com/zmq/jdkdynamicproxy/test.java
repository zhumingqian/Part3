package com.zmq.jdkdynamicproxy;

import com.zmq.service.UserService;
import com.zmq.service.UserServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 * JDK动态代理
 */
public class test {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        InvocationHandler invocationHandler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("dynamic proxy start...");
                Object invoke = method.invoke(userService, args);
                System.out.println("dynamic proxy end...");
                return invoke;
            }
        };
        //创建代理对象
        UserService instance = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), invocationHandler);
        instance.a1();
    }
}
