package com.javasm.design.factory.simple;

import com.javasm.design.common.user.IUserService;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 18:26
 * @function 测试简单工厂
 */
public class Demo {

    public static void main(String[] args) {
        IUserService iUserService=UserServiceSimpleFactory.creatAdminUser();
        iUserService.save();
        IUserService iUserService2=UserServiceSimpleFactory.creatDealerUser();
        iUserService2.save();
        Object creat = UserServiceSimpleFactory.creat(iUserService.getClass());
        System.out.println("creat = " + creat);
    }
}
