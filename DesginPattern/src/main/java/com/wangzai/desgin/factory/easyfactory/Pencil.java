package com.wangzai.desgin.factory.easyfactory;

public class Pencil implements Stationery{

    private final String name = "铅笔";
    private final int price = 1;

    @Override
    public void product() {
        System.out.println("我是" + name + "," + "价格:" + price + ",我可以写字");
    }
}
