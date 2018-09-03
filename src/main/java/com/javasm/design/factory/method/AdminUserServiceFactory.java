package com.javasm.design.factory.method;

import com.javasm.design.common.user.IUserService;
import com.javasm.design.common.user.impl.AdminUserServiceImpl;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 21:10
 * @function
 */
public class AdminUserServiceFactory implements UserServiceMethodFactory {

    @Override
    public IUserService create() {
        return new AdminUserServiceImpl();
    }
}
