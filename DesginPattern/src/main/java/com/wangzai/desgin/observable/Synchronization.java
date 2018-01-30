package com.wangzai.desgin.observable;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Synchronization implements Observer{
    //存储订单
    List<String> uidList = new ArrayList<>();

    @Override
    public void update(Observable o, Object arg) {
        uidList.add((String)arg);
        System.out.println("观察者系统：添加成功");
    }

    //同步
    public void synchronization(){
        for (String s : uidList) {
            System.out.println(s + "已同步");
        }
    }
}
