package com.vv.oop.duotaiexer;

/**
 * Created by vv on 2018/8/28.
 */
public class Circle extends GeometricObject {
    private double radius;


    public Circle(double v) {
        this.radius = 1.0;
    }

    public Circle(double radius, String color, double weight) {
        this.radius = radius;
        this.color = color;
        this.weight = weight;
    }


    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
        this.color = color;
        this.weight = weight;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Circle circle = (Circle) object;

        return Double.compare(circle.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }
}
