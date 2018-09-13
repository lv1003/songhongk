package com.mooc.shejimoshi;

/**
 * Created by vv on 2018/9/7.
 */
public class Test {
    public static void main(String[] args) {
        //饿汉模式
        //获取了singleton 的一个实例
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        if (singleton == singleton2) {
            System.out.println("s1和s2是同一个实例");
        } else {
            System.out.println("s1和s2不是同一个实例");
        }
        //懒汉模式
        Singleton2 singleton21 = Singleton2.getInstance();
        Singleton2 singleton22 = Singleton2.getInstance();
        if (singleton21==singleton22){
            System.out.println("S3和S4是同一个实例");
        }else {
            System.out.println("S3和S4不是同一个实例");
        }

    }
}
