package com.zmq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author ZMQ
 * @Date 2020/9/2
 * @since 1.8
 * 获取session中的captcha验证码
 */
@Controller
@RequestMapping("/validate")
public class ValidateCodeController {
    /**
     * 查看captcha验证码是否存在session中  存在
     * @param session
     */
    @RequestMapping("/getValidate")
    public void getValidate(HttpSession session){
        String captcha = session.getAttribute("captcha").toString();
        System.out.println(captcha);
    }


}
