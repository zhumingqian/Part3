package com.zmq.test;

import com.zmq.entity.User;
import com.zmq.service.user2.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author ZMQ
 * @Date 2020/9/3
 * @since 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SSMTest {
    @Autowired
    private UserService userService;
    @Test
    public void test1(){
        List<User> userList = userService.queryAllUserInfo();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
