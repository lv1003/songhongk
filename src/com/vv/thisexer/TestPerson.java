package com.vv.thisexer;

/**
 * Created by vv on 2018/8/24.
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(10);
        person.info();
        person.setName("李磊");
        person.info();
    }
}

class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //封装性
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("人吃饭");
    }

    public void sleep() {
        System.out.println("人睡觉");
    }

    public void info() {
        System.out.println("name:\t" + name + "\t\tage:\t " + age);
    }

    public void show() {
        System.out.println("我是一个人");
    }

}