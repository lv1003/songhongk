package com.vv.oop.test;

/**
 * Created by vv on 2018/8/19.
 */
public class TestPerson {
    public static void main(String[] args) {
        Person person=new Person();
        person.study();
        person.showAge();
        person.addAge(1);
        person.showAge();
    }

}

class Person {
    String neme;
    int age;
    int sex;

    public void study() {
        System.out.println("studying！");
    }

    public void showAge() {
        System.out.println(age);
    }

    public int addAge(int i) {
        age += i;
        return age;
    }

}
