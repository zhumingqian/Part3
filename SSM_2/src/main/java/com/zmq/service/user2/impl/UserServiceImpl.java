package com.zmq.service.user2.impl;

import com.zmq.entity.User;
import com.zmq.mapper.user2.UserMapper;
import com.zmq.service.user2.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ZMQ
 * @Date 2020/9/3
 * @since 1.8
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryAllUserInfo() {
        return userMapper.queryAllUserInfo();
    }
}
