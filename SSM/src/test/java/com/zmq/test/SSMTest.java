package com.zmq.test;

import com.zmq.entity.User;
import com.zmq.service.user.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @Author ZMQ
 * @Date 2020/9/2
 * @since 1.8
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SSMTest {
    @Autowired
    private UserService userService;
    @Test
    public void testQuery(){
        List<User> userList = userService.queryAllUser();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
