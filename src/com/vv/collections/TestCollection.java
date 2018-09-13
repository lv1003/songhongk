package com.vv.collections;

import org.junit.Test;

import java.util.*;

/**
 * Created by vv on 2018/9/4.
 * 存储对象可以考虑 a 数组 b 集合
 * 数组 :  一旦创建 长度是固定的(不可变)
 */
public class TestCollection {
    @Test
    public void testCollection3() {
        Collection collection = new ArrayList<>();
        collection.add(123);
        collection.add("AA");
        collection.add(new Date());
        collection.add("BB");
        collection.add(new Person("MM", 23));

        Collection collection1 = new ArrayList<>();
        collection1.add(123);
        collection1.add(new String("AA"));
        //10. 删除包含的
        collection.removeAll(collection1);
        System.out.println(collection);

        Collection collection2 = new ArrayList<>();
        collection2.add(123);
        collection2.add(new String("AA"));
        //11. equals    判断集合中所有元素是否相同
        System.out.println(collection1.equals(collection2));
        System.out.println("_____________________");
        //13 toArray()  将集合转化为数组  数组和集合转换
        Object[] objects = collection.toArray();
         for (int i=0;i<objects.length;i++){
             System.out.println(objects[i]);
         }

        //14 iterator(): 返回一个Iterator 接口实现类的对象
        System.out.println("+++++++++=");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println( iterator.next());
        }
    }


    @Test
    public void testCollection2() {
        Collection collection = new ArrayList<>();
        collection.add(123);
        collection.add("AA");
        collection.add(new Date());
        collection.add("BB");
        //Person person=new Person("MM",23); //true
        collection.add(new Person("MM", 23));
        System.out.println(collection);
        //6.contains(Object obj); 判断集合中是否包含指定的obj元素,如果包含,返回true 反之返回false
        //判断的依据:根据元素所在类的equals()方法进行判断  String中重写的equals 方法
        //如果存入集合中的元素是自定义类的对象,重写equals()方法
        boolean b1 = collection.contains(123);
        b1 = collection.contains("AA");
        System.out.println(b1);
        boolean b2 = collection.contains(new Person("MM", 23));//匿名的 两个对象 false
        System.out.println(b2);
        //7.containsAll(Collection coll):
        Collection collection1 = new ArrayList<>();
        collection1.add(123);
        collection1.add(new String("AA"));
        boolean b3 = collection.containsAll(collection1);
        System.out.println(b3);  //true 判断当前集合中 是否包含collection1中所有的元素
        //8.retainAll 交集  求共有的元素返回给当前集合 修改了 collection
        collection1.add(456);
        collection.retainAll(collection1); //交集
        System.out.println(collection);
        //9. remove(Object obj):    删除集合中的obj元素  删除成功返回true 否则 返回false
        boolean b4 = collection.remove("BB");
        System.out.println(b4);

    }

    @Test
    public void testCollection1() {
        Collection collection = new ArrayList<>();
        //1.size();  返回集合中元素的个数
        System.out.println(collection.size());
        //2.add(Object) 向集合中添加元素
        collection.add(123);
        collection.add("AA");
        collection.add(new Date());
        collection.add("BB");
        System.out.println(collection.size());
        //3.addAll(Collection coll):  将形参coll中包含的所有元素添加到当前集合中
        Collection collection1 = Arrays.asList(1, 2, 3);
        collection.addAll(collection1);
        //4.isEmpty(); 判断集合是否为空 flase
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
        //5. clear(): 清空集合元素
        collection.clear();
        System.out.println(collection.isEmpty());
        //查看集合元素
        System.out.println(collection);
    }
}
