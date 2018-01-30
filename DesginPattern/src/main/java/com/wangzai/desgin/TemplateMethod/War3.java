package com.wangzai.desgin.TemplateMethod;

public class War3 implements Game{

    @Override
    public void start() {
        System.out.println("War3启动");
    }

    @Override
    public void dowork() {
        System.out.println("War3和朋友一起玩");
    }

    @Override
    public void close() {
        System.out.println("War3关闭");
    }
}
