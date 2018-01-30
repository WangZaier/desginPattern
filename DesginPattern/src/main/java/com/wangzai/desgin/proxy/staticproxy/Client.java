package com.wangzai.desgin.proxy.staticproxy;

public class Client {

    public static void main(String[] args){
        //初始化实现类
        UserService userService = new UserServiceImpl();
        //初始化代理对象
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);

        //调用注册业务
        userServiceProxy.register("666");
    }}
