package com.vv.IO;

import org.junit.Test;

import java.io.*;

/**
 * Created by vv on 2018/9/18.
 */
public class TestOthersStream {
    @Test
    public void testData1() {
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new FileInputStream(new File("data.txt")));
         /*   byte[]bytes=new byte[20];
            int len;
            while((len=dataInputStream.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }*/
            String string = dataInputStream.readUTF();
            System.out.println(string);
            Boolean b=dataInputStream.readBoolean();
            System.out.println(b);
            long l=dataInputStream.readLong();
            System.out.println(l);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //数据流：用来处理基本数据类型 String、字节数组  DataInputStream、DataOutputStream
    @Test
    public void testData() {
        DataOutputStream dataOutputStream = null;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data.txt");
            dataOutputStream = new DataOutputStream(fileOutputStream);
            dataOutputStream.writeUTF("我爱你，而你却不知道！");
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeLong(3480534858903490858L);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataOutputStream != null) {
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //打印流: 字节流:PrintStream  字符流:PrintWriter
    @Test
    public void printStreamWriter() {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(new File("print.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //创建打印输出流，设置为自动刷新模式
        PrintStream printStream = new PrintStream(fileOutputStream, true);
        if (printStream != null) {
            System.setOut(printStream);
        }
        for (int i = 0; i <= 255; i++) {
            System.out.print((char) i);
            if (i % 50 == 0) {//每50个数据一行
                System.out.println();//换行
            }
        }
        printStream.close();
    }
}
