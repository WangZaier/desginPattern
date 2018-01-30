package com.wangzai.desgin.proxy.staticproxy;

public class UserServiceImpl implements UserService{

    //注入Dao
    private UserDao userDao = new UserDao();

    @Override
    public void register(String id) {
        //业务不写了
        userDao.insert(id);
    }
}
