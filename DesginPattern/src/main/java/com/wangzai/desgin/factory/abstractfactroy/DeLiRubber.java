package com.wangzai.desgin.factory.abstractfactroy;

public class DeLiRubber extends Rubber{

    @Override
    public void manufacturer() {
        System.out.println("公司：得力");
    }

    @Override
    public void price() {
        System.out.println("价格:3元");
    }
}
