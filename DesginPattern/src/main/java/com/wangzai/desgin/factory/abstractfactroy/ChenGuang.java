package com.wangzai.desgin.factory.abstractfactroy;


//其实跟方法工厂差不多嘛.就是在封装了一层抽象文具(4中不同的类型).一层抽象工厂(用于代工生产).
//公司
public class ChenGuang {
    //向工厂发出生产铅笔命令
    public static void main(String[] args){
        //工厂对象
        ChenGuangFactory factory = new ChenGuangFactory();
        //创建铅笔
        Stationery pencil = factory.createPencil();
        //晨光铅笔行为
        pencil.product();
        pencil.manufacturer();
        pencil.price();

    }
}
