package com.javasm.design.observer;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 22:07
 * @function 公众号 被观察者
 */
public interface PublicAccounts {

    //注册
    void register(WeChatUser weChatUser);
    //注销
    void destroy(WeChatUser weChatUser);
    //发消息给关注的人（观察者）
    void push(String message);
}
