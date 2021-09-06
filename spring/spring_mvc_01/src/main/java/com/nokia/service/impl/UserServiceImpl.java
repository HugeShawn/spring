package com.nokia.service.impl;

import com.nokia.dao.UserDao;
import com.nokia.service.UserService;

/**
 * @program: spring
 * @ClassName UserServiceImpl
 * @description:
 * @author: gaoxiang
 * @create: 2021-08-20 00:25
 * @Version 1.0
 **/
public class UserServiceImpl implements UserService {

    public UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
