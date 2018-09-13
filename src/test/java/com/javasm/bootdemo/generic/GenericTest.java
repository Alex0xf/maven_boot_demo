package com.javasm.generic;

/**
 * @author Alex
 * @creartTime 2018/8/31 - 17:30
 * @function
 */
public class GenericTest<T> {

    private T t;//全局变量

    public GenericTest(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
