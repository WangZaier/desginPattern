package com.wangzai.desgin.factory.methodfactory;

public class Consumer {

    public static void main(String[] args){

        //橡皮工厂
        Factory rubberFactroy = new RubberFactory();
        //铅笔工厂
        Factory pencilFactory = new PencilFactroy();

        //开始生产
        Stationery rubber = rubberFactroy.create();
        Stationery pencil = pencilFactory.create();

        //测试行为
        rubber.product();
        pencil.product();
    }
}
