package com.vv.oop.duotaiexer;

/**
 * Created by vv on 2018/8/28.
 * 多态的练习
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
        this.color="white";
        this.weight=1.0;
    }

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public double findArea(){
        return  0;
    }

}
