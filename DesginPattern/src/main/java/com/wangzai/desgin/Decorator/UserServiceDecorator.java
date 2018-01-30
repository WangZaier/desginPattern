package com.wangzai.desgin.Decorator;

public abstract class UserServiceDecorator implements UserService{

    //接收需要装饰的对象
    private UserService userService;

    public UserServiceDecorator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void selectUsers() {
        this.userService.selectUsers();
    }

    public abstract void addUsers(String userName);
    public abstract void userDelete(String userName);


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
