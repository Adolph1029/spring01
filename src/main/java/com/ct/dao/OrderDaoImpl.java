package com.ct.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author chentiewen
 * @date 2020/9/2 - 22:32
 */
@Component(value = "us")
@Controller
@Service
@Repository
public class OrderDaoImpl implements OrderDao {
    @Override
    public void saveOrder() {
        System.out.println("持久层：保存订单。。。。。");
    }
}
