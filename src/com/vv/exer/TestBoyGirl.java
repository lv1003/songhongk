package com.vv.exer;

/**
 * Created by vv on 2018/8/25.
 */
public class TestBoyGirl {
    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setName("lili");
        boy.setAge(23);
        Girl girl = new Girl();
        girl.setName("小兰");
        boy.marry(girl);
        boy.shout();
        System.out.println();
        girl.marry(boy);
    }

}
