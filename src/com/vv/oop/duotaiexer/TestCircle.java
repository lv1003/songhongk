package com.vv.oop.duotaiexer;

/**
 * Created by vv on 2018/8/29.
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.3);
        Circle circle1 = new Circle(2.3);
        System.out.println(circle.toString());
        System.out.println(circle.equals(circle1));
        System.out.println(circle.findArea());

    }
}
