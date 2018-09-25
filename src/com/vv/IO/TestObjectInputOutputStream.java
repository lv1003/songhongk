package com.vv.IO;

import org.junit.Test;

import java.io.*;

/**
 * Created by vv on 2018/9/19.
 */
public class TestObjectInputOutputStream {
    //对象的反序列化过程:将硬盘中的文件通过ObjectInputStream转换为相应的对象
    @Test
    public void testObjectInputStream(){
        ObjectInputStream objectInputStream= null;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream("person.txt"));
            Person person=(Person) objectInputStream.readObject();
            System.out.println(person);
            Person person1=(Person)objectInputStream.readObject();
            System.out.println(person1);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream!=null){
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }



    //对象的序列化过程:将内存中的对象通过ObjectOutputStream转换为二进制流,存储在硬盘文件中,网络传输
    @Test
    public void testObjectOutputStream(){
        Person person1=new Person("小米",23,new Pet("花花"));
        Person person2=new Person("红米",33,new  Pet("帅帅"));
        ObjectOutputStream objectOutputStream= null;
        try {
            objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.txt"));
            objectOutputStream.writeObject(person1);
            objectOutputStream.flush();
            objectOutputStream.writeObject(person2);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (objectOutputStream!=null){
                try {
                    objectOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
//要实现序列化的类
//1.要求此类是可序列化的,实现Serializable 接口
//2.要求类的属性同样的要实现Serializable接口
//3.提供一个版本号 private static final long serialVersionUID
//4.使用static 或 transient修饰的属性  不可实现序列化

class Person implements Serializable{
    private static final long serialVersionUID=234235436547L; //序列化版本标识符
    String name;
    int age;
    Pet pet;

    public Person(String name, Integer age,Pet pet) {
        this.name = name;
        this.age = age;
        this.pet=pet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }
}
class Pet implements Serializable{
    private static final long serialVersionUID=23423335436547L;
    String name;
    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                '}';
    }
}