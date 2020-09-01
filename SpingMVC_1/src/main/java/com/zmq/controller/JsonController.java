package com.zmq.controller;

import com.zmq.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Author ZMQ
 * @Date 2020/9/1
 * @since 1.8
 */
/**
 * Controller类上加了@RestController注解，等价于在类中的每个方法上都加了@ResponseBody
 */
@Controller
@RequestMapping("/json")
public class JsonController {
    /**
     * 使用json返回对象
     * @return
     */
    @RequestMapping("/test1")
    @ResponseBody
    public User testJson1(){
        return new User(23,"jackson","ca",new Date()) ;
    }

    /**
     * 使用json返回集合
     * @return
     */
    @RequestMapping("/test2")
    @ResponseBody
    public List<User> testJson2(){
        List<User> users = Arrays.asList(new User(1,"zs","ca",new Date()),
                new User(2,"ls","sa",new Date()));
        return users ;
    }

    /**
     *
     * 使用json返回字符串，则不需要转json
     * @return
     */
    @RequestMapping("/test3")
    @ResponseBody
    public String testJson3(){
        return "你好!" ;
    }

    /**
     * 接收前端传递过来的json数据
     * @param user
     * @return
     */
    @RequestMapping("/test4")
    public String getJsonObj(@RequestBody User user){//RequestBody 将请求体中的json数据转为java对象
        System.out.println(user);
        return "index" ;
    }
}
