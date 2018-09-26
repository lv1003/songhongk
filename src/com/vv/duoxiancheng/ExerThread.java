package com.vv.duoxiancheng;

/**
 * Created by vv on 2018/9/25.
 */
//创建多线程的方式一:继承于Thread类
class PrintNum extends Thread {
    public void run() {
        //子线程执行的代码
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }

    public PrintNum(String name) {
         super(name);
    }
}

public class ExerThread {
    public static void main(String[] args) {
        PrintNum printNum1 = new PrintNum("线程1:");
        PrintNum printNum2 = new PrintNum("线程2:");
        printNum1.setPriority(Thread.MAX_PRIORITY );//10
        printNum2.setPriority(Thread.MIN_PRIORITY);//1
        printNum1.start();
        printNum2.start();
    }
}
