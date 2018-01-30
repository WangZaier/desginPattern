package com.wangzai.desgin.singleton;


/**
 * 静态内部类懒加载单例模式
 * 由于静态内部类的特性：使用时才加载
 * 因为是一个静态域.所以只加载一次.变相达到了单例的效果
 * 并且静态域的是线程安全的
 *
 */
public class LazyInitialization {

    //私有构造器
    private LazyInitialization(){}


    /**
     * 静态内部类/类内部类也可以叫嵌套类
     * 1.创建嵌套类的对象不需要外围类的对象,静态内部类不持有外部类的引用
     * 2.不能从嵌套类的对象中访问外围类对象
     * 3.嵌套类只能使用外围类的静态成员变量和局部变量
     * 4.嵌套类可以访问外围类的私有变量
     * 5.静态内部类的加载不需要依附外部类，在使用时才加载。不过在加载静态内部类的过程中也会加载外部类
     */
     private static class LazyInitializationHolder{
        private static  LazyInitialization instance = new LazyInitialization();

    }


    public LazyInitialization getInstance(){
        return LazyInitializationHolder.instance;
    }
}
