package com.vv.oop.duotaiexer;

import com.vv.extendse.*;

/**
 * Created by vv on 2018/8/28.
 */
public class TestGeometric {
    public static void main(String[] args) {
     TestGeometric t=new TestGeometric();
        Circle circle=new Circle("green",2.0,2.0);
        Circle circle1=new Circle("black",26.5,8.0);
        MyRectangle myRectangle=new MyRectangle("black",21,1.3,12.3);
        t.displayGeometricObject(circle);
        t.displayGeometricObject(circle1);
        t.displayGeometricObject(myRectangle);

        boolean b=t.equalsAreaa(circle,circle1);
        System.out.println(b);
    }

    //判断两个对象的面积是否相等
    public boolean equalsAreaa(GeometricObject geometricObject, GeometricObject geometricObject1) {
        if (geometricObject.findArea() == geometricObject1.findArea()) {
            return true;
        } else {
            return geometricObject.findArea() == geometricObject1.findArea();
        }
    }

     public void displayGeometricObject(GeometricObject object){
         System.out.println(object.findArea());
     }
}
