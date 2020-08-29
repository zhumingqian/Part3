package com.zmq.aspect;

/**
 * @author zmq
 * @date 2020/8/29
 * @since 1.8
 */
public class AspectAutoProxy {


    public void startProxyTestService(){
        System.out.println("头部增强Aspect动态代理...");
    }

    public void endProxyTestService(){
        System.out.println("尾部增强Aspect动态代理...");
    }

}
