package com.javasm.design.common.user.impl;

        import com.javasm.design.common.user.IUserService;

public class DealerUserServiceImpl implements IUserService{

    @Override
    public void save() {

        System.out.println("经销商角色的用户save方法被执行");
    }

}
