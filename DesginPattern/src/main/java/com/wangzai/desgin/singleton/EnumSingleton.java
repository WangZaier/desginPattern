package com.wangzai.desgin.singleton;


/**
 *
 */
public class EnumSingleton {

    private EnumSingleton(){}


    //enum是一系列相同属性实体的集合
    //我们只创建一个(INSTANCE),因为单例是对于INSTANCE这个属性而言,同一个INSTANCE的singleton是同一单例
    //在添加另外一个属性 INSTANCE1下getInstace 出来的就合 INSTACE下getInstace出来的不是一个实例
    //我们在枚举中只定义一个实例.enum会去保证他的唯一
    //然后我们给这个唯一个实例初始化
    private enum Singleton{
        INSTANCE;

        private EnumSingleton singleton;
        //构造方法，注意：构造方法不能为public，因为enum并不可以被实例化
        //JVM会保证此方法绝对只调用一次,即只有一个实例
        private Singleton(){
            singleton = new EnumSingleton();
        }
        public EnumSingleton getInstance(){
            return singleton;
        }

    }

    //调用枚举中的INSTANCE实例子
    public static EnumSingleton getInstace(){
        return Singleton.INSTANCE.getInstance();
    }

}