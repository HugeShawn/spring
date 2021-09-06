package com.lagou.dao;

import com.lagou.domain.User;

import java.io.IOException;
import java.util.List;

/**
 * @program: spring
 * @ClassName UserDao
 * @description:
 * @author: gaoxiang
 * @create: 2021-09-02 12:11
 * @Version 1.0
 **/
public interface UserDao {
    List<User> findAll();
}
