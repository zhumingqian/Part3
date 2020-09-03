package com.zmq.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Author ZMQ
 * @Date 2020/9/2
 * @since 1.8
 * 编码过滤
 */
@WebFilter("/*")
public class CharacterFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
