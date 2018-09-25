package com.vv.IO;

import org.junit.Test;

import java.io.*;

/**
 * Created by vv on 2018/9/15.
 */
public class TestBuffered {
    @Test
    public void testBufferedReader(){
        BufferedReader bufferedReader= null;
        BufferedWriter bufferedWriter=null;
        try {
            File file=new File("dbcp.txt");
            File file1=new File("dbcp5.txt");
            FileReader fileReader=new FileReader(file);
            FileWriter fileWriter=new FileWriter(file1);
            bufferedReader = new BufferedReader(fileReader);
            bufferedWriter=new BufferedWriter(fileWriter);
        /*    char[]c =new char[1024];
            int len;
            while ((len=bufferedReader.read(c))!=-1) {
                String string = new String(c, 0, len);
                System.out.println(string);
            }*/

            String str=null;
            while((str=bufferedReader.readLine())!=null){
           //     System.out.println(str);
                bufferedWriter.write(str+"\n");
                bufferedWriter.newLine();//自动换行
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }    if (bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void testCopyFile() {
        long start = System.currentTimeMillis();
        String src = "C:\\Users\\vv\\Desktop\\宋鸿康\\第10章：IO(day15-day16)\\day15\\day15_11标准的输入输出流的使用.wmv";
        String dest = "C:\\Users\\vv\\Desktop\\宋鸿康\\第10章：IO(day15-day16)\\day15\\day15_11标准的输入输出流的使用1.wmv";
        copyFile(src, dest);
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为:" + (end - start));
    }

    //使用缓冲流实现文件的复制的方法
    public void copyFile(String src, String dest) {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1.提供读入.写出的文件
            File file1 = new File(src);
            File file2 = new File(dest);
            //2.创建相应的节点流FileInputStream /FileOutputStream
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            //3.将创建的节点流的对象作为形参传递给缓冲流的构造器中
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            //4.具体的实现文件复制的操作
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, len);//写操作
                bufferedOutputStream.flush();//刷新
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭外部的流 会自动关闭内部的流  关闭相应的流
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    //非文本文件复制使用 BufferedInputStream 和BufferedOutputStream  加速操作
    @Test
    public void testBufferedInputOutputStream() {
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            //1.提供读入.写出的文件
            File file1 = new File("C:\\Users\\vv\\Desktop\\宋鸿康\\第10章：IO(day15-day16)\\day15\\流的分类结构图.JPG");
            File file2 = new File("C:\\Users\\vv\\Desktop\\宋鸿康\\第10章：IO(day15-day16)\\day15\\流的分类结构图3.JPG");
            //2.创建相应的节点流FileInputStream /FileOutputStream
            FileInputStream fileInputStream = new FileInputStream(file1);
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            //3.将创建的节点流的对象作为形参传递给缓冲流的构造器中
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            //4.具体的实现文件复制的操作
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes, 0, len);//写操作
                bufferedOutputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //5.关闭外部的流 会自动关闭内部的流  关闭相应的流
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
