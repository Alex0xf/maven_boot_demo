package com.javasm.design.factory.method;

import com.javasm.design.common.user.IUserService;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 21:09
 * @function 工厂方法接口
 */
public interface UserServiceMethodFactory {

    IUserService create();
}