package com.wangzai.desgin.factory.abstractfactroy;


public abstract class Pencil implements Stationery {

    private final String name = "铅笔";

    @Override
    public void product() {
        System.out.println("我是" + name + ",我可以写字");
    }
}
