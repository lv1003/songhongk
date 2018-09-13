package com.vv.oop;

/**
 * Created by vv on 2018/8/21.
 * 可变个数的形参方法
 * 1.
 */
public class TestArgs {
    public static void main(String[] args) {
        TestArgs testArgs = new TestArgs();
        testArgs.sayHello();
        testArgs.sayHello("mimi");
        testArgs.sayHello(new String[]{"vivi", "cici", "cng"});
    }

    public void sayHello() {
        System.out.println("HelloWorld");
    }

    public void sayHello(String str1) {
        System.out.println("hello" + str1);
    }

    //可变个数形参的方法   在调用时 参数个数从 0个到无穷多个都可以  可以省略些重载的方法
    public void sayHello(String... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public void sayHellos(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    //可变个数的 加法
    public int getSum(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

}
