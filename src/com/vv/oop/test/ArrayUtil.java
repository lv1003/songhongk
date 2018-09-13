package com.vv.oop.test;

/**
 * Created by vv on 2018/8/19.
 */
public class ArrayUtil {
    //求数组的最大值
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }


    //求数组的最小值
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //遍历数组元素
    public void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("]");
    }

    //求数组的平均数
    public double avg(int[] arr) {
        int sum = getSum(arr);
        double avg = sum / (arr.length);
        return avg;

    }

    //求数组的总和
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //数组的反转
    public int[] reverse(int[] arr) {
        for (int x = 0, y = arr.length - 1; x < y; x++, y--) {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        return arr;
    }

    //实现数组的复制
    public int[] copy(int []arr){
int arrCopy[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            arrCopy[i]=arr[i];
        }
        return arrCopy;
    }


    //对数组进行排序
public void sort(int[] arr,String desc){
    if (desc=="asc"){
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }else if (desc=="desc"){
        for (int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }else{
        System.out.println("输入排序方式有误!");
    }
}

    //交换数组中指定位置的元素  arr 中 i 和 j
     public void swap(int[]arr,int i,int j){
       int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
     }

}
