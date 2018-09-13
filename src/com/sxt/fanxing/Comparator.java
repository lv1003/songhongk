package com.sxt.fanxing;

import java.awt.image.VolatileImage;

/**
 * Created by vv on 2018/9/9.
 * 泛型不能使用在全局常量上
 */
public interface Comparator<T> {
    //全局常量
    public static final int MAX_VALU = 1024;

    //公共的抽象方法
    public abstract void compare(T t);
}
