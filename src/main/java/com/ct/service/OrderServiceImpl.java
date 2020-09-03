package com.ct.service;

import com.ct.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;

import javax.annotation.Resource;

/**
 * @author chentiewen
 * @date 2020/9/2 - 22:29
 */
@Scope(value = "singleton")
public class OrderServiceImpl implements OrderService {
    //编写成员属性 一定要提供该属性的set方法
    @Autowired
    @Qualifier(value = "orderDao")
//    @Resource
    private OrderDao orderDao;
    //IOC容器底层就通过属性的set方法注入值
    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
    //消息
    @Value(value = "啦啦")
    private String msg;
    //年龄
    private int age;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void saveOrder() {
        System.out.println("业务层：保存订单。。。。。"+msg+"<------->"+age);
        orderDao.saveOrder();
    }
}
