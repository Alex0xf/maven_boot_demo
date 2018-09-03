package com.javasm.design.observer;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 22:04
 * @function 微信用户 角色是观察者
 */
public abstract class WeChatUser {
    //微信名
    public String name;

    //当被观察者发生变化时 调用的方法
    abstract void move(String message);

}
