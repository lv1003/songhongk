package com.vv.thisexer;

import com.vv.oop.TestArgs;

/**
 * Created by vv on 2018/8/24.
 */
public class TestTriAngle {//Angle 角   Angel 天使 host guest

    public static void main(String[] args) {
        TriAngle triAngle=new TriAngle();
        triAngle.setBase(2.3);
        triAngle.setHeight(1.2);
        System.out.println("面积为:"+triAngle.findArea());
    }
}

class TriAngle {
    private double base;//底边长
    private double height;//高

    public TriAngle() {
        this.height=1.0;
        this.base=1.0;
    }

    public TriAngle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea(){
        return base*height/2;
    }

}