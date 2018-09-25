package com.vv.IO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by vv on 2018/9/8.
 * java.io.File
 * 1.凡是与驶入输出相关的类 接口 等 都定义在java.io 包下
 * 2.File 是一个类 可以构造器创建其对象,此对象对应着一个文件(.txt .doc .java .mp3)或文件目录
 * 3.File 类对象与平台无关的.
 * 4.File中的方法,仅涉及到 如何创建.删除.重命名一个文件
 * 5.文件内容由 io流来完成   File类的对象 常作为IO流 的具体类的构造器的形参
 */
public class TestFile {

    @Test
    public void test3() {
        File file1 = new File("c:\\io\\hello.txt");
        System.out.println(file1.delete());
        if (!file1.exists()) {
            boolean b = false;
            try {
                b = file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(b);
        }
        File file2 = new File("C:\\io1\\io2");
        if (!file2.exists()) {
            boolean b = file2.mkdirs();
            System.out.println(b);
        }

        File file3 = new File("C:\\Java");
        String[] str = file3.list();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        File[]files=file3.listFiles();
        for (int i=0;i<files.length;i++){
            System.out.println(files[i].getName());
        }
    }

    @Test
    public void test2() {
        File file1 = new File("c:\\io\\hello.txt"); //绝对路径
        File file2 = new File("C:\\io\\vv");
        System.out.println(file1.exists());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isFile());
        System.out.println(file1.isDirectory());
        System.out.println(file1.lastModified());
        System.out.println(file1.length());
    }


    /**
     * 路径：
     * 绝对路径：包括盘符在内的完整的文件路经
     * 相对路径：在当前文件下的文件的路径
     */
    @Test
    public void test1() {
        File file = new File("c:\\io\\hello.txt"); //绝对路径
        File file1 = new File("hello.txt");   //相对路径
        File file2 = new File("C:\\io\\vv");
        File file3 = new File("C:\\io21");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getParent());
        System.out.println();
        System.out.println(file2.getName());
        System.out.println(file2.getPath());
        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getParent());
        // file.renameTo(file1);   //要求flie 一定存在 file1一定不存在   布尔返回
        boolean a = file.renameTo(file1);
        System.out.println(a);
        boolean b = file2.renameTo(file3);
        System.out.println(b);
    }
}
