package com.vv.oop;

/**
 * Created by vv on 2018/8/18.
 */
public class Zoo {
    public static void main(String[] args) {
        //基本数据类型的申明:   数据类型 变量名=初始化值
        int i = 10;
        //通过对象调用属性   类的实例化
        Anmial anmial = new Anmial();
        anmial.name = "欢欢";
        anmial.age = 3;
        System.out.println("name:" + anmial.name + "age:" + anmial.age);
        anmial.eat();
        anmial.sleep();
    }
}

class Anmial {
    //1.属性
    String name;
    int age;

    //2.方法
    public void eat() {
        System.out.println("动物进食");
    }

    public void sleep() {
        System.out.println("动物休眠");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}