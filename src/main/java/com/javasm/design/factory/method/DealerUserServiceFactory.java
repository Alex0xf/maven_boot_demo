package com.javasm.design.factory.method;

import com.javasm.design.common.user.IUserService;
import com.javasm.design.common.user.impl.DealerUserServiceImpl;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 21:12
 * @function
 */
public class DealerUserServiceFactory implements UserServiceMethodFactory {

    @Override
    public IUserService create() {
        return new DealerUserServiceImpl();
    }
}
