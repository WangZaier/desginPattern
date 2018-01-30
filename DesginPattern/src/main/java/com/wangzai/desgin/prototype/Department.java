package com.wangzai.desgin.prototype;

import java.util.List;

public class Department implements Cloneable{

    //部门名字
    private  String deptartmentName;

    public String getDeptartmentName() {
        return deptartmentName;
    }

    public void setDeptartmentName(String deptartmentName) {
        this.deptartmentName = deptartmentName;
    }

    public Department(String deptartmentName) {
        this.deptartmentName = deptartmentName;
    }

    @Override
    protected Department clone() throws CloneNotSupportedException {
        Department department = (Department)super.clone();
        return department;
    }
}
