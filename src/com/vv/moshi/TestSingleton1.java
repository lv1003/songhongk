package com.vv.moshi;

/**
 * Created by vv on 2018/8/30.
 */
public class TestSingleton1 {

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

//懒汉式  可能存在线程安全问题

class Singleton1 {
    public Singleton1() {
    }

    private static Singleton1 instance = null;

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}