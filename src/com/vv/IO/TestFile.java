package com.vv.IO;

import org.junit.Test;

import java.io.File;

/**
 * Created by vv on 2018/9/8.
 * java.io.File
 * 1.凡是与驶入输出相关的类 接口 等 都定义在java.io 包下
 * 2.File 是一个类 可以构造器创建其对象。
 */
public class TestFile {
    /**
     * 路径：
     * 绝对路径：包括盘符在内的完整的文件路经
     * 相对路径：在当前文件下的文件的路径
     */
    @Test
    public void test1() {
        File file = new File("c:/oi/hello.txt");
        File file1 = new File("hello1.txt");
        File file2 = new File("C:\\oi\\dfds\\df\\d");
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

        //重命名 renameTo(File newNme):重命名
        //file1.renameTo(file2) :  file1 -->file2  file1一定存在    file2  一定不存在
        boolean b = file1.renameTo(file2);
        System.out.println(b);

    }
}
