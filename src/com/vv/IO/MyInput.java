package com.vv.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by vv on 2018/9/24.
 */
public class MyInput {
    public String nextString() {
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        String str= null;
        try {
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  str;
    }

    public int nextInt() {

        return Integer.parseInt(nextString());
    }

    public boolean nextBoolean() {
        return Boolean.parseBoolean(nextString())  ;
    }

    public static void main(String[] args) {
        MyInput i= new MyInput();
        System.out.println("请输入一个字符串:");
        String str = i.nextString();
        System.out.println(str);

    }
}
