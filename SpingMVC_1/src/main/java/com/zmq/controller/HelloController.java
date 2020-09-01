package com.zmq.controller;

import com.zmq.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zmq
 * @date 2020/9/1
 * @since 1.8
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/sp1")
    public String testSpringMVC(){
        System.out.println("hello springmvc");
        return "index";
    }

    @RequestMapping("/sp2")
    public String testSpringMVC2(User user){
        System.out.println(user);
        return "index";
    }

    @RequestMapping("/sp3/{id}")
    public String testSpringMVC3(@PathVariable(name = "id") Integer uid){
        System.out.println(uid);
        return "index";
    }
}
