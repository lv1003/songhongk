package com.vv.abstractt;

/**
 * Created by vv on 2018/9/1.
 *模板方法设计模式
 */
public class TestTemplate {
    public static void main(String[] args) {
        new SubTemplate().sendTime();
    }
}

abstract class Template {
    public abstract void code();

    public void sendTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为:" + (end - start));
    }
}

class SubTemplate extends Template{

    @Override
    public void code() {
        boolean flag=false;
        for (int i =2;i<=10000;i++){
            for (int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                System.out.println(i);
            }
            flag=false;
        }
    }
}