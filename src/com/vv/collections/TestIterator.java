package com.vv.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by vv on 2018/9/5.
 */
public class TestIterator {
    //增强for 循环遍历数组
    @Test
    public void testArrayFor() {
        String[] strings = new String[]{"AA", "BB", "DD"};
        for (String s : strings
                ) {
            System.out.println(s);
        }
    }


    //使用增强For 循环  实现集合遍历  也可以实现数组的遍历

    @Test
    public void testFor() {
        Collection collection = new ArrayList<>();
        collection.add(123);
        collection.add("AA");
        collection.add(new Date());
        collection.add("BB");
        collection.add(new Person("MM", 23));
        for (Object i : collection) {
            System.out.println(i);
        }
    }

    //迭代器遍历
    @Test
    public void test1() {
        Collection collection = new ArrayList<>();
        collection.add(123);
        collection.add("AA");
        collection.add(new Date());
        collection.add("BB");
        collection.add(new Person("MM", 23));
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
