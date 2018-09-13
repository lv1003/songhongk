package com.vv.oop.test;

/**
 * Created by vv on 2018/8/19.
 */
public class TestCircle {
    public static void main(String[] args) {
        TestCircle testCircle=new TestCircle();
        double a = testCircle.findArea(3.3);
        System.out.println(a);
    }

    public double findArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
}
