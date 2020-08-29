package com.zmq.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 */
public class AopAfter implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("after aop advice ... ");
    }
}
