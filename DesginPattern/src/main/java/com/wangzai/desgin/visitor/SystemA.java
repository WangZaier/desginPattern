package com.wangzai.desgin.visitor;

import java.util.ArrayList;
import java.util.List;

public class SystemA implements System{

    List<String> fileList = new ArrayList<>();

    @Override
    public void accept(Visitor visitor) {
        //把SystemA传过去,等于赋予权限
        visitor.saveSystemAPermission(this);
    }

    public void setFileList(List<String> fileList) {
        this.fileList = fileList;
    }
    public List<String> getFileList() {
        return fileList;
    }

    public SystemA(List<String> fileList) {
        this.fileList = fileList;
    }

}
