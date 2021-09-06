package com.nokia.domain;

/**
 * @program: spring
 * @ClassName Account
 * @description:
 * @author: gaoxiang
 * @create: 2021-08-23 14:22
 * @Version 1.0
 **/
public class Account {
    private String name;
    private double money;

    public Account() {
    }

    public Account(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
