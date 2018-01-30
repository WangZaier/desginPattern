package com.wangzai.desgin.adapter;


//把英文转成中文
public class ChineseAdapter extends Chinese{

    public ChineseAdapter() {
    }

    public ChineseAdapter(English english) {
        this.setSay(english.getSay() + "=>中文转换完成!");
    }
}
