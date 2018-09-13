package com.javasm.generic;

import com.javasm.user.model.UserModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex
 * @creartTime 2018/8/31 - 19:58
 * @function 测试泛型类
 */
public class Demo {

    public static void main(String[] args) {
        GenericTest<Integer> genericTestInteger=new GenericTest<>(123);
        System.out.println(genericTestInteger.getT());
        UserModel user=new GenericTest<>(new UserModel("Alex",1,"123456")).getT();
        System.out.println("user = " + user);
        //调用泛型方法
        Demo demo = new Demo();
        UserModel user2 = demo.test(UserModel.class,213);
        System.out.println("user1 = " + user2);
        //可以传任意多个参数 且参数类型是可变的 因为写了...
       // demo.printMsg(123,"小明","Alex",user,12.4);
        demo.printMsgo(123,"小明","Alex",user,12.4);
        printMsg(123,"小明","Alex",user,12.4);
        List<?>[] lists = new ArrayList<?>[10];
        
    }

    //定义一个泛型方法 和反射结合 传递一个class值 返回一个实例
    //给泛型方法加上下边界
    public <T,E extends Number> T test(Class<T> tClass,E e){
        try {
            System.out.println("e = " + e);
            return tClass.newInstance();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    //静态的方法使用泛型 必须定义成泛型方法
    public static <T> void printMsg(T... msgs){
        for (T t : msgs) {
            System.out.println("t = " + t);
        }
    }

    //...代表可变参数 使用的时候可以当数组来使用
    public void printMsgo(Object... msgs){
        for (Object object : msgs) {
            System.out.println("object = " + object);
        }
    }

}
