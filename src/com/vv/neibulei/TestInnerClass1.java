package com.vv.neibulei;

/**
 * Created by vv on 2018/9/3.
 * 关于局部内部类
 */
public class TestInnerClass1 {


}

class OuterClass {
    //局部内部类
    public void method() {
        class InnerClass {

        }
    }

    //常用  使用一个方法 使其 返回值为某个类或接口的对象
    // 二这个类或接口在方法内部创建
    public Comparable getComparable() {
        //创建一个实现 接口的类 局部内部类
        class MyComparable implements Comparable {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        //返回一个实现类的对象
        return new MyComparable();
    }

    public Comparable getComparable1(){
        //匿名的局部内部类  返回一实现接口的匿名内部类的对象  实现接口的匿名类
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}


