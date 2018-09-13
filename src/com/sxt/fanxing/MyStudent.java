package com.sxt.fanxing;

/**
 * Created by vv on 2018/9/9.
 * 自定义泛型类
 * 属性不能是静态属性  泛型不能使用在静态属性
 *
 */
public class MyStudent<T> {
    //成绩
    private T javase;

    public MyStudent() {
    }

    public MyStudent(T javase) {
        this.javase = javase;
    }

    public T getJavase() {
        return javase;
    }

    public void setJavase(T javase) {
        this.javase = javase;
    }

}

