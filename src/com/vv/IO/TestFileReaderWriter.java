package com.vv.IO;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by vv on 2018/9/14.
 */
public class TestFileReaderWriter {
    //filereader  FileWriter 字符流  文本文件复制
    //非文本文件 字节流
    @Test
    public void testFileReaderWriter() {
        //1.输入流对应的文件src一定要存在,否则抛异常.输出流对应的文件dest可以不存在,执行过程中会自动创建
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            //a
            File src = new File("dbcp.txt");
            File desc = new File("dbcp1.txt");
            //b
            fileReader = new FileReader(src);
            fileWriter = new FileWriter(desc);
            char[] c = new char[24];
            int len;
            while ((len = fileReader.read(c)) != -1) {
                fileWriter.write(c, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//读文件
    @Test
    public void testFileReader() {
        FileReader fileReader = null;
        try {
            File file = new File("dbcp.txt");
            fileReader = new FileReader(file);
            char[] c = new char[24];
            int len;
            while ((len = fileReader.read(c)) != -1) {
                String string = new String(c, 0, len);
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
