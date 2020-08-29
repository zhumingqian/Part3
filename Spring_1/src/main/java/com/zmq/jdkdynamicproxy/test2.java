package com.zmq.jdkdynamicproxy;

import com.zmq.dao.UserDaoImpl;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 *      CGlib动态代理
 */
public class test2 {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        //设置父类型
        enhancer.setSuperclass(UserDaoImpl.class);
        //设置回调函数
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("前置增强...");
                Object invokeSuper = methodProxy.invokeSuper(o, objects);
                System.out.println("后置增强...");
                return invokeSuper;
            }
        });
        //创建子类代理对象
        UserDaoImpl o = (UserDaoImpl) enhancer.create();
        o.a1();

    }
}
