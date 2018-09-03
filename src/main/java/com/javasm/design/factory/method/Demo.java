package com.javasm.design.factory.method;

import com.javasm.design.common.user.IUserService;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 21:13
 * @function
 */
public class Demo {

    public static void main(String[] args) {
        //选择一个要用的工厂 声明成接口工厂
        UserServiceMethodFactory factory = new DealerUserServiceFactory();
        //create对象实例
        IUserService userService=factory.create();
        //调用方法
        userService.save();
    }
}
