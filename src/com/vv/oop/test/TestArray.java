package com.vv.oop.test;

/**
 * Created by vv on 2018/8/20.
 */
public class TestArray {
    public static void main(String[] args) {
         int [] arr=new int[]{1,2,3,4,-33,4,43,54,6,5768};
        ArrayUtil arrayUtil=new ArrayUtil();
        System.out.println(arrayUtil.getMax(arr));
        System.out.println(arrayUtil.getMin(arr));
        double avg = arrayUtil.avg(arr);
        System.out.println(avg);
        System.out.println(arr.length);
        System.out.println(arrayUtil.getSum(arr));
        arrayUtil.reverse(arr);
        arrayUtil.sort(arr,"asc");
        arrayUtil.printArray(arr);

    }
}
