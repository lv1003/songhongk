package com.vv.abstractt;

/**
 * Created by vv on 2018/8/31.
 */
public class TestAbstract {
    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
        //多态  编译看左边(看类型) 运行看右边
        Person person = new Worker();
        person.eat();

    }
}

//抽象类 不可被实例化    有构造器(凡是类都有构造器)
abstract class Person {
    String name;

    //抽象方法 , 没有方法体 包括大括号  抽象方法只保留方法功能 而具体执行  交给继承抽象类子类 由子类重写此抽象方法
    //抽象方法所在得类 一定是抽象类.
    //抽象类可以继承
    abstract public void eat();

    abstract public void walk();

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }
}


class Student extends Person {
    public void eat() {
        System.out.println("学生吃饭");
    }

    public void walk() {
        System.out.println("学生走路");
    }
}

class Worker extends Person {
    public void eat() {
        System.out.println("工人吃饭");
    }

    public void walk() {
        System.out.println("工人走路");
    }
}

