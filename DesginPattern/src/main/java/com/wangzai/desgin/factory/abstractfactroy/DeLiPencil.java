package com.wangzai.desgin.factory.abstractfactroy;

public class DeLiPencil extends Pencil{

    @Override
    public void manufacturer() {
        System.out.println("公司名称：得力");
    }

    @Override
    public void price() {
        System.out.println("价格:2元");
    }
}

