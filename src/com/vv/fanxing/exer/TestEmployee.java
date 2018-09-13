package com.vv.fanxing.exer;

import com.vv.collections.Employee;
import com.vv.collections.MyDate;
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
                if (o1 instanceof com.vv.collections.Employee && o2 instanceof com.vv.collections.Employee) {
                    com.vv.collections.Employee employee = (com.vv.collections.Employee) o1;
                    com.vv.collections.Employee employee1 = (com.vv.collections.Employee) o2;
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
        TreeSet<Employee> set=new TreeSet<>(comparator);
        com.vv.collections.Employee employee = new com.vv.collections.Employee("刘德华", 55, new MyDate(1, 2, 1968));
        com.vv.collections.Employee employee2 = new com.vv.collections.Employee("郭富城", 55, new MyDate(3, 11, 1970));
        com.vv.collections.Employee employee3 = new com.vv.collections.Employee("张学友", 55, new MyDate(1, 2, 1968));
        com.vv.collections.Employee employee4 = new com.vv.collections.Employee("黎明", 55, new MyDate(1, 12, 1968));
        com.vv.collections.Employee employee5 = new com.vv.collections.Employee("李明浩", 55, new MyDate(11, 2, 1968));
        set.add(employee);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);
        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


    //自然排序
    @Test
    public void test1() {
        com.vv.collections.Employee employee = new com.vv.collections.Employee("刘德华", 55, new MyDate(1, 2, 1968));
        com.vv.collections.Employee employee2 = new com.vv.collections.Employee("郭富城", 55, new MyDate(3, 11, 1970));
        com.vv.collections.Employee employee3 = new com.vv.collections.Employee("张学友", 55, new MyDate(1, 2, 1968));
        com.vv.collections.Employee employee4 = new com.vv.collections.Employee("黎明", 55, new MyDate(1, 12, 1968));
        com.vv.collections.Employee employee5 = new Employee("李明浩", 55, new MyDate(11, 2, 1968));
        TreeSet<Employee> set = new TreeSet<>();
        set.add(employee);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        set.add(employee5);

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
