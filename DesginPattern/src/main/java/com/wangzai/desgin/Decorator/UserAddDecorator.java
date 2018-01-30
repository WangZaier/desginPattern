package com.wangzai.desgin.Decorator;

public class UserAddDecorator extends UserServiceDecorator {

    UserDeleteDecorator userDeleteDecorator;

    public UserAddDecorator(UserServiceDecorator userServiceDecorator) {
        super(userServiceDecorator);
        this.userDeleteDecorator = (UserDeleteDecorator)userServiceDecorator;

    }

    @Override
    public void userDelete(String userName) {
        this.userDeleteDecorator.userDelete(userName);
    }

    public void addUsers(String userName) {
        System.out.println(userName + "-已添加");

    }
}
