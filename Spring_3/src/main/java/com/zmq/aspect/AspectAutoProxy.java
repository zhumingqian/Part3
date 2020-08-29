package com.zmq.aspect;

/**
 * @author zmq
 * @date 2020/8/29
 * @since 1.8
 */
public class AspectAutoProxy {


    public void startProxyTestService(){
        System.out.println("启动Aspect动态代理...");
    }

    public void endProxyTestService(){
        System.out.println("尾部Aspect动态代理...");
    }

}
