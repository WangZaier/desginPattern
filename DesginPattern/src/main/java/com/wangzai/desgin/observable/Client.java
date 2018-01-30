package com.wangzai.desgin.observable;

public class Client {


    public static void main(String[] args) throws InterruptedException{
        //订单系统
        OrderSystem orderSystem = new OrderSystem();
        //观察者
        Synchronization synchronization = new Synchronization();

        //注册观察者
        orderSystem.addObserver(synchronization);

        //模拟购物
        orderSystem.buy("666661");
        orderSystem.buy("666662");
        orderSystem.buy("666663");
        orderSystem.buy("666664");
        orderSystem.buy("666665");
        orderSystem.buy("666666");


        //等一会儿系统缓口气在同步
        Thread.sleep(1000);
        synchronization.synchronization();
    }
}
