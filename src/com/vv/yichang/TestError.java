package com.vv.yichang;

/**
 * Created by vv on 2018/9/3.
 */
public class TestError {
    public static void main(String[] args) {
        //java.lang.StackOverflowError  栈溢出
        //  main(args);
        byte[] bytes = new byte[1024 * 1024 * 600*100];

    }
}
