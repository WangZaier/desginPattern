package com.wangzai.desgin.factory.methodfactory;

import com.wangzai.desgin.factory.methodfactory.Stationery;

public class Rubber implements Stationery {


    private final String name = "橡皮";
    private final int price = 2;

    @Override
    public void product() {
        System.out.println("我是" + name + "," + "价格:" + price + ",我可以写字");
    }
}