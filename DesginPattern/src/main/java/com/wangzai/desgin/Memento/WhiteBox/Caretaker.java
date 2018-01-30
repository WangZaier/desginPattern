package com.wangzai.desgin.Memento.WhiteBox;


/**
 * 管理者
 */
public class Caretaker {

    //管理者,需要有备忘录的引用
    private Memento memento;


    /**
     * 获取备忘录
     * @return
     */
    public Memento getMemento() {
        return memento;
    }

    /**
     * 保存备忘录
     * @param memento
     */
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
