package com.zmq.service;

import com.zmq.service.UsersService;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 */
public class UsersServiceImpl implements UsersService {

    @Override
    public void seeAop() {
        System.out.println("this is first business-logic-body test ...");
    }

    @Override
    public String seeAop2(Integer param) {
        return param + "这是AspectJ切面编程...吧!";
    }
}
