package com.wangzai.desgin.visitor;

import java.util.List;

public interface Visitor {

    //保存权限赋予
    void saveSystemAPermission(SystemA systemA);
    //保存权限赋予
    void saveSystemBPermission(SystemB systemB);


    //查看系统A的文件
    List<String> getSysmtemAFiles() throws Exception;
    //查看系统B的文件
    List<String> getSysmtemBFiles() throws Exception;
}
