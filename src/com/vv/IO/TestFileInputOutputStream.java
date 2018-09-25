package com.vv.IO;

import org.junit.Test;

import java.io.*;

/**
 * 1.流的分类
 * 按照数据流向不同：
 * 输入流 输出流
 * 按照处理数据的单位不同：
 * 字节流 字符流
 * 按照处理角色的不同
 * 节点流（直接作用于文件的） 处理流（）
 * <p>
 * <p>
 * Created by vv on 2018/9/13.
 * IO的体系
 * 抽象基类                 节点流（文件流）
 * InputStream              FileInputStream
 * OutputStream             FileOutputStream
 * Reader                   FileReader
 * Writer                   FileWriter
 */
public class TestFileInputOutputStream {
   @Test
   public void testCopyFile(){
       long start = System.currentTimeMillis();
       String src="C:\\Users\\vv\\Desktop\\宋鸿康\\第10章：IO(day15-day16)\\day15\\流的分类结构图.JPG";
       String dest="C:\\Users\\vv\\Desktop\\宋鸿康\\第10章：IO(day15-day16)\\day15\\流的分类结构图1.JPG";
       copyFile(src,dest);
      long end=System.currentTimeMillis();
       System.out.println("花费的时间为:"+(end-start));
   }
    //实现文件复制的方法  具有通用性
    public static void copyFile(String src,String dest){
        //1.提供读入和写出的文件
        File file1 = new File(src);
        File file2 = new File(dest);
        //2.提供相应的流
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file1);
            fileOutputStream = new FileOutputStream(file2);
            //3.实现文件的复制   字节数组
            byte[] b = new byte[1024];
            int len;
            while ((len = fileInputStream.read(b)) != -1) {
                fileOutputStream.write(b, 0, len);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
    }
    //从硬盘读取一个文件,并写入到另一个位置.(文件复制)
    @Test
    public void testFileInputOutputStream() {
        //1.提供读入和写出的文件
        File file1 = new File("hello.txt");
        File file2 = new File("hello3.txt");
        //2.提供相应的流
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file1);
            fileOutputStream = new FileOutputStream(file2);
            //3.实现文件的复制   字节数组
            byte[] b = new byte[20];
            int len;
            while ((len = fileInputStream.read(b)) != -1) {
                fileOutputStream.write(b, 0, len);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }
    }


    @Test
    public void testFileOutputStream() {
        //1.创建一个File对象,表明要写入的文件位置
        //文件存在 覆盖   不存在,新创建

        File file = new File("hello2.txt");
        //2.创建FileOutputStream 的对象,将file的对象作为形参传递给FileInputOutputStream的构造器中
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            //3.写入的操作
            fos.write(new String("I love China").getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //4.关闭输出流
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileInputStream3() {
        FileInputStream fileInputStream = null;
        try {
            File file = new File("hello.txt");
            fileInputStream = new FileInputStream(file);
            byte[] b = new byte[5];//读取到数据要写入的数组
            int len;//每次读入到byte中的字节的长度
            while ((len = fileInputStream.read(b)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.print((char) b[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    //从硬盘存在的一个文件中，读取其内容到程序中。使用FileInputStream
    //要读取的文件一定要存在。否则抛FileNotFoundException
    //保证流的关闭操作执行
    public void testFileInputStrem2() {
        FileInputStream fileInputStream = null;
        try {
            //1.创建一个File类的对象
            File file = new File("hello.txt");
            //2.创建一个FileInputStream类的对象
            fileInputStream = new FileInputStream(file);
            //3.调用 FileInputStream 的方法,实现file文件的读取
            /**
             * read():读取文件的一个字节   ancdefg
             *
             */
            int b = fileInputStream.read();
            while (b != -1) {
                System.out.print((char) b);
                b = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭相应的流
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void testFileInputStrem1() throws IOException {
        //1.创建一个File类的对象
        File file = new File("hello.txt");
        //2.创建一个FileInputStream类的对象
        FileInputStream fileInputStream = new FileInputStream(file);
        //3.调用 FileInputStream 的方法,实现file文件的读取
        /**
         * read():读取文件的一个字节   ancdefg
         *
         */
        int b = fileInputStream.read();
        while (b != -1) {
            System.out.print((char) b);
            b = fileInputStream.read();
        }
        //4.关闭相应的流
        fileInputStream.close();

    }


}
