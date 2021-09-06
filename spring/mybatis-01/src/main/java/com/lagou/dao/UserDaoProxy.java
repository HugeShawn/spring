package com.lagou.dao;

import com.lagou.domain.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: spring
 * @ClassName UserDao
 * @description:
 * @author: gaoxiang
 * @create: 2021-09-02 12:11
 * @Version 1.0
 **/
public interface UserDaoProxy {
    User findByIdProxy(int id);
    List<User> findByConditionProxy(User user);
    List<User> findByIdsProxy(List list);
}
