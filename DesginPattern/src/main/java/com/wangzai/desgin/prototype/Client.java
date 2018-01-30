package com.wangzai.desgin.prototype;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Client {

    //我们开始下发任务
    public static void main(String[] args) throws CloneNotSupportedException{

        //定义衣服订单模版,其他属性..我想不出来了哭哭
        ClothesOrder clothesOrder = new ClothesOrder();
        clothesOrder.setMaker("xxx有限公司");

        //假设我们也已经查询出部门信息
        Department deptA = new Department("部门A");
        Department deptB = new Department("部门B");

        //假设数据查出来了.遍历衣服需求并填充订单模版
        for (int i = 0 ; i < 5 ; i++){
            //模拟随机分配任务
            int radmon = new Random().nextInt(2);
            if(radmon == 0){
                clothesOrder.setDepartment(deptA);
            }
            if(radmon == 1){
                clothesOrder.setDepartment(deptB);
            }
            //拷贝模版
            ClothesOrder cloneClotherOrder = clothesOrder.clone();

            //注入数据（就当他是从数据库查出来的吧233）
            cloneClotherOrder.setColor("red");
            cloneClotherOrder.setStyle("冬季款");

            Client client = new Client();
            client.send(cloneClotherOrder);
        }

    }


    public void send(ClothesOrder clothesOrder) {
        System.out.println("任务已经下发到部门:" + clothesOrder.getDepartment().getDeptartmentName() +
                "，衣服的样式:" + clothesOrder.getStyle() + "，衣服的颜色:" + clothesOrder.getColor());
    }
}