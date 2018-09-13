package com.sxt.fanxing;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vv on 2018/9/9.
 * 泛型的入门
 * 1.泛型：标签，泛化类型
 * 2.作用：省心  安全
 */
public class Simple {
    public static void main(String[] args) {
        //声明容器 创建了容器对象
        List<String> list = new ArrayList<>();
        //安全  类型检查
        list.add("soeasy ");
        //省心
        String ele = list.get(0);
        System.out.println(ele);

    }
}
