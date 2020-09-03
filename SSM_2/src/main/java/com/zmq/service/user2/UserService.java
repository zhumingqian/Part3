package com.zmq.service.user2;

import com.zmq.entity.User;

import java.util.List;

/**
 * @Author ZMQ
 * @Date 2020/9/3
 * @since 1.8
 */
public interface UserService {

    List<User> queryAllUserInfo();

}
