package com.wangzai.desgin.adapter;

public class EnglishAdapter extends English{


    public EnglishAdapter() {
    }
    public EnglishAdapter(Chinese chinese) {
        this.setSay(chinese.getSay() + "=>英文的转换已完成");
    }


}
