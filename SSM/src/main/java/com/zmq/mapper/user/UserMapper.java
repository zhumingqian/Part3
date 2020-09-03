package com.zmq.mapper.user;

import com.zmq.entity.User;

import java.util.List;

/**
 * @Author ZMQ
 * @Date 2020/9/2
 * @since 1.8
 */
public interface UserMapper {
    List<User> queryAllUser();
}
