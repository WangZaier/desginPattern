package com.wangzai.desgin.creator;


//钢笔类
public class Pen{

    //笔芯
    Refill refill;
    //笔壳
    PenShell penShell;

    public Pen(Refill refill , PenShell penShell){
        this.refill = refill;
        this.penShell = penShell;
    }

    //功能
    public void write() {
        System.out.println("写字:ok,颜色:" + refill.getColor() + ",笔壳颜色:" + penShell.getColor());
    }
}
