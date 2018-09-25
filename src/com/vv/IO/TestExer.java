package com.vv.IO;

import org.junit.Test;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.io.*;

/**
 * Created by vv on 2018/9/17.
 */
public class TestExer {
    //利用程序复制  test.txt    为 test.txt
    @Test
    public void test4(){
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        try {
            bufferedReader=new BufferedReader(new FileReader(new File("test.txt")));
            bufferedWriter = new BufferedWriter(new FileWriter(new File("test2.txt")));
            char[]c =new char[20];
            int len;
            while ((len=bufferedReader.read(c))!=-1){
                bufferedWriter.write(c,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            if (bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //使用字符流实现内容的读入
    @Test
    public void test3() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("test.txt "));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //使用字符流实现内容的输出
    @Test
    public void test2() {
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("text1.txt"));
            String str = "我爱北京天安门";
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //使用字节流实现内容输出
    @Test
    public void test1() {
        // FileOutputStream fileOutputStream = new FileOutputStream(new File("test.txt"));
        // BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        BufferedOutputStream bufferedOutputStream = null;
        try {
            bufferedOutputStream = new BufferedOutputStream(
                    new FileOutputStream(new File("test.txt")));
            String str = "我爱北京天安门";
            bufferedOutputStream.write(str.getBytes());
            bufferedOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
