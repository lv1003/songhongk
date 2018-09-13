package com.vv.collections;


import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * Created by vv on 2018/9/6.
 */
public class TestMp {
    //Properties 处理属性文件
   @Test
   public void test5() throws IOException {
       Properties properties=new Properties();
       properties.load(new FileInputStream(new File("jdbc.properties")));
       String user = properties.getProperty("user");
       System.out.println(user);
       String password=properties.getProperty("password");
       System.out.println(password);
   }


    //定制排序
    @Test
     public void test4() {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Customer && o2 instanceof Customer) {
                    Customer c1 = (Customer) o1;
                    Customer c2 = (Customer) o2;
                    int i = c1.getId().compareTo(c2.getId());
                    if (i == 0) {
                        return c1.getName().compareTo(c2.getName());
                    }
                    return i;
                }
                return 0;
            }
        };
     TreeMap map=new TreeMap(comparator);
        map.put(new Customer("AA",1001),87);
        map.put(new Customer("VV",1001),90);
        map.put(new Customer("CC",1002),100);
        map.put(new Customer("BB",1003),69);
        Set set1 = map.keySet();
        for (Object obj : set1
                ) {
            System.out.println(obj + "--->" + map.get(obj));
        }
    }


    //自然排序
    @Test
    public void test3() {
        Map map = new TreeMap<>();
        map.put(new Person("AA", 23), 100);
        map.put(new Person("MM", 24), 69);
        map.put(new Person("CC", 24), 80);
        map.put(new Person("JJ", 25), 90);
        map.put(new Person("QQ", 23), 79);
        Set set1 = map.keySet();
        for (Object obj : set1
                ) {
            System.out.println(obj + "--->" + map.get(obj));
        }
    }

    @Test
    public void test2() {
        Map map = new HashMap<>();
        map.put("AA", 213);
        map.put("BB", 456);
        map.put("BB", 456);
        map.put(123, "CC");
        map.put(null, null);
        map.put(new Person("DD", 23), 89);
        //1.遍历key集
        Set set = map.keySet();
        for (Object obj : set) {
            System.out.println(obj);// hashMap--> hashSet  无序的状态 所以 遍历无序
        }
        //2.遍历value集
        Collection values = map.values();
        Iterator i = values.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        //3. 如何遍历 key-value 对 方式一
        Set set1 = map.keySet();
        for (Object obj : set1
                ) {
            System.out.println(obj + "--->" + map.get(obj));
        }
        //4. Entry 方式二
        Set set2 = map.entrySet();
        for (Object obj : set2) {
            Map.Entry entry = (Map.Entry) obj;
            // System.out.println(entry.getKey()+"------"+entry.getValue());
            System.out.println(entry);
        }
    }

    @Test
    public void test1() {
        Map map = new HashMap<>();
        map.put("AA", 213);
        map.put("BB", 456);
        map.put("BB", 456);
        map.put(123, "CC");
        map.put(null, null);
        map.put(new Person("DD", 23), 89);
        map.put(new Person("DD", 23), 87);
        System.out.println(map.size());  //返回集合的长度

    }
}
