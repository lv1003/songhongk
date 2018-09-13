package com.vv.exer;

/**
 * Created by vv on 2018/8/25.
 */
public class Girl {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy) {
        System.out.println("我要嫁给" + boy.getName());
        boy.marry(this);
    }

}
