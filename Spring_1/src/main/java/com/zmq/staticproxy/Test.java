package com.zmq.staticproxy;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();
        ProxyObj proxyObj = new ProxyObj(user);
        proxyObj.watch();
    }
}
