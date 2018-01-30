package com.wangzai.desgin.proxy.staticproxy;

public class UserServiceProxy implements UserService{

    UserService userService;

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void register(String id) {
        System.out.println("事务开启");
        userService.register(id);
        System.out.println("事务提交");
        System.out.println("注册成功");
    }
}
