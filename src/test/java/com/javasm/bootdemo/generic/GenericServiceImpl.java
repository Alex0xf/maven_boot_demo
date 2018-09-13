package com.javasm.generic;

/**
 * @author Alex
 * @creartTime 2018/8/31 - 20:25
 * @function 当前的实现类也是一个泛型 没有具体指定
 */
public class GenericServiceImpl<T> implements IGenericService<T> {
    @Override
    public T creatObject() {
        return null;
    }
}
