package com.wangzai.desgin.factory.abstractfactroy;


//晨光
public class ChenGuangPencil extends Pencil{

    //定义公司名称
    @Override
    public void manufacturer() {
        System.out.println("公司：晨光");
    }

    //定义价格
    @Override
    public void price() {
        System.out.println("价格：1.5元");
    }
}
