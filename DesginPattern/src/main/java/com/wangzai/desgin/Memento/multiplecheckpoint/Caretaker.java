package com.wangzai.desgin.Memento.multiplecheckpoint;


import java.util.ArrayList;
import java.util.List;

//管理者
public class Caretaker {

    private Originator originator;

    private List<Memento> mementos = new ArrayList<>();

    private int current = 0;


    public Caretaker(Originator originator) {
        this.originator = originator;
        current = 0;
    }

    /**
     * 创建新的检查点
     *
     * @return
     */
    public int createMemento() throws Exception{
        //调用发起人 , 创建新备忘录
        //添加到本地备忘录集合
        mementos.add(originator.createMemento());
        //记录检查点
        return current++;
    }


    /**
     * 将发起人恢复到某个检查点
     * @param index 传入需要恢复到的检查点
     */
    public void restoreMemento(int index){
        //通过传入的参数从备忘录缓存中取出
        Memento memento = mementos.get(index);
        //将这个缓存同步到发起人
        originator.restoreMemento(memento);
    }

    /**
     * 删除检查点
     * @param index
     */
    public void removeMemento(int index){
        mementos.remove(index);
    }

}
