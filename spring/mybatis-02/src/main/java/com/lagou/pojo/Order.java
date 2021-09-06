package com.lagou.pojo;


import java.sql.Date;

/**
 * @program: spring
 * @ClassName Order
 * @description: Order
 * @author: gaoxiang
 * @create: 2021-09-03 18:39
 * @Version 1.0
 **/
public class Order {
    private int id;
    private Date ordertime;
    private double total;

    public Order() {
    }

    public Order(int id, Date ordertime, double total) {
        this.id = id;
        this.ordertime = ordertime;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordertime=" + ordertime +
                ", total=" + total +
                '}';
    }
}
