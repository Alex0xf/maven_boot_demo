package com.javasm.design.factory.simple;

import com.javasm.design.common.user.IUserService;
import com.javasm.design.common.user.impl.AdminUserServiceImpl;
import com.javasm.design.common.user.impl.DealerUserServiceImpl;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 18:14
 * @function 简单工厂的例子
 */
public class UserServiceSimpleFactory {
    //创建adminUser的实例
    public static IUserService creatAdminUser(){
        System.out.println("创建AdminUser实例 加入日志");
        return new AdminUserServiceImpl();
    }

    public static IUserService creatDealerUser(){
        System.out.println("创建DealerUser实例 加入日志");
        return new DealerUserServiceImpl();
    }

    //简单工厂优化 传入什么类型 制造什么类型的对象实例
    //已经不处于工厂模式了 工厂不需要知道具体的创建对象的过程
    //也不需要传class
    public static Object creat(Class<?> clazz){
        //前提这个传的类必须有无参构造方法
        Object obj=null;
        try {//由无参构造方法获得对象实例
            obj=clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return obj;
    }

}
