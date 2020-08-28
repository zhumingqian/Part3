package com.zmq.staticproxy;

/**
 * @author zmq
 * @date 2020/8/28
 * @since 1.8
 */
public class ProxyObj implements CommonOpera {
    private User user;

    public ProxyObj(User user){
        this.user = user;
    }

    @Override
    public void watch() {
        System.out.println("Proxy reading ...");
        user.watch();
        System.out.println("Proxy end ...");
    }
}
