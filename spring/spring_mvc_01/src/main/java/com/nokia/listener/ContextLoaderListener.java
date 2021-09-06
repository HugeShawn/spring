package com.nokia.listener;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @program: spring
 * @ClassName ContextLoaderListener
 * @description:
 * @author: gaoxiang
 * @create: 2021-08-21 12:06
 * @Version 1.0
 **/
public class ContextLoaderListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {

        ServletContext servletContext = sce.getServletContext();

        String contextConfigLocation = servletContext.getInitParameter("contextConfigLocation");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext(contextConfigLocation);

        servletContext.setAttribute("context",context);
        System.out.println("spring 容器创建完毕！");
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
