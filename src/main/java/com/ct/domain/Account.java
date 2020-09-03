package com.ct.domain;

import java.io.Serializable;

/**
 * @author chentiewen
 * @date 2020/9/3 - 10:40
 *
 * 账户
 */
public class Account implements Serializable {

    //主键
    private int id;
    //名称
    private String name;
    //金额
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
