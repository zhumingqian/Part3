package com.zmq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ZMQ
 * @Date 2020/9/1
 * @since 1.8
 * 静态资源问题
 */
@Controller
@RequestMapping("/forw")
public class StaticSourceController {
    @RequestMapping("/test1")
    public String staticSource(){
        System.out.println("这个是处理静态资源...");
        return "forward:/static/demo.html" ;
    }

}
