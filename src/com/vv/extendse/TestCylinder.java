package com.vv.extendse;

/**
 * Created by vv on 2018/8/27.
 */
public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.3);
        cylinder.setLength(1.2);
        System.out.println(cylinder.findVolume());
        System.out.println(cylinder.findArea());//圆柱表面积
    }
}
