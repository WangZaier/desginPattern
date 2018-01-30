package com.wangzai.desgin.singleton;

/**
 * 饿汉式
 * 提前创建实例.调用不用判断啥是不是空.直接给你
 * 缺点是即便你不使用它,他会存在占用内存
 * 优点是响应快.
 */
public class HungryMan {

    //直接初始化单例对象
    private static HungryMan instance = new HungryMan();

    //私有构造方法
    private HungryMan(){}

    //获取实例对象
    public static HungryMan getInstance() {
        return instance;
    }
}
