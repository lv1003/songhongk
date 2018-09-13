package com.vv.interfaces;

import java.util.Scanner;

/**
 * Created by vv on 2018/9/2.
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];
        //System.out.println(emps[0].earnings());  空指针
        emps[0] = new SalariedEmployee("李雷", 1001, new MyDate(1998, 10, 3), 5000);
        emps[1] = new HourlyEmployee("韩梅梅", 1002, new MyDate(1998, 10, 3),100, 6);
        Scanner s = new Scanner(System.in);
        System.out.println("请输入本月的月份:");
        int month = s.nextInt();
        for (int i=0;i< emps.length;i++){
            if(month==emps[i].getBirthday().getMonth()){
                System.out.println("加工资,加100!");
            }
            System.out.println(emps[i]);
        }
    }
}
