package com.zmq.controller;

import com.zmq.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

/**
 * @author zmq
 * @date 2020/9/1
 * @since 1.8
 */
@Controller
@RequestMapping("/save")
@SessionAttributes({"ms1","ms2","user"})//设置参数作用域可作用与session上
public class SaveParamsController {
    /**
     * request传值
     * @param request
     * @return
     */
    @RequestMapping("/req")
    public String saveRequest(HttpServletRequest request){
        request.setAttribute("req1","request save params 1...");
        request.setAttribute("req2","request save params 2...");
        return "saveParams" ;
    }

    /**
     * 使用session传值
     * @param session
     * @return
     */
    @RequestMapping("/ses")
    public String saveSession(HttpSession session){
        session.setAttribute("ses1","session save params1 ...");
        session.setAttribute("ses2","session save params2 ...");
        return "saveParams" ;
    }

    /**
     * 使用model传值  作用域  ----request
     * @param model
     * @return
     */
    @RequestMapping("/mod")
    public String saveModel(Model model){
        model.addAttribute("m1","model save params1 ...");
        model.addAttribute("m2","model save params2 ...");
        return "saveParams" ;
    }

    /**
     * 使用modelAndView传值   ----作用域request
     * @return
     */
    @RequestMapping("/modelAndView")
    public ModelAndView saveModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        //访问页面
        modelAndView.setViewName("saveParams");
        modelAndView.addObject("mav1","ModelAndView save params1 ...");
        modelAndView.addObject("mav2","ModelAndView save params2 ...");
        return modelAndView;
    }

    /**
     * model 和 SessionAttributes 传值。
     * @param model
     * @return
     */
    @RequestMapping("/smas")
    public String saveModelAndSessionAttributesAnnotation(Model model){
        model.addAttribute("ms1","model save params1 ...");
        model.addAttribute("ms2","model save params2 ...");
        model.addAttribute("user",new User(2,"zs","sss",new Date()));
        return "saveParams" ;
    }


}
