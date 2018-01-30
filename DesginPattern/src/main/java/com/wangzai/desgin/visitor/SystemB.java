package com.wangzai.desgin.visitor;

import java.util.ArrayList;
import java.util.List;

public class SystemB implements System{

    List<String> fileList = new ArrayList<>();
    @Override
    public void accept(Visitor visitor) {
        visitor.saveSystemBPermission(this);
    }

    public void setFileList(List<String> fileList) {
        this.fileList = fileList;
    }

    public List<String> getFileList() {
        return fileList;
    }

    public SystemB(List<String> fileList) {
        this.fileList = fileList;
    }
}
