package com.zmq.staticproxy;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 */
public class User implements CommonOpera {


    @Override
    public void watch() {
        System.out.println("User use the method!");
    }
}
