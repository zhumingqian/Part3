package com.zmq.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author ZMQ
 * @Date 2020/9/2
 * @since 1.8
 *
 * 处理异常
 */
public class MyException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        e.printStackTrace();
        ModelAndView modelAndView = new ModelAndView();
        if(e instanceof NullPointerException){
            modelAndView.setViewName("redirect:/error/error1.jsp");
        }else if(e instanceof ArithmeticException){
            modelAndView.setViewName("redirect:/error/error2.jsp");
        }else{
            modelAndView.setViewName("redirect:/error/error3.jsp");
        }
        return modelAndView;
    }
}
