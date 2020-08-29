package com.zmq.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 */
public class AopBefore implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        //aop的前置增强内容
        System.out.println("aop before advice ...");
    }
}
