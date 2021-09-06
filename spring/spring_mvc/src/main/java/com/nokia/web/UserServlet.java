package com.nokia.web;

import com.nokia.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: spring
 * @ClassName UserServlet
 * @description:
 * @author: gaoxiang
 * @create: 2021-08-20 11:44
 * @Version 1.0
 **/
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServletContext servletContext = req.getServletContext();
        ApplicationContext context = (ApplicationContext) servletContext.getAttribute("context");
        UserService userService = context.getBean(UserService.class);
        userService.save();
    }
}
