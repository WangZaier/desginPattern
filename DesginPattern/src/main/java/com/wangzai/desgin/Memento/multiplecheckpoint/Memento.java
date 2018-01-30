package com.wangzai.desgin.Memento.multiplecheckpoint;


import java.util.ArrayList;
import java.util.List;

/**
 * 备忘录
 */
public class Memento implements Cloneable{

    //存储状态集合
    private List<String> states = new ArrayList<>();
    //这是检查点
    private int index;

    public Memento(List<String> states, int index) throws Exception{
        this.states = (List) ((ArrayList<String>)states).clone();
        this.index = index;
    }

    public List<String> getStates() {
        return states;
    }

    public void setStates(List<String> states) {
        this.states = states;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }


}
