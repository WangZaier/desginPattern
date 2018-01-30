package com.wangzai.desgin.TemplateMethod;

public class Client {

    public static void main(String[] args) {
        //初始化游戏
        Fgo fgo = new Fgo();
        War3 war3 = new War3();

        //开始玩
        fgo.run();
        war3.run();

    }
}
