package com.nokia.domain;

/**
 * @program: spring
 * @ClassName User
 * @description:
 * @author: gaoxiang
 * @create: 2021-08-22 01:06
 * @Version 1.0
 **/


public class User {

    private String username;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User() {
    }

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}

