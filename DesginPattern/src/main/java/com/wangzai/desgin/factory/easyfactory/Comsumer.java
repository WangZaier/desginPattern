package com.wangzai.desgin.factory.easyfactory;

import com.wangzai.desgin.factory.easyfactory.*;

public class Comsumer {

    public static void main(String[] args){
        StationeryFactory factory = new StationeryFactory();

        Stationery rubble = factory.create("Rubber");
        Stationery pencil = factory.create("Pencil");

        //错误的参数
        Stationery errorCode = factory.create("xxxx");


        //测试行为
        rubble.product();
        pencil.product();
        errorCode.product();
    }
}
