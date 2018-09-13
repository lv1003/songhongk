package com.sxt.fanxing;

/**
 * Created by vv on 2018/9/9.
 * 自定义泛型类的使用
 * ，在声明的同时制定具体的类型
 * ，不能为基本类型
 */
public class MyStuApp {
    public static void main(String[] args) {
     MyStudent<Integer> student =new MyStudent<Integer>();
       //自动类型检查
        student.setJavase(100);
        //省心
        Integer score= student.getJavase();
    }
}
