package com.javasm.design.proxy.dynamicproxy;

import com.javasm.design.common.user.IUserService;
import com.javasm.design.common.user.impl.UserServiceImpl;
import com.javasm.design.proxy.staticproxy.ICodeMonkey;
import com.javasm.design.proxy.staticproxy.LiLei;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 17:29
 * @function
 */
public class Baidu {

    public static void main(String[] args) {
        //通过JDK创建的动态代理
        ICodeMonkey codeMonkey=(ICodeMonkey)new DynamicProxyJDK().bind(new LiLei());
        codeMonkey.code();
        //测试传入其他方法是否也适用
        IUserService userService=(IUserService)new DynamicProxyJDK().bind(new UserServiceImpl());
        userService.save();
        //通过cgLib创建的动态代理
        IUserService userService2=(IUserService)new DynamicProxyCglib().bind(new UserServiceImpl());
        userService2.save();

    }
}
