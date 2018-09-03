package com.javasm.design.observer;

import java.util.List;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 22:09
 * @function 具体的公众号 名字叫JavaCode的公众号
 */
public class JavaCode implements PublicAccounts {

    //观察者的集合
    List<WeChatUser> obList;

    public JavaCode(List<WeChatUser> obList) {
        this.obList = obList;
    }

    //注册
    @Override
    public void register(WeChatUser weChatUser) {
        System.out.println(weChatUser.name+"关注了JavaCode公众号");
        if(obList!=null){
            obList.add(weChatUser);
        }
    }

    @Override
    public void destroy(WeChatUser weChatUser) {
        System.out.println(weChatUser.name+"取消了关注JavaCode公众号");
        if (obList != null) {
            obList.remove(weChatUser);
        }
    }

    //发消息给所有关注的人（观察者）
    @Override
    public void push(String message) {
        for (WeChatUser weChatUser : obList) {
            weChatUser.move("JavaCode发送了消息："+message);
        }
    }
}
