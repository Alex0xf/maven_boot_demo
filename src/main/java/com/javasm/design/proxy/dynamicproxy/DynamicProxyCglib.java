package com.javasm.design.proxy.dynamicproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Alex
 * @creartTime 2018/9/3 - 17:39
 * @function cglib实现动态代理
 */
public class DynamicProxyCglib implements MethodInterceptor{

    private Object object;

    public Object bind(Object o){
        this.object=o;
        //创建加强器
        Enhancer enhancer=new Enhancer();
        //为加强器指定代理的业务类
        enhancer.setSuperclass(o.getClass());
        //设置回调，对于代理类上所有方法的调用，都会调用CallBack，而CallBack则需要intercept()方法拦截
        enhancer.setCallback(this);
        //动态创建代理类并返回
        return enhancer.create();
    }

    //实现MethodInterceptor方法代理接口，创建代理类
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib:记录日志或开启事务");
        Object result = method.invoke(object, objects);
        System.out.println("cglib:计算运行时间或关闭事务");
        return result;
    }
}
