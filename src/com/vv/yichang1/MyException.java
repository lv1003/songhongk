package com.vv.yichang1;

/**
 * Created by vv on 2018/9/4.
 * 自定义一个异常类
 * 1.自定义异常类继承现有的异常类
 * 2.提供一个序列号  提供重载的构造器
 *
 */
public class MyException extends Exception {
    // 序列号  唯一的确定异常类的对象   全局常量
    static final long serialVersionUID = -703483290745766939L;

    public MyException() {
    }

    public MyException(String msg) {
        super(msg);
    }

    public void printStackTrace(String message) {
    }
}
