package com.vv.oop;

/**
 * Created by vv on 2018/8/20.
 */
public class TestObject {

}

class Circle {
    double radius;

    public double findAreas() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static class PassObject {
        public void printAreas(Circle c, int time) {
            System.out.println("Radius" + "\t\t" + "Area");
            for (int i = 1; i <= time; i++) {
                c.setRadius(i);
                System.out.println(c.getRadius() + "\t\t" + c.findAreas());
            }
        }
    }

    public static void main(String[] args) {
        PassObject passObject = new PassObject();
        Circle circle = new Circle();
           passObject.printAreas(circle,5);
        System.out.println(circle.getRadius());
        passObject.printAreas(new Circle(),6);//匿名类对象,创建的类的对象是匿名的  当我们只需要一次调用的时候,考虑匿名
      //  System.out.println(circle.getRadius());
    }
}