package com.vv.extendse;

/**
 * Created by vv on 2018/8/27.
 */
public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    //圆柱的体积
    public double findVolume(){
        return findArea()*length;
    }
    //圆柱表面积
    public double findArea() {
        double area = Math.PI * getRadius() *getRadius()*2+(2*Math.PI*getRadius()*length);
        return area;
    }
}
