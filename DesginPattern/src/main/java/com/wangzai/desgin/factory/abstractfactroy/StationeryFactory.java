package com.wangzai.desgin.factory.abstractfactroy;


//定义工厂抽象
public interface StationeryFactory {

    //工厂行为

    //造铅笔
    Stationery createPencil();
    //造橡皮
    Stationery createRubber();

}
