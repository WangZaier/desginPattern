package com.wangzai.desgin.factory.abstractfactroy;


/**
 * 本来世界上只有一个文具店
 * 后来出现了第二家.
 * 那我们只好给文具又添加上 生产厂家 / 价格了
 */
//文具接口
public interface Stationery {
    //文具特征行为
    void product();
    //生产厂家
    void manufacturer();
    //价格
    void price();

}
