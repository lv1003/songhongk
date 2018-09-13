package com.sxt.fanxin;

/**
 * Created by vv on 2018/9/10.
 * 泛型父类
 * 继承抽象父类
 * 1.保留父类的泛型--->子类为泛型子类
 * 2.不保留父类泛型--->子类按需实现即可
 *
 * 子类重写 override方法的类型随着父类而定
 *
 */
public abstract class Father<T1, T2> {
    T1 age;
    public abstract void test(T2 name);
}

//保留
//1.全部保留  --->泛型子类
class C1<T1, T2, A, B> extends Father<T1, T2> {
     B Sex;
    @Override
    public void test(T2 name) {
     // this.age--->T1
    }
}

//2.部分保留
class C2<T2, A, B> extends Father<Integer, T2> {

    @Override
    public void test(T2 name) {
        //  this.age  -->Integer
    }
}

//不保留---->按需实现
//1.具体类型
class C3 extends Father<Integer, String> {

    @Override
    public void test(String name) {
//  this.age  -->Integer
    }
}

//2.没有类型
class C4 extends Father {

    @Override
    public void test(Object name) {
//  this.age  -->Object
    }
}