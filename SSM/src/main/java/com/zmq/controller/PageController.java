package com.zmq.controller;

import com.github.pagehelper.PageInfo;
import com.zmq.entity.User;
import com.zmq.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author ZMQ
 * @Date 2020/9/3
 * @since 1.8
 */
@Controller
//@RequestMapping("page")
public class PageController {

    @Autowired
    private UserService userService;

    /**
     * 分页查询信息
     * @param currentPage
     * @return
     */
    @RequestMapping("/paginationQuery")
    public String pageHelper(String currentPage , Model model){
        PageInfo<User> pageInfo = userService.paginationQueryAllUser(currentPage);
        model.addAttribute("pageInfo", pageInfo);
        return "info";
    }
}
