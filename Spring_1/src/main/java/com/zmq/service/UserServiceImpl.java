package com.zmq.service;

import com.zmq.dao.UserDao;
import com.zmq.dao.UserDaoImpl;

/**
 * @author zmq
 * @date 2020/8/27
 * @since 1.8
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    @Override
    public void a1() {
        System.out.println("userService");
        userDao.a1();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
