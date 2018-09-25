package com.vv.IO;

/*
*
 * Created by vv on 2018/9/21.
 * RandomAccessFile:支持随机访问
 * 1.既可以充当一个输入流,又可以充当输出流
 * 2.支持从文件的开头读取/写入
 * 3.支持从任意位置的读取/写入(插入)
 */

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRandomAccessFile {
    //4.相较于test3更通用些
   public void test4(){
       RandomAccessFile randomAccessFile = null;
       try {
           randomAccessFile = new RandomAccessFile(new File("hello1.txt"), "rw");
           randomAccessFile.seek(4);
           byte[] b=new byte[10];
           int len;
           StringBuffer stringBuffer=new StringBuffer();
           while ((len=randomAccessFile.read(b))!=-1){
                stringBuffer.append(new String(b,0,len));
           }
            randomAccessFile.seek(4);
           randomAccessFile.write("xy".getBytes());
           randomAccessFile.write(stringBuffer.toString().getBytes());

           String str=randomAccessFile.readLine();//取出来字符 后面的
//            long l = randomAccessFile.getFilePointer();
//            System.out.println(l);
           randomAccessFile.seek(4);
           randomAccessFile.write("xy".getBytes());
           randomAccessFile.write(str.getBytes());
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       } catch (IOException e) {
           e.printStackTrace();
       }
   }
    //实现插入效果
    @Test
    public void test3() {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(new File("hello1.txt"), "rw");
            randomAccessFile.seek(4);

            String str=randomAccessFile.readLine();//取出来字符 后面的
//            long l = randomAccessFile.getFilePointer();
//            System.out.println(l);
            randomAccessFile.seek(4);
            randomAccessFile.write("xy".getBytes());
            randomAccessFile.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
//实现的是覆盖的效果,并不是插入的效果
    @Test
    public void test2() {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile(new File("hello1.txt"), "rw");
            randomAccessFile.seek(3);
            randomAccessFile.write("xy".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (randomAccessFile!=null){
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //进行文件的读/写
    @Test
    public void test1() {
        RandomAccessFile randomAccessFile = null;
        RandomAccessFile randomAccessFile1 = null;
        try {
            randomAccessFile = new RandomAccessFile(new File("hello.txt"), "r");
            randomAccessFile1 = new RandomAccessFile(new File("hello1.txt"), "rw");
            byte[] bytes = new byte[20];
            int len;
            while ((len = randomAccessFile.read(bytes)) != -1) {
                randomAccessFile1.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (randomAccessFile1 != null) {
                try {
                    randomAccessFile1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}