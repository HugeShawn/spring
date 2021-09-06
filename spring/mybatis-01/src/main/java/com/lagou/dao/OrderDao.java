package com.lagou.dao;

import com.lagou.domain.Order;

import java.util.List;

/**
 * @program: spring
 * @ClassName OrderDao
 * @description:
 * @author: gaoxiang
 * @create: 2021-09-03 20:53
 * @Version 1.0
 **/
public interface OrderDao {
    List<Order> findAll();
}
