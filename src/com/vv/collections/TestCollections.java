package com.vv.collections;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by vv on 2018/9/6.
 * 操作集合的工具类 Collection Map ：Collections
 */
public class TestCollections {
    @Test
    public void testCollections1() {
        List list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(12);
        list.add(78);
        list.add(78);
        //工具类中的方法是静态的
        System.out.println(list);
        Collections.reverse(list);//反转
        System.out.println(list);
        Collections.shuffle(list);//随机排列
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.swap(list, 0, 2);// 第0个位置和第3个位置交换顺序
        System.out.println(list);
        Object max=Collections.max(list);//最大值
        System.out.println(max);
         int count=Collections.frequency(list,78);
        System.out.println(count);
        //List list1=new ArrayList<>();
        List list1= Arrays.asList(new Object[list.size()]);//复制长度一样高
        Collections.copy(list1,list);
        System.out.println(list1);
        //list2 线程安全  通过如下的方法保证list 的线程安全性
        List list2 = Collections.synchronizedList(list);


    }
}
