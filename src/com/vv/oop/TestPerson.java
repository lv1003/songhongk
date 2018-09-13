package com.vv.oop;

/**
 * Created by vv on 2018/8/18.
 * 1.面向对象的编程关注于类的设计
 * 2.设计类实际上就是设计类的成员
 * 3.基本的类的成员:
 * 属性: 成员变量
 * 方法: 成员方法
 */
public class TestPerson {

}
//类是抽象的
class Person {
    //1.属性
    String name;
    int age;
    boolean sex;

    //2.方法
    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void info(){
        eat();
        sleep();
        System.out.println("name:"+name+"age:"+age+"sex"+sex);
    }



}