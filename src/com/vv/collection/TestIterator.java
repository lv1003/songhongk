package com.vv.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by vv on 2018/8/18.
 */
public class TestIterator {
    @Test
    public void iteratorTest() {
        Collection collection = new ArrayList<>();
        collection.add("ss");
        collection.add(123);//包装类 Integer
        collection.add(new Date());
        collection.add("BB");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //使用增强for循环实现集合的遍历, 也可以实现数组的遍历   使用迭代器遍历Iterator
    @Test
    public void testFor() {
        Collection collection = new ArrayList<>();
        collection.add("ss");
        collection.add(12223);//包装类 Integer
        collection.add(new Date());
        collection.add("BB");
        for (Object i : collection) {
            System.out.println(i);
        }
    }

    //数组遍历
    @Test
    public void arrayFor(){
        int [] a=new int[]{1,2,3,4,5,6,7,8};
        for (int i:a){
            System.out.println(i);
        }
    }
}
