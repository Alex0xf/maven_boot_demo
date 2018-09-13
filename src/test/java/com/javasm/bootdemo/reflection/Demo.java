package com.javasm.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Alex
 * @creartTime 2018/8/31 - 23:20
 * @function
 */
public class Demo {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
        //获得GameModel类信息
        Class clazz=GameModel.class;
        //获得参数为一个String类的构造方法
        Constructor constructor = clazz.getConstructor(String.class);
        Constructor constructor1 = clazz.getConstructor(int.class,String.class);
        //System.out.println("constructor = " + constructor);
        //获得所有public的构造方法
        Constructor[] cons = clazz.getConstructors();
        for (Constructor con : cons) {
            //System.out.println("con = " + con);
        }
        //拿到所有的构造方法 包括private
        Constructor[] deCons = clazz.getDeclaredConstructors();
        for (Constructor deCon : deCons) {
            //System.out.println("deCon = " + deCon);
        }
        //获得一个对象
        GameModel gameModel =(GameModel) clazz.newInstance();
        //必须指定参数的类型才能通过有参的构造方法获得对象
        //GameModel gameModel1=(GameModel) constructor.newInstance("Alex");
        //想要用构造函数实例化对象吗，只能通过类型为public的构造函数，其他都不行
        GameModel gameModel2=(GameModel) constructor1.newInstance(11,"Alex");
        //System.out.println("gameModel = " + gameModel);
        //System.out.println("gameModel1 = " + gameModel1);
        System.out.println("gameModel2 = " + gameModel2);

        //获得成员变量 类似获得构造函数
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }
        //获得所有的成员变量
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredField = " + declaredField);
        }
        //获得变量值
        Field url = clazz.getField("urlx");
        System.out.println("url = " + url);
        //更改变量的值

        //获得方法

        //暴力访问
        //调用方法

        //获取方法名
        //获取方法的所有属性Class
        //获得javaBean的set get方法

    }
}
