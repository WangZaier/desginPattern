package com.wangzai.desgin.observable;

import java.util.Observable;
import java.util.Observer;


//订单系统
public class OrderSystem extends Observable{


    //用户下单
    public void buy(String uid){
        System.out.println("订单系统：用户下单id:" + uid);
        //通知观察者
        setChanged();
        notifyObservers(uid);
    }

}
