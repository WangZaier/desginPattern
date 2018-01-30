package com.wangzai.desgin.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

public class Client {


    public static void main(String[] args) {
        //初始化业务
        UserService userServiceImpl = new UserServiceImpl();

        //初始化代理类
        ProxyHandler proxyHandler = new ProxyHandler(userServiceImpl);
        //进行代理
        UserService userService = (UserService) Proxy.newProxyInstance(userServiceImpl.getClass().getClassLoader(),
                userServiceImpl.getClass().getInterfaces(),
                proxyHandler);

        //使用方法
        userService.register("666");
    }
}
