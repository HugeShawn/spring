package com.nokia.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nokia.domain.User;
import com.nokia.domain.VO;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @program: spring
 * @ClassName UserController
 * @description:
 * @author: gaoxiang
 * @create: 2021-08-21 14:28
 * @Version 1.0
 **/

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/quick")
    public String quickMethod1(HttpServletRequest request) {
        System.out.println("controller is running");
//        return "redirect:/success01.jsp";
        request.setAttribute("name", "lisa");
        return "/index.jsp";
    }

    @RequestMapping("/quick2")
    public ModelAndView quickMethod2() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/index.jsp");
        return modelAndView;
    }

    @RequestMapping("/quick3")
    public ModelAndView quickMethod3() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("forward:/WEB-INF/jsp/index.jsp");
        modelAndView.addObject("name", "shawn");
        return modelAndView;
    }

    @RequestMapping("/quick4")
    public void quickMethod4(HttpServletResponse response) throws IOException {
        response.getWriter().println("hello world");
    }

    @RequestMapping("/quick5")
    @ResponseBody
    public String quickMethod5() {
        return "hello this is not changed!!!";
    }

    @RequestMapping("/quick6")
    @ResponseBody
    public String quickMethod6() {
        return "{\"name\":\"pony\",\"age\":18}";
    }

    @RequestMapping("/quick7")
    @ResponseBody
    public String quickMethod7() throws JsonProcessingException {
        User user = new User();
        user.setUsername("shawn");
        user.setAge(30);
        ObjectMapper objectMapper = new ObjectMapper();
        String value = objectMapper.writeValueAsString(user);
        return value;
    }

    @RequestMapping("/quick8")
    @ResponseBody
    public User quickMethod8() {
        User user = new User();
        user.setUsername("shawn");
        user.setAge(30);
        return user;
    }

    @RequestMapping("/quick9")
    @ResponseBody
    public void quickMethod9(String username, int age) {
        System.out.println(username);
        System.out.println(age);
    }

    @RequestMapping("/quick10")
    @ResponseBody
    public void quickMethod10(User user) {
        System.out.println(user);
    }

    @RequestMapping("/quick11")
    @ResponseBody
    public void quickMethod11(VO vo) {
        System.out.println(vo.getUserList());
    }

    @RequestMapping("/quick12")
    @ResponseBody
    public void quickMethod12(@RequestBody List<User> userList) throws IOException {
        System.out.println(userList);
    }


    @RequestMapping("/quick13")
    @ResponseBody
    public ModelAndView quickMethod13() throws IOException, ParseException {
        System.out.println("target is running....");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "nokia");
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("/quick14")
    @ResponseBody
    public ModelAndView quickMethod14(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }


}

