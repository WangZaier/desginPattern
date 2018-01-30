package com.wangzai.desgin.TemplateMethod;

public interface Game {

    //启动方法
    void start();
    //开始游戏
    void dowork();
    //关闭方法
    void close();


    //玩游戏 定义顺序
    default void run(){
        start();
        dowork();
        close();
    }

}
