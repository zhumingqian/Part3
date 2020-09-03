package com.zmq.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author ZMQ
 * @Date 2020/9/2
 * @since 1.8
 * 自定义拦截器 ： 顺序: preHandle --> postHandle --> afterCompletion
 *      还需在springmvc配置文件中配置
 */
public class MyInterceptor implements HandlerInterceptor {
    /**
     * 在执行业务前执行
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("执行...PreHandle...");
        //false为不放行 ， true为放行
        return true;
    }

    /**
     * 在业务执行完后执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("执行...PostHandle...");
    }

    /**
     * 在页面渲染完成后执行
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("执行...AfterCompletion...");
    }
}
