package com.vv.interfaces;

/**
 * Created by vv on 2018/9/1.
 * 接口与具体的实现类之间也存在多态性
 */
public class TestInterfce1 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        TestInterfce1.test1(duck);
        TestInterfce1.test2(duck);
        TestInterfce1.test3(duck);

    }

    public static void test1(Runner runner) {//Runner r=new Duck();
        runner.run();
    }

    public static void test2(Swimmer swimmer) {//Swimmer s=new Duck();
        swimmer.swim();
    }

    public static void test3(Flier flier) {//Flier f=new Duck();
        flier.fly();
    }

}

interface Runner {
    public abstract void run();
}

interface Swimmer {
    public abstract void swim();
}

interface Flier {
    void fly();
}

class Duck implements Runner, Swimmer, Flier {

    @Override
    public void fly() {
        System.out.println("丑小鸭变成白天鹅");
    }

    @Override
    public void run() {
        System.out.println("红掌拨清波");
    }

    @Override
    public void swim() {
        System.out.println("鸭子游泳");
    }
}


