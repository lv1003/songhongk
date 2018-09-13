package com.mooc.shejimoshi;

/**
 * Created by vv on 2018/9/7.
 * 单例模式 Singleton
 * 应用场合: 只需要一个就够了 某个实例有且只有一个
 * 类型:
 * 饿汉模式  :加载类时 比较慢 运行时 获取对象快 ,线程安全的
 *
 *
 * 懒汉模式 :加载类时 比较快 运行时 获取对象慢,线程不安全的
 */
public class Singleton {
    //默认的构造方法,有构造方法就可以创建实例
    //1.默认的构造方法设置为私有化,不容许外部直接创建对象 至少要有一个
    private Singleton() {
    }

    //2.创建类的唯一实例 使用   privte static修饰  类加载的时候就会执行 饿汉式 不管调用否 快速 早些加载
    private static Singleton instance = new Singleton();
    //3.提供一个用于获取实例的方法  privte static修饰
    public static Singleton getInstance(){
        return instance;
    }

}
