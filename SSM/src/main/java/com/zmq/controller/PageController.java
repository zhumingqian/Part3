package com.zmq.controller;

import com.github.pagehelper.PageInfo;
import com.zmq.entity.User;
import com.zmq.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Author ZMQ
 * @Date 2020/9/3
 * @since 1.8
 */
@Controller
@RequestMapping("page")
public class PageController {

    @Autowired
    private UserService userService;

    /**
     * 分页查询信息
     * @param currentPage
     * @return
     */
    @RequestMapping("/paginationQuery/{currentPage}")
    public String pageHelper(@PathVariable String currentPage , Model model){
        PageInfo<User> pageInfo = userService.paginationQueryAllUser(currentPage);
        model.addAttribute("pageInfo", pageInfo);
        return "info";
    }

    /**
     * 添加用户信息
     * @param user
     * @return
     */
    @PostMapping("/addInfo")
    public String addInfo(User user){
        int result = userService.addUser(user);
        if(result > 0){
            return "redirect:/page/paginationQuery/1";
        }else{
            return "redirect:failed";
        }
    }

    /**
     * 通过id查询用户信息
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/toUpdateInfo/{id}")
    public String toUpdateInfo(@PathVariable Integer id , Model model){
        User user = userService.queryUserById(id);
        model.addAttribute("user",user);
        return "updateInfo";
    }

    /**
     * 根据id修改信息
     * @param user
     * @return
     */
    @PostMapping("/updateInfo")
    public String UpdateInfo(User user){
        int result = userService.updateUserInfoById(user);
        if(result > 0){
            return "redirect:/page/paginationQuery/1";
        }
        return "redirect:failed";
    }

    /**
     * 通过id删除信息
     * @param id
     * @return
     */
    @RequestMapping("/deleteInfo/{id}")
    public String deleteUser(@PathVariable Integer id){
        int result = userService.deleteUsetById(id);
        if(result > 0){
            return "redirect:/page/paginationQuery/1";
        }
        return "redirect:failed";
    }

}
