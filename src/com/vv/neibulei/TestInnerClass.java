package com.vv.neibulei;

/**
 * Created by vv on 2018/9/3.
 * 内部类     类的第五个成员
 */
public class TestInnerClass {
    public static void main(String[] args) {
        //创建静态内部类对象：可以直接通过外部类调用静态内部类的构造器
        Person.Dog d = new Person.Dog();
        //  Person.Bird b= new Person.Bird();    非静态的要有了对象以后 才能加载
        Person person = new Person();
        Person.Bird bird = person.new Bird();//用对象
        bird.info();
        bird.setName("张翰");

    }
}

class Person {
    String name="韩梅梅";
    int age;

    // 成员内部类 非静态的 非static
    class Bird {
        String name="黄鹏";
        int age;

        public Bird() {

        }

        public void setName(String name) {
            System.out.println(name);//张翰
            System.out.println(this.name);//黄鹏
            System.out.println(Person.this.name);//韩梅梅
        }

        public void info() {
            show();
        }
    }

    //成员内部类 ( 静态内部类 )
    static class Dog {

    }

    public void show() {
        System.out.println("我是show 方法");
    }

    public void method1() {
        //放在方法当中的是局部内部类
        class A {

        }
    }
}
