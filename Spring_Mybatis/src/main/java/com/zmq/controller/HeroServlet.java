package com.zmq.controller;

import com.zmq.entity.VHero;
import com.zmq.service.VHeroService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author zmq
 * @date 2020/8/31
 * @since 1.8
 */
@WebServlet("/test")
public class HeroServlet extends HttpServlet {
    private VHeroService vHeroService;

    /**
     * 在初始化方法中获得service的对象
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        vHeroService = (VHeroService) webApplicationContext.getBean("vHeroServiceImpl");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<VHero> vHeroes = vHeroService.queryAllVHero();
        req.setAttribute("vh",vHeroes);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
