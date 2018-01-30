package com.wangzai.desgin.singleton;

public class LazyMan {
    private static LazyMan instance = null;

    private LazyMan(){}


    /**
     * 懒加载:调用方法时给instance创建对象
     * synchronized防止多个线程同时创建多个实例
     * @return
     */
    public static synchronized LazyMan getInstance() {
        if( instance == null){
            instance = new LazyMan();
        }
        return instance;
    }
}
