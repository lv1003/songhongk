package com.mooc.shejimoshi;

/**
 * Created by vv on 2018/9/7.
 * 懒汉模式
 */
public class Singleton2 {
    //1.将构造方法私有化,不容许外部直接创建对象
    private Singleton2() {

    }

    //2.创建类的唯一实例,使用 private static 修饰
    private static Singleton2 instance;  //只是声明 并没有实例化
    //3.提供获取实例的方法
    public static Singleton2 getInstance(){
        if (instance==null){
            instance=new Singleton2();
        }
        return instance;
    }
}
