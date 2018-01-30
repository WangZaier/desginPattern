package com.wangzai.desgin.Decorator;

public class Client {


    public static void main(String[] args){

        //初始化服务组件
        UserService userService = new UserServiceImpl();

        //初始具体装饰类
        UserDeleteDecorator userServiceDecorator = new UserDeleteDecorator(userService);

        //select是基本方法,也就是原本的服务这里的selectUsers 是调用"抽象装饰类"下私有的UserService.select.
        //也就是刚才传入的 userService
        userServiceDecorator.selectUsers();
        userServiceDecorator.userDelete("王二狗");
        //===上面只添加一个方法
        System.out.println("===========");


        //接下来又提出要求.还需要增加一个用户添加功能
        //还时那样.总之. "抽象装饰类" 的UserService 很关键
        // ,这样抽象类的userServuce就有了添加郃删除功能了 , 我们继续继承 "抽象装饰类" 扩展功能
        //可以看出装饰器模式的扩展是横向的
        //无法使用delete是因为 抽象装饰类中接受的是 UserService 类型的.类型擦除了，我也不好直接把它改成 指定具体的某个类
        //而且这个功能是后续添加的.我在抽象类中改代码(添加抽象方法,比如add,delete)又违反开闭原则,所以我上面和下面实例化用的都是具体类的类型
        //去**的开闭原则..总之这个坑先搁这儿..哪天脑子灵光了回来填坑
        //这样功能算是扩展上去了.但...噗
        //最后虽然实现了功能..但是..哎 这代码能看？23333
        //大家就当无事发生
        UserAddDecorator userAddDecorator = new UserAddDecorator(userServiceDecorator);
        userAddDecorator.userDelete("笨蛋蛋");
        userAddDecorator.addUsers("蛋蛋");
        userAddDecorator.selectUsers();


    }
}
