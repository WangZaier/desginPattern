package com.wangzai.desgin.Memento.WhiteBox;

public class Client {


    public static void main(String[] args) {

        //管理者:持有缓存的备忘录对象
        Caretaker caretaker = new Caretaker();
        //发起者:一般持有当前状态信息
        Originator originator = new Originator();

        //设置状态
        originator.setState("1");
        //保存备忘录
        caretaker.setMemento(originator.createMemento());

        //再次设置状态
        originator.setState("2");
        System.out.println(originator.getState());

        //恢复
        originator.recoveryMemento(caretaker.getMemento());
        System.out.println(originator.getState());



    }

}
