package com.wangzai.desgin.creator;

public class Client {

    public static void main(String[] args){
        //指挥者
        Director director = new Director();

        //红笔
        Pen redPencil = director.createRedPencil();
        redPencil.write();
        //黑笔
        Pen blackPencil = director.createBlackPencil();
        blackPencil.write();

        //红色黑壳笔
        Pen redPenBlackPenShell = director.createRedBuilderByPenShellColor("black");
        redPenBlackPenShell.write();
        //黑色绿壳笔
        Pen blackPenGreenPenShell = director.createBlackBuilderByPenShellColor("green");
        blackPenGreenPenShell.write();
    }
}
