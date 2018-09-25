package com.vv.IO;

import org.junit.Test;


import java.io.*;

/**
 * Created by vv on 2018/9/15.
 */
public class TestOtherStream {
    /*
     标准的输入输出流:
     标准的输出流:System.out
     标准的输入流:System.in
     */
    @Test
     public void test2(){
        BufferedReader bufferedReader= null;
        try {
            InputStream inputStream= System.in;
            InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);
            System.out.println("请输入字符串:");
            String string;
            while (true){
               string =bufferedReader.readLine();
                if (string.equalsIgnoreCase("e")||string.equalsIgnoreCase("exit")){
                    break;
                }
                String str= string.toUpperCase();
                System.out.println(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    /*
      转换流:
      InputStreamReader:解码   字节数组---->字符串
      OutputStreamWriter:编码  字符串----->字节数组
     */
    @Test
    public void testInputStreamReader() {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            //解码
            File file = new File("dbcp.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "GBK");
            bufferedReader = new BufferedReader(inputStreamReader);
            //编码
            File file1 = new File("dbcp4.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(file1);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "GBK");
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
    }
}
