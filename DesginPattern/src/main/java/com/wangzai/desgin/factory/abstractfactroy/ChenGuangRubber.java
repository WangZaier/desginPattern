package com.wangzai.desgin.factory.abstractfactroy;

//晨光橡皮
public class ChenGuangRubber extends Rubber{

    //定义公司名称
    @Override
    public void manufacturer() {
        System.out.println("公司：晨光");
    }

    //定义价格
    @Override
    public void price() {
        System.out.println("价格：2元");
    }
}
