package com.sxt.fanxing;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * 泛型类中 定义泛型方法
 * 定义:在返回类型前面加入<字母>
 * Created by vv on 2018/9/10.
 */
public class Method {
    //泛型方法
    public static <T> void test(T t) {
        System.out.println(t);
    }
    public static <T extends List> void test(T t) {
        System.out.println(t);
        t.add("aaa");
    }
    //释放资源
    public static <T extends Closeable> void test(T...a){
      for (T temp:a){
        try{
            if (null!=temp){
                temp.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
      }
    }

    public static void main(String[] args) throws FileNotFoundException {
        test("bjsxt is very good");
        test(new FileInputStream("a.txt"));
    }
}
