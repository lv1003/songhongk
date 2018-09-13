package com.vv.yichang1;

/**
 * Created by vv on 2018/9/4.
 */
public class TestFinally {
    public static void main(String[] args) {
        int i = method1();
        System.out.println(i);
    }

    public static int method1() {
        try {
            System.out.println(10/0);
            return 1;//没有异常执行这个
        } catch (Exception e) {
            e.printStackTrace();
            return 3; //有异常, 没有finally语句块 执行这个
        } finally {
            //finally 一定 会执行的代码
            System.out.println("我是finally");
         //   return 2;
        }
    }
}
