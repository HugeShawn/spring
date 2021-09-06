package com.nokia.domain;

import java.util.List;

/**
 * @program: spring
 * @ClassName VO
 * @description:
 * @author: gaoxiang
 * @create: 2021-08-23 00:36
 * @Version 1.0
 **/
public class VO {

    private List<User> userList;

    public VO(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public VO() {
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}
