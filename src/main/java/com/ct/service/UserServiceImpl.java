package com.ct.service;

/**
 * @author chentiewen
 * @date 2020/9/2 - 17:48
 */
public class UserServiceImpl implements UserService {
    @Override
    public void Hello() {
        System.out.println("Hello IOC!");
    }

    @Override
    public void hello1() {
        System.out.println("hello,今天你成功迈出了第一步，继续加油，你会成功的!");
    }

}
