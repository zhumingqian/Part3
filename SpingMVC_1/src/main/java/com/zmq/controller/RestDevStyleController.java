package com.zmq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author ZMQ
 * @Date 2020/9/2
 * @since 1.8
 * Rest开发风格
 *      是一种开发风格，遵从此风格开发软件，符合REST风格，则RESTFUL。
 *      两个核心要求：
 *          每个资源都有唯一的标识(URL)
 *          不同的行为，使用对应的http-method
 */
@Controller
@RequestMapping("/rest")
public class RestDevStyleController {

    /**
     * 等价于 @GetMapping 可替换
     *      Rest开发风格中，所有的查询操作都为get请求。method都是get方式提交
     */
    @RequestMapping(path = "/testGet" , method = RequestMethod.GET)
//    @GetMapping
    public void testGet(){
        System.out.println("Get提交...");
    }

    /**
     * 等价于PostMapping 可替换
     *      Rest中，所有 增加 操作都为post 。 method都是post方式提交
     */
    @RequestMapping(path = "/testPost" , method = RequestMethod.POST)
//    @PostMapping
    public void testPost(){
        System.out.println("Post提交...");
    }

    /**
     * 等价于PutMapping 可替换
     *      Rest中，所有 更新 操作都为put 。 method都是put方式提交
     */
    @RequestMapping(path = "/testPut" , method = RequestMethod.PUT)
//    @PutMapping
    public void testPut(){
        System.out.println("Put提交...");
    }


    /**
     * 等价于 DeleteMapping 可替换
     *      Rest中，所有 删除 操作都为delete 。 method都是delete方式提交
     */
    @RequestMapping(path = "/testDelete" , method = RequestMethod.DELETE)
//    @DeleteMapping
    public void testDelete(){
        System.out.println("Delete提交...");
    }

}
