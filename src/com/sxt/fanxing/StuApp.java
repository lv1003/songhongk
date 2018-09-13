package com.sxt.fanxing;

/**
 * Created by vv on 2018/9/9.
 * 没有泛型的类存储数据-->麻烦
 */
public class StuApp {
    public static void main(String[] args) {
        Student student = new Student(80);
        Object javase = student.getJavase();
        if (javase instanceof Integer) {
            Integer javaScore = (Integer) javase;
        }

        student=new Student("优秀");
         javase = student.getJavase();
        if (javase instanceof String) {
            String javaScore = (String) javase;
        }
    }
}
