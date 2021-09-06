package com.lagou.pojo;


import java.sql.Date;
import java.util.List;

/**
 * @program: spring
 * @ClassName User
 * @description:
 * @author: gaoxiang
 * @create: 2021-09-02 00:26
 * @Version 1.0
 **/
public class User {

    private int id;
    private String username;
    private String password;
    private Date birthday;

    private List<Order> orderList;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", orderList=" + orderList +
                '}';
    }

    public User(int id, String username, String password, Date birthday, List<Order> orderList) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.birthday = birthday;
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public User() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
