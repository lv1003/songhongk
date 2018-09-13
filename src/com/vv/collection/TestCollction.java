package com.vv.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/**
 * Created by vv on 2018/8/17.
 * 1.存储对象可以考虑：a数组  b 集合
 * 2.数组存储对象的特点：
 * Student[] stu=new Student[20];
 * stu[0]=new Student();
 * 弊端:
 * a.一旦创建,长度不可变.
 * b.真实的数组存放的对象的个数是不可知的.
 * 3.
 **/


public class TestCollction {
    @Test
    public void testCollection1() {
        Collection collection = new ArrayList<>();
        //多态只可以找到collection中的方法
        //1.size(); 集合中元素的个数
        System.out.println(collection.size());
        //2.add(Object obj)   向集合中添加一个元素  默认Object类型
        collection.add("ss");
        collection.add(123);//包装类 Integer
        collection.add(new Date());
        collection.add("BB");
        System.out.println(collection.size());
        //3.addAll(Collection coll);  将 形参 coll 中包含的所有元素添加到当前的集合中
        Collection collection1 = Arrays.asList(1, 2, 3);
        collection.addAll(collection1);
        System.out.println(collection.size());
        //4.isEmpty  判断集合是否唯空
        System.out.println(collection.isEmpty());
        //查看集合元素   ArrayList 重写了 toString 方法  打印集合元素
        System.out.println(collection);
        //5.clear();清空集合元素
        collection.clear();
        System.out.println(collection.isEmpty());

    }

    @Test
    public void testCollection2(){
        Collection collection = new ArrayList<>();
        collection.add("ss");
        collection.add(123);//包装类 Integer
        collection.add(new Date());
        collection.add("BB");
        //6.contains(Object obj)  判断集合中是否包含指定的obj 元素  如果包含返回true
         boolean b1=collection.contains(123);
        System.out.println(b1);
    }

}
