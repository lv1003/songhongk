package com.vv.collections;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by vv on 2018/9/5.
 * Collection 接口
 * Set 无序的 不可重复
 * HashSet LinkedHashSet TreeSet
 */
public class TestSet {
    @Test
    public void testTreeSet3(){
        TreeSet set= new TreeSet(new Comparator() {
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
        });

        set.add(new Customer("AA", 1003));
        set.add(new Customer("BB", 1002));
        set.add(new Customer("GG", 1004));
        set.add(new Customer("CC", 1001));
        set.add(new Customer("DD", 1001));

        for (Object str : set) {
            System.out.println(str);
        }
    }





    @Test
    public void testTreeSet2() {
        Comparator comparator = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                //向TreeSet中添加 Customer类的对象 ,在此compare()方法中, 指定按照Customer的哪个属性排序的
                if (o1 instanceof Customer && o2 instanceof Customer) {
                    Customer customer = (Customer) o1;
                    Customer customer1 = (Customer) o2;
                    int i= customer.getId().compareTo(customer1.getId());
                    if (i==0){
                        return customer.getName().compareTo(customer1.getName());
                    }
                    return i;
                }
                return 0;
            }
        };


//2.将此对象 作为形参传递给 TreeSet的构造器中
        TreeSet set = new TreeSet(comparator);
        set.add(new Customer("AA", 1002));
        set.add(new Customer("BB", 1002));
        set.add(new Customer("GG", 1004));
        set.add(new Customer("CC", 1001));
        set.add(new Customer("DD", 1007));
        for (Object s : set) {
            System.out.println(s);
        }
    }

    //Hash
    @Test
    public void testHashSet() {
        Set set = new HashSet<>();
        set.add(123);
        set.add(456);
        set.add(new String("AA"));
        set.add("AA");
        set.add("BB");
        set.add(null);
        Person person = new Person("GG", 23);
        Person person1 = new Person("MM", 23);
        System.out.println(person.equals(person1));
        set.add(person);
        set.add(person1);
        System.out.println(set.size());
        System.out.println(set);//无序不代表随机性

    }


}
