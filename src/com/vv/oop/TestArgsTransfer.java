package com.vv.oop;

/**
 * Created by vv on 2018/8/21.
 * 方法的参数传递
 * 形参:方法声明的时候小括号内的参数
 * 实参:调用方法时,实际传入的参数的值
 * 规则: java中的参数传递机制
 * 参数传递都是值传递
 *
 * 基本数据类型:
 *     将实参的值专递给形参的基本数据类型的变量
 * 引用数据类型
 *     将实参的引用变量的值(对应的堆空间对象实体的首地址值)传递给形参的引用类型变量
 *
 */
public class TestArgsTransfer {
    public static void main(String[] args) {
        TestArgsTransfer testArgsTransfer = new TestArgsTransfer();
        //main方法中的 i j 没有变
        int i = 1;
        int j = 10;
        System.out.println("i:" + i + "\t\t" + "j:" + j);  //i:1		j:10
        testArgsTransfer.swap(1, 10);
        System.out.println("i:" + i + "\t\t" + "j:" + j);  //i:1		j:10
    }

    //交换两个变量的值    方法的形参(局部变量) i j temp存入 栈空间
    public void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
        System.out.println("i:" + i + "\t\t" + "j:" + j);
    }

}
