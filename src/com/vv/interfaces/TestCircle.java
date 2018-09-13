package com.vv.interfaces;

/**
 * Created by vv on 2018/9/1.
 */
public class TestCircle {
    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(2.3);
        ComparableCircle comparableCircle2 = new ComparableCircle(2.1);
        ComparableCircle comparableCircle3 = new ComparableCircle(2.3);
        int i1 = comparableCircle1.compareTo(comparableCircle2);
        int i2 = comparableCircle1.compareTo( comparableCircle3);
        System.out.println(i1);
        System.out.println(i2);
    }
}

interface CompareObject {
    int compareTo(Object object) ;
}

class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class ComparableCircle extends Circle implements CompareObject, Object {
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object object) {
        if (this == object) {
            return 0;
        } else if (object instanceof ComparableCircle) {
            ComparableCircle comparableCircle = (ComparableCircle) object;
            if (this.getRadius() > comparableCircle.getRadius()) {
                return 1;
            } else if (this.getRadius() < comparableCircle.getRadius()) {
                return -1;
            } else {
                return 0;
            }
        } else {
            throw new RuntimeException("传入的非ComparableCircle的对象,不可进行比较");
        }
    }

    @Override
    public void action() {

    }
}