package com.vv.Annotation;

/**
 * Created by vv on 2018/9/8.
 * 注解
 * 1.JDK提供的常用的注解
 * 2.如何自定义注解
 * 3.元注解
 */
public class TestAnnotation {
    public static void main(String[] args) {
        Person person=new Student();//已经过时
        person.walk();
        person.eat(); //可以执行
    }

}
@MyAnnotation(value = "atguigu")
class Student extends Person{
    @MyAnnotation(value = "atguigu")
    public void walk(){
        System.out.println("学生走路");
    }
    @Override
    public void eat(){
        System.out.println("学生吃饭");
    }
}
@Deprecated
class Person{

    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void walk(){
        System.out.println("走路");
    }
    @Deprecated  //已过时
    public void eat(){
        System.out.println("吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String  toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
