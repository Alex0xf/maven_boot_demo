package com.javasm.reflection;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author Alex
 * @creartTime 2018/9/1 - 0:34
 * @function 通过反射 把父类转换为子类
 * T为子类 S为父类
 */
public class FatherToSon<T extends S,S>{
    //举例 GameVO子类 GameModel父类
    public T change(T t,S s) throws IntrospectionException, InvocationTargetException, IllegalAccessException {
        //数据进来的时候 值在父类的对象中
        //获得子类的类对象
        Class<?> voClass=t .getClass().getSuperclass();//getclass不能拿到父类的方法 只能拿到父类的public属性
        //获得父类的类对象
        Class<?> modelClass=s.getClass();
        //获得父类所有的属性
        Field[] dfields = modelClass.getDeclaredFields();
        //循环父类属性
        for (Field dfield : dfields) {
            //获得属性名
            String key = dfield.getName();
            //获得get方法
            PropertyDescriptor pd = new PropertyDescriptor(key, modelClass);
            Method readMethod = pd.getReadMethod();
            //得到父类对象的值
            Object value = readMethod.invoke(s);
            //获得子类的set方法
            PropertyDescriptor pdt = new PropertyDescriptor(key, voClass);
            Method writeMethod = pdt.getWriteMethod();
            writeMethod.invoke(t ,value);
        }
        return t ;
    }

}
