package com.javasm.design.factory.method;

import com.javasm.design.common.user.IUserService;
import com.javasm.design.common.user.impl.UserServiceImpl;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 21:21
 * @function 新加的一个需求
 */
public class UserServiceFactory implements UserServiceMethodFactory {


    @Override
    public IUserService create() {
        return new UserServiceImpl();
    }
}
