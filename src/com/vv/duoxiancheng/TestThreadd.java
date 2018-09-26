package com.vv.duoxiancheng;

/**
 * Created by vv on 2018/9/25.
 *
 */
class SubThreads1 extends Thread{
    public void run(){
        for (int i=1;i<=100;i++){
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
class SubThreads2 extends Thread{
    public void run(){
        for (int i=1;i<=100;i++){
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
public class TestThreadd {
    public static void main(String[] args) {
        SubThreads1 subThreads1=new SubThreads1();
        SubThreads2 subThreads2=new SubThreads2();
        subThreads1.start();
        subThreads2.start();
        //继承于Thread类的匿名类的对象
        new Thread(){
            public void run(){
                for (int i=1;i<=100;i++){
                    if (i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
        new Thread(){
            public void run(){
                for (int i=1;i<=100;i++){
                    if (i%2!=0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }
}
