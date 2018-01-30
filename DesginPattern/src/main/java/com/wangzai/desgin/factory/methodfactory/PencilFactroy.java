package com.wangzai.desgin.factory.methodfactory;

public class PencilFactroy implements Factory{

    @Override
    public Stationery create() {
        return new Pencil();
    }
}
