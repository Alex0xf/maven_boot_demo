package com.javasm.design.observer;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 22:04
 * @function 观察者
 */
public class Observer extends WeChatUser {


    public Observer(String name) {
        this.name=name;
    }

    @Override
    void move(String message) {
        System.out.println(super.name+"得到消息："+message);
    }
}
