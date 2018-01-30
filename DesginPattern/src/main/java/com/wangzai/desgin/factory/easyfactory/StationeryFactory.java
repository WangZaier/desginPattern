package com.wangzai.desgin.factory.easyfactory;

public class StationeryFactory {

    //文具工厂,接受命令制造文具
    public Stationery create(String name) {
        if ("Rubber".equals(name)) {
            return new Rubber();
        }
        if ("Pencil".equals(name)) {
            return new Pencil();
        }

        return () -> {System.out.println("您输入的参数有误");};
    }
}
