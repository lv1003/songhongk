package com.vv.moshi;

/**
 * Created by vv on 2018/8/30.
 * 单例设计模式:使得一个类只能够创建一个对象(实例)
 */
public class TestSingketon {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton == singleton2);
    }
}

//只能创建Singleton的单个实例   饿汉式
class Singleton {
    //1.私有化构造器,使得在类的外部不能够调用此构造器
    public Singleton() {
    }

    //2.在类的内部创建一个类的实例
    private static Singleton instance = new Singleton();
    //3.私有化此对象,公共方法调用
    //4.此公共的方法只能通过类来调用,因为设置为static的, 同时类的实例也必须为static 声明的
    public static Singleton getInstance() {
        return instance;
    }
}