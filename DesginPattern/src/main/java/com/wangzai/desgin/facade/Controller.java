package com.wangzai.desgin.facade;

import com.wangzai.desgin.prototype.Department;

public class Controller {

    DepartmentService departmentService = new DepartmentService();
    UserService userService = new UserService();
    //@RequestMapping("xxx")
    //模拟前端发送请求
    public void select(String id){

        System.out.println(departmentService.selectDeartmentById(id));
        System.out.println(userService.selectUserById(id));

    }
}
