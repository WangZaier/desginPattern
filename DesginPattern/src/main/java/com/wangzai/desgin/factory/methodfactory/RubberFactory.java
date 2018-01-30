package com.wangzai.desgin.factory.methodfactory;

public class RubberFactory implements Factory{

    @Override
    public Stationery create() {
        return new Rubber();
    }
}
