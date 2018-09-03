package com.javasm.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 22:18
 * @function 测试观察这模式 SNS(social network service 社交网络服务)会用到
 */
public class Demo {

    public static void main(String[] args) {
        List<WeChatUser> obList=new ArrayList<>();
        //获取具体公众号（被观察者）对象实例
        PublicAccounts javaCode=new JavaCode(obList);
        //调用方法将观察者注册进观察列表
        javaCode.register(new Observer("张三"));
        javaCode.register(new Observer("李四"));
        Observer wangWU = new Observer("王五");
        javaCode.register(wangWU);
        //发消息
        javaCode.push("《Java编程思想》");
        //取消关注
        javaCode.destroy(wangWU);
        javaCode.push("《Java编程思想2》");
    }
}
