package com.vv.baozhaunglei;

import org.junit.Test;

/**
 * Created by vv on 2018/8/29.
 */
public class TestJunit {
    public static void main(String[] args) {
        String str = "AA";
        System.out.println(str);
    }

    @Test
    public void test2() {

    }

    @Test
    public void test1() {
        String str = "AA";
        System.out.println(str);
        m1();
    }

    public void m1() {
        System.out.println("hello world");
    }
}
