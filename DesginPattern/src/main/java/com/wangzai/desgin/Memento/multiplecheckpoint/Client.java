package com.wangzai.desgin.Memento.multiplecheckpoint;

public class Client {

    public static void main(String[] args) throws Exception{
        //发起者:一般持有当前状态信息
        Originator originator = new Originator();
        //管理者:持有缓存的备忘录对象 , 拥有"发起者" 的引用
        Caretaker caretaker = new Caretaker(originator);

        //我们做出一个操作
        originator.setStates("状态1");//记录状态
        int memento1 = caretaker.createMemento();//调用 originator 的创建方法,创建一个备忘录,add到缓存 ,返回当前备忘录索引

        //做出第二个操作
        originator.setStates("状态2");
        int memento2 = caretaker.createMemento();


        //打印状态
        originator.printStates();
        //恢复到状态1 ctrl+z
        caretaker.restoreMemento(0);
//        //然后在查看一下
        System.out.println("当前状态：");originator.printStates();


    }
}
