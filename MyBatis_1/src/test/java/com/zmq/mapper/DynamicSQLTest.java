package com.zmq.mapper;

import com.zmq.entity.User;
import com.zmq.tools.MyBatisUtils;
import org.junit.Test;

/**
 * @Author ZMQ
 * @Date 2020/8/26
 * @since 1.8
 * 动态SQL测试
 */
public class DynamicSQLTest {
    @Test
    public void queryUser1(){
        UserMapper userMapper = MyBatisUtils.getProxyObj(UserMapper.class);
        User user = userMapper.selectUserById1(4);
        System.out.println(user);
    }






}
