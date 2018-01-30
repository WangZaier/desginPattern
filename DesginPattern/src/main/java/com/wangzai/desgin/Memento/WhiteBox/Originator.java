package com.wangzai.desgin.Memento.WhiteBox;


/**
 * 备忘发起
 */
public class Originator {
    private String  state;


    /**
     * 返回备忘录的工厂方法
     * @return
     */
    public Memento createMemento(){
        return new Memento(state);
    }


    /**
     * 备忘录恢复
     * @param memento
     */
    public void recoveryMemento(Memento memento){
        this.state = memento.getState();
    }

    //getter/setter
    public String getState() { return state;}
    public void setState(String state) { this.state = state; }
}