package com.vv.duoxiancheng;

/**
 * Created by vv on 2018/9/25.
 * 1.start(): 启动线程并执行相应的run()方法
 * 2.run():子线程要执行的代码放入run()方法中
 * 3.currentThread():静态的,调取当前的线程
 * 4.getName():获取此线程的名字
 * 5.setName():设置此线程的名字
 * 6.yield():调用此方法的线程释放当前CPU的执行权
 * 7.join(): 在A线程中调用B线程的join方法  表示 当执行到此方法 A线程停止执行 直至 B线程执行完毕
 * 8.isAlive():判断当前线程是否还存活
 * 9.sleep( long l):显式的让当前线程睡眠1毫秒
 * 10.线程通信: wait() notify() notifyAll()
 * <p>
 * 设置线程的优先级
 * getPriority():返回线程优先值
 */
class SubThread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
//            try {
//                Thread.currentThread().sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
        }
    }
}

public class TestThread1 {
    public static void main(String[] args) {
        SubThread1 subThread1 = new SubThread1();
        subThread1.setName("子线程1");
        subThread1.setPriority(Thread.MAX_PRIORITY);
        subThread1.start();
        Thread.currentThread().setName("=======主线程");
        for (int i = 1; i < 100; i++) {
           /* if (i%10==0){
                subThread1.currentThread().yield(); //当前线程释放cpu的执行权
            }*/
//            if(i==20){
//                try {
//                    subThread1.join();//主线程执行到20强制的让子线程进入
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
        System.out.println(Thread.currentThread().getName() + ":" + Thread.currentThread().getPriority() + ":" + i);
        }
        System.out.println(subThread1.isAlive());
    }
}

