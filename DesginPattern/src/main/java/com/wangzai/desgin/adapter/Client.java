package com.wangzai.desgin.adapter;

public class Client {

    public static void main(String[] args){

        //一个英国人
        English english = new English();
        //组织语言,稍加思考,忘了说啥
        english.setSay("hello world");

        //转换器,输入英文
        Chinese chinese = new ChineseAdapter(english);
        //让我们看看这个英国人说了啥
        System.out.println(chinese.getSay());

    }
}
