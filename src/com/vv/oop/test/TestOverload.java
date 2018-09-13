package com.vv.oop.test;

/**
 * Created by vv on 2018/8/20.
 */
public class TestOverload {
    //定义两个变量int型的和
    public static void main(String[] args) {
    Overload overload=new Overload();
        double max = overload.getMax(1.1, 2, 3);
        System.out.println(max);
    }
}

class Overload {
    public int getSum(int i, int j) {
        return i + j;
    }

    public int getSum(int i, int j, int k) {
        return i + j + k;
    }

    public double getSum(double i, double j) {
        return i + j;
    }

    public void getSum(double i, double j, double k) {
        System.out.println(i + j + k);
    }

    public int getMax(int i, int j) {
        return (i > j) ? i : j;
    }

    public double getMax(double i, double j) {
        return (i > j) ? i : j;
    }

    public int getMax(int i, int j, int k) {
        return getMax(i, j) > k ? getMax(i, j) : k;
    }
    public double getMax(double i, double j, double k) {
        return getMax(i, j) > k ? getMax(i, j) : k;
    }
}

