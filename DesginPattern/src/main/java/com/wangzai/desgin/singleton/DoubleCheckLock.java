package com.wangzai.desgin.singleton;

/**
 * 双重校验锁
 * @王仔
 */
public class DoubleCheckLock {

    //定义单例类型
    /**
     * 这里需要加上volatile关键字的原因：
     * volatile的特殊规则保证了新值能立刻同步到主内存,可以说volatile保证了多线程操作时候的可见性
     * 比如,在初始化对象以后立刻把对象同步到主内存
     * 这样instance != null,在锁外等待的线程就不会因为对象没有刷新而重复创建了
     * 也因为volatile禁止指令重排,使得子线程不会因重排进入synchronized代码块.
     * 也可以选择在 instance = new DoubleCheckLock(); 这个代码块加上 synchronized,也能达到效果
     */
    private volatile static DoubleCheckLock instance = null;

     //私有化构造方法
    private DoubleCheckLock(){}

    //获取单例对象
    public static DoubleCheckLock getInstance() {

        //如果为空则初始化单例对象 , 否则直接返回单例对象
        if(instance == null){
            //初始化对象操作同步锁 保证了原子操作
            synchronized (DoubleCheckLock.class){
                //防止对象初始化完成以后,他后面等待的线程又一次初始化对象
                if(instance == null){
                    //初始化单例对象
                    instance =  new DoubleCheckLock();
                }
            }
        }
        //返回单例对象爱你乖
        return instance;
    }
}
