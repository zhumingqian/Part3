package com.zmq.service;

import com.zmq.dao.UserDao;
import com.zmq.dao.UserDaoImpl;

/**
 * @author zmq
 * @date 2020/8/27
 * @since 1.8
 */
public class UserServiceImpl implements UserService {
    /*使用IoC  控制反转  降低耦合性*/
//    private UserDao userDaoImpl;

    @Override
    public void a1() {
        System.out.println("userService");
//        userDaoImpl.a1();
    }

//    public void setUserDao(UserDao userDaoImpl) {
//        this.userDaoImpl = userDaoImpl;
//    }
}
