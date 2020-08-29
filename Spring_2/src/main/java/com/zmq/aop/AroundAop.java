package com.zmq.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 */
public class AroundAop implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("aroundAop start ...");
        Object proceed = methodInvocation.proceed();
        System.out.println("aroundAop ending ...");
        return proceed;
    }
}
