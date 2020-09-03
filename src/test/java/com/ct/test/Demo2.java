package com.ct.test;

import com.ct.domain.Account;
import com.ct.service.AccountService;
import com.ct.service.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author chentiewen
 * @date 2020/9/3 - 10:47
 */
public class Demo2 {

    @Test
    public void run1(){

        //创建对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService acc = (AccountService) ac.getBean("as");
        List<Account> list = acc.findAll();
        //遍历
        for (Account out : list){
            System.out.println(out);
        }
    }
}
