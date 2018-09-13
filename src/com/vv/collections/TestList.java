package com.vv.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vv on 2018/9/5.
 */
public class TestList {
    //ArrayList是List的主要实现类  有序 可重复  动态数组
    @Test
    public void testList() {
        List list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(new String("AA"));
        list.add(new String("GG"));
        System.out.println(list); //有序的 添加的顺序   存储结构还是数组
        //指定的索引位置添加元素
        list.add(0, "VV");
        System.out.println(list);
        Object object = list.get(1);
        System.out.println(object);
        list.remove(0);
        System.out.println(list.get(0));
        list.set(0,231);
        System.out.println(list.get(0));
        System.out.println(list.get(0));
    }
}
