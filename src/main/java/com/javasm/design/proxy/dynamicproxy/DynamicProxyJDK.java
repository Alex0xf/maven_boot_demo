package com.javasm.design.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 17:21
 * @function JDK实现动态代理
 */
public class DynamicProxyJDK implements InvocationHandler {

    //真实类对象
    private Object object;

    //绑定的方法 把对象实例 绑定到代理对象
    //通过这个方法可以在调用的地方拿对应的的对象类型
    public Object bind(Object o){
        this.object=o;
        //获取真实对象的class类信息
        Class clazz=o.getClass();
        Object newObject=Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
        return newObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK:收到工资30000");
        Object result = method.invoke(object, args);
        System.out.println("JDK:给程序猿5000");
        return result;
    }
}
