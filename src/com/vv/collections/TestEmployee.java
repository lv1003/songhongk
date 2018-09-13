package com.vv.collections;

import com.vv.interfaces.*;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by vv on 2018/9/5.
 */
public class TestEmployee {
    //定制排序  生日日期 先后排序
    @Test
    public void test2() {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof Employee) {
                    Employee employee = (Employee) o1;
                    Employee employee1 = (Employee) o2;
                    MyDate birth1 = employee.getBirthday();
                    MyDate birth2 = employee1.getBirthday();
                    if (birth1.getYear() != birth2.getYear()) {
                        return birth1.getYear() - birth2.getYear();
                    } else {
                        if (birth1.getMonth() != birth2.getMonth()) {
                            return birth1.getMonth() - birth2.getMonth();
                        } else {
                            if (birth1.getDay() != birth2.getDay()) {
                                return birth1.getDay() - birth2.getDay();
                            }
                        }
                    }
                }
                return 0;
            }
        };
        TreeSet set=new TreeSet(comparator);
        Employee employee = new Employee("刘德华", 55, new MyDate(1, 2, 1968));
        Employee employee2 = new Employee("郭富城", 55, new MyDate(3, 11, 1970));
        Employee employee3 = new Employee("张学友", 55, new MyDate(1, 2, 1968));
        Employee employee4 = new Employee("黎明", 55, new MyDate(1, 12, 1968));
        Employee employee5 = new Employee("李明浩", 55, new MyDate(11, 2, 1968));
        set.add(employee);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    //自然排序
    @Test
    public void test1() {
        Employee employee = new Employee("刘德华", 55, new MyDate(1, 2, 1968));
        Employee employee2 = new Employee("郭富城", 55, new MyDate(3, 11, 1970));
        Employee employee3 = new Employee("张学友", 55, new MyDate(1, 2, 1968));
        Employee employee4 = new Employee("黎明", 55, new MyDate(1, 12, 1968));
        Employee employee5 = new Employee("李明浩", 55, new MyDate(11, 2, 1968));
        TreeSet set = new TreeSet();
        set.add(employee);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
