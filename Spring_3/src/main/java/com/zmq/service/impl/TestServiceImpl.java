package com.zmq.service.impl;

import com.zmq.service.TestService;

/**
 * @author zmq
 * @date 2020/8/29
 * @since 1.8
 */
public class TestServiceImpl implements TestService {
    /**
     * 实现测试接口方法
     */
    @Override
    public void openAop() {
        System.out.println("start  Aop ? ? ?");
    }
}
