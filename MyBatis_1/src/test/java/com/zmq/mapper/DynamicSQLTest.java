package com.zmq.mapper;

import com.zmq.entity.User;
import com.zmq.tools.MyBatisUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author ZMQ
 * @Date 2020/8/26
 * @since 1.8
 * 动态SQL测试
 */
public class DynamicSQLTest {

    /**
     * <sql></sql>标签测试
     */
    @Test
    public void queryUser1(){
        UserMapper userMapper = MyBatisUtils.getProxyObj(UserMapper.class);
        User user = userMapper.selectUserById1(4);
        System.out.println(user);
    }

    /**
     * <where></where>标签测试
     */
    @Test
    public void queryUser2(){
        UserMapper userMapper = MyBatisUtils.getProxyObj(UserMapper.class);
        User user = new User();
        user.setId(5);
//        user.setName("张三丰");
//        user.setAge();
        //通过id查询
        List<User> userList = userMapper.selectUserById2(user);
        userList.stream().forEach((e)-> System.out.println(e));
    }

    /**
     * <set></set>set标签测试
     */
    @Test
    public void queryUser3(){
        UserMapper userMapper = MyBatisUtils.getProxyObj(UserMapper.class);
        User user = new User();
        user.setId(6);
//        user.setName("张三丰第一");
        user.setAge(10);
        int i = userMapper.selectUserById3(user);
        if(i > 0){
            MyBatisUtils.commit();
            System.out.println("成功...");
        }else{
            MyBatisUtils.rollback();
            System.out.println("失败...");
        }
    }

    /**
     * <trim></trim>trim标签测试
     */
    @Test
    public void queryUser4(){
        UserMapper userMapper = MyBatisUtils.getProxyObj(UserMapper.class);
        User user = new User();
        user.setId(5);
//        user.setName("张三丰");
//        user.setAge();
        //通过id查询
        List<User> userList = userMapper.selectUserById4(user);
        userList.stream().forEach((e)-> System.out.println(e));
    }

    /**
     * < foreach > 标签
     */
    @Test
    public void queryUser5(){
        UserMapper userMapper = MyBatisUtils.getProxyObj(UserMapper.class);
        List<Integer> listId = new ArrayList<>();
        listId.add(5);
        listId.add(6);
        listId.add(7);
        listId.add(8);
        List<User> userList = userMapper.selectUserById5(listId);
        userList.stream().forEach((e)-> System.out.println(e));
    }

}
