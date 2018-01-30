package com.wangzai.desgin.visitor;

import java.util.List;

public class WangZai implements Visitor{

    SystemA systemA;
    SystemB systemB;

    //查看系统A所有文件
    @Override
    public void saveSystemAPermission(SystemA systemA) {
        this.systemA = systemA;
    }

    //查看系统B所有文件
    @Override
    public void saveSystemBPermission(SystemB systemB) {
        this.systemB = systemB;
    }



    @Override
    public List<String> getSysmtemAFiles() throws Exception{
        if(systemA == null){
            throw new Exception("错误:您还为获取系统A的权限");
        }
        return systemA.getFileList();
    }

    @Override
    public List<String> getSysmtemBFiles()throws  Exception {
        if (systemB == null){
            throw new Exception("错误:您还为获取系统B的权限");
        }
        return systemB.getFileList();
    }
}
