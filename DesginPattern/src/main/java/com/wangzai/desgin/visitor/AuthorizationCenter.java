package com.wangzai.desgin.visitor;


import java.util.ArrayList;
import java.util.List;

//授权中心
//调用链： 传入系统A,B,放在List中——>传入用户->遍历list调用accept(Visitor visitor)方法->调用visitor.xxx(this)把自己传过去->保存"this"->调用"this"查看系统文件
public class AuthorizationCenter {

    List<System> systemList = new ArrayList<>();

    //添加需要授权的系统
    public void addSystem(System system){
        systemList.add(system);
    }

    //为传入的用户添加系统权限
    public void addPerssion(Visitor visitor){
        for (System system : systemList) {
            //逐个把系统授权添加到用户
            system.accept(visitor);
        }
    }
}
