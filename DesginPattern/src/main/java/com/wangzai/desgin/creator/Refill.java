package com.wangzai.desgin.creator;

//这是一个笔芯
public class Refill {
    //笔芯的颜色
    private String color;

    //确定颜色
    public Refill(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
