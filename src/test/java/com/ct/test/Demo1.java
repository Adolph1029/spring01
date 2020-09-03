package com.ct.test;

import com.ct.service.OrderService;
import com.ct.service.UserService;
import com.ct.service.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chentiewen
 * @date 2020/9/2 - 17:51
 */
public class Demo1 {
    /**
     * 先使用原来的方式来做
     */
    @Test
    public void run1(){
        //new 对象的方式实现，创建对象的权力由人控制
        UserService service = new UserServiceImpl();
        //调用方法
        service.Hello();
    }

    /**
     * 使用IOC方式
     */
    @Test
    public void run2(){
        //先创建Spring的IOC工厂，加载src目录下的配置文件，把配置文件中类创建成对象，存储到IOC容器中
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取对象.底层就是的map集合。Map<"us","对象">
        UserService use = (UserService) ac.getBean("us");
        //调用方法即可
        use.hello1();
    }
    /**
     * DI依赖注入
     */
    @Test
    public void run3(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        OrderService oser = (OrderService) ac.getBean("os");
        oser.saveOrder();
    }
}
