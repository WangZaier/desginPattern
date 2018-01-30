package com.wangzai.desgin.creator;

public class BlackPenBuilder implements PenBuilder{

    @Override
    public Pen build() {
        //笔壳厂
        PenShellFactory penShellFactory = new PenShellFactory();
        //笔芯厂
        RefillFactory refillFactory = new RefillFactory();

        //开始生产
        PenShell penShell = penShellFactory.create();//默认透明
        Refill refill = refillFactory.create("black");


        //组装钢笔
        Pen pen = new Pen(refill,penShell);

        return pen;
    }

    @Override
    public Pen build(String penShellcolor) {
        //笔壳厂
        PenShellFactory penShellFactory = new PenShellFactory();
        //笔芯厂
        RefillFactory refillFactory = new RefillFactory();

        //开始生产
        PenShell penShell = penShellFactory.create();
        penShell.setColor(penShellcolor);//设置颜色
        Refill refill = refillFactory.create("black");


        //组装钢笔
        Pen pen = new Pen(refill,penShell);

        return pen;
    }
}
