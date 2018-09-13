package com.vv.yichang1;

/**
 * Created by vv on 2018/9/4.
 */
public class TestCircle {
    public static void main(String[] args) throws MyException {
        Circle circle=new Circle(2.1);
        Circle circle1=new Circle(2.1);

        System.out.println(circle.compareTo(new String("vv")));
        System.out.println(circle.compareTo(circle1));
    }

    static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        //比较两个圆的半径的大小
        public int compareTo(Object object) throws MyException {
            if (this == object) {
                return 0;
            } else if (object instanceof Circle) {

                Circle circle = (Circle) object;
                if (this.getRadius() > circle.getRadius()) {
                    return 1;
                } else if (this.radius == circle.radius) {
                    return 0;
                } else {
                    return -1;
                }
            } else {
                // return -2;   不是同一个类型 可以手动的抛出一个异常
                throw new MyException("传入的类型有误！");
            }
        }
    }


}
