package com.wangzai.desgin.Memento.multiplecheckpoint;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//可以认为他是状态记录中心.
public class Originator {

    //存储状态集合
    private List<String> states;
    //这是检查点
    private int index;


    //初始化 将检查点至0 , 初始化状态
    public Originator() {
        states = new ArrayList<>();
        index = 0;
    }

    //按照当前状态创建备忘录
    public Memento createMemento() throws Exception{
        return new Memento(states,index);
    }

    //恢复到某一个备忘录状态
    public void restoreMemento(Memento memento){
        states = memento.getStates();
        index = memento.getIndex();
    }

    //添加状态,检查点自增
    public void setStates(String state) {
        states.add(state);
        index ++;
    }

    //打印状态
    public void printStates(){
        states.forEach(System.out::println);
    }

}
