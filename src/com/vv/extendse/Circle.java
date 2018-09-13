package com.vv.extendse;

/**
 * Created by vv on 2018/8/27.
 */
public class Circle {
    private double radius;

    public Circle() {
        radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
