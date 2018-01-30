package com.wangzai.desgin.prototype;


//订单pojo
public class ClothesOrder implements Cloneable {

    //制作方
    private String maker;

    //衣服颜色

    private String color;
    //款式

    private String style;

    //需要哪个部门做
    //这里初始化是因为这个暂时不确定
    //我们之确定maker,那我们在clone的时候报了一个
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }


    //我们这里虽然都是String,java似乎想让我把String作为基本数据处理
    //所以就算我们浅拷贝,但是这些属性还是独立的
    //Object 类提供的方法 clone 只是拷贝本对象其对象内部的数组、引用对象等都不拷贝
    @Override
    protected ClothesOrder clone() throws CloneNotSupportedException {
        //拷贝对象
        ClothesOrder clone = (ClothesOrder) super.clone();
        //将当前对象的引用也拷贝.不然只拷贝对象.引用指向的还是同一个(对啦,buckle既然要拷贝也免不了实现Cloneable咯)
        clone.department = this.department.clone();
        return clone;
    }



}
