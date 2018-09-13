package com.sxt.fanxin;

/**
 * Created by vv on 2018/9/9.
 * 泛型的擦除:使用时| 实现|继承 没有指定类型
 * 类似于Object  不等同于Object
 *
 */
public class MyStuApp {
    public static void main(String[] args) {
        MyStudent student = new MyStudent();
        student.setJavase(100);
        Object o = student.getJavase();
        test(student);//编译不会类型检查
        MyStudent<Object> student2 = new MyStudent();
        //test(student2);  不等于Object  指定了Object 编译一定会类型检查
    }

    public static void test(MyStudent<Integer>student){

    }

}
