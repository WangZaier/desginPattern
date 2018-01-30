package com.wangzai.desgin.creator;

public class Director {

    PenBuilder redPenBuilder = new RedPenBuilder();
    PenBuilder blackPenBuilder = new BlackPenBuilder();

    //创建透明笔壳骚红色钢笔
    Pen createRedPencil(){
        return redPenBuilder.build();
    }
    //创建透明笔壳骚黑色钢笔
    Pen createBlackPencil(){
        return blackPenBuilder.build();
    }

    //制定笔壳颜色
    Pen createRedBuilderByPenShellColor(String penShellColor){
        return redPenBuilder.build(penShellColor);
    }
    Pen createBlackBuilderByPenShellColor(String penShellColor){
        return  blackPenBuilder.build(penShellColor);
    }

}
