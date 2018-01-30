package com.wangzai.desgin.factory.abstractfactroy;

public abstract class Rubber implements Stationery {


    private final String name = "橡皮";
    @Override
    public void product() {
        System.out.println("我是" + name + ",我可以擦掉字" );
    }
}