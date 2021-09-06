package com.lagou.dao;

import com.lagou.pojo.User;

import java.util.List;

/**
 * @program: spring
 * @ClassName UserDao
 * @description:
 * @author: gaoxiang
 * @create: 2021-09-04 17:00
 * @Version 1.0
 **/
public interface UserDao {
    public List<User> findAll();
}
