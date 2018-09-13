package com.vv.interfaces;

/**
 * Created by vv on 2018/9/1.
 * 接口 interfance  与类并行的一个概念
 * 1.接口可以看成是一个特殊的抽象类。是常量与抽象方法的一个集合。
 * 2.  class BB extends D implements A
 * 3.接口定义的就是一种功能 此功能可以被类所实现
 * 4.实现接口的类 必须重写其中所有的抽象方法,方可实例化  若没有重写所有的抽象方法 则此类仍为一个抽像类
 * 5.类可以实现多个接口 java中 继承是单继承的
 * 6.接口与接口之间也是继承关系   接口之间可以多继承
 */
public class TestInterface {
    public static void main(String[] args) {
        System.out.println(A.I);
    }
}

interface A {
    //常量   不能定义变量
    //接口是没有构造器的.不可以实例化    所有的类都有构造器   接口定义的就是一种功能 功能可以被类实现 implements
    public static final int I = 12;
    public static final boolean FLAG = false;

    //抽象方法 所有的都用 public abstract 修饰
    void method1();

    void method2();
}
interface M{
    void method3();
}

abstract class B implements A {

}

class D {

}

class BB extends D implements A,M {

    @Override
    public void method1() {
        System.out.println("实现接口");
    }

    @Override
    public void method2() {
        System.out.println("类实现接口");
    }

    @Override
    public void method3() {

    }
}


