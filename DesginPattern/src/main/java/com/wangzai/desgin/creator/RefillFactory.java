package com.wangzai.desgin.creator;

//笔芯生产
public class RefillFactory {

    //生产笔芯
    public Refill create(String color){
        return new Refill(color);
    }


}
