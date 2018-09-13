package com.sxt.fanxin;

/**
 * Created by vv on 2018/9/10.
 * 泛型接口 与泛型类 同理
 */
public interface Comparator<T> {
    //全局常量
    public static final int MAX_VALUE=100;
    //公共抽象方法
    public abstract void test(T t);
}

//实现
/*
class InterC1 implements Comparator {

}

class InterC1<A> implements Comparator {
}

class InterC2<T, A> implements Comparator<T> {

}*/
