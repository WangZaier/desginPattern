package com.wangzai.desgin.Decorator;


//用户删除装饰类
public class UserDeleteDecorator extends UserServiceDecorator {


    public UserDeleteDecorator(UserService userService) {
        super(userService);
    }

    @Override
    public void addUsers(String userName) {}

    public void userDelete(String username){
        System.out.println(username + "-已经被删除");
    }
}
