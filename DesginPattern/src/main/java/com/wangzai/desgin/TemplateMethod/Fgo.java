package com.wangzai.desgin.TemplateMethod;

public class Fgo implements Game{
    @Override
    public void start() {
        System.out.println("Fgo启动");
    }

    @Override
    public void dowork() {
        System.out.println("Fgo抽卡");
    }

    @Override
    public void close() {
        System.out.println("Fgo关闭");
    }
}
