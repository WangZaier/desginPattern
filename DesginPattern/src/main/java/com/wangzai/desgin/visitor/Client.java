package com.wangzai.desgin.visitor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {


    public static void main(String[] args) throws Exception {
        //自己瞎鸡儿定义一波文件
        String[] filesA = {"wangzai.jpg", "dog.jpg", "Controller.java", "test.swift", "videos.log", "por...video.mp4"};
        List<String> listA = new ArrayList<>();
        listA.addAll(Arrays.asList(filesA));
        String[] filesB = {"wangzai.jpg", "dog.jpg", "Controller.java", "por...video3.avi", "por...video2.mp4", "por...video.mp4"};
        List<String> listB = new ArrayList<>();
        listB.addAll(Arrays.asList(filesB));

        //初始化系统
        System systemA = new SystemA(listA);
        System systemB = new SystemB(listB);


        //初始化用户
        Visitor wangZai = new WangZai();

        //授权中心
        AuthorizationCenter authorizationCenter = new AuthorizationCenter();

        //添加需要授权的系统
        authorizationCenter.addSystem(systemA);
        authorizationCenter.addSystem(systemB);

        //未授权以后查看会显示未授权
        //wangZai.getSysmtemAFiles();


        //为"WangZai"用户添加权限
        authorizationCenter.addPerssion(wangZai);

        //查看A系统
        List<String> sysmtemAFiles = wangZai.getSysmtemAFiles();
        java.lang.System.out.println("系统A");
        sysmtemAFiles.forEach(java.lang.System.out::println);
        java.lang.System.out.println("---------------");
        //查看B系统
        List<String> sysmtemBFiles = wangZai.getSysmtemBFiles();
        java.lang.System.out.println("系统B");
        sysmtemBFiles.forEach(java.lang.System.out::println);
        java.lang.System.out.println("---------------");
    }
}
