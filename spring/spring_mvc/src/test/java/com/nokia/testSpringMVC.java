package com.nokia;

import com.nokia.service.UserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @ClassName test
 * @description:
 * @author: gaoxiang
 * @create: 2021-08-20 00:29
 * @Version 1.0
 **/
public class testSpringMVC {
    @Test
    public void testUserService(){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean(UserService.class);
        userService.save();
    }
}
