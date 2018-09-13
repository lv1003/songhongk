package com.vv.yichang1;

/**
 * Created by vv on 2018/9/4.
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student=new Student();
        try {
            student.regist(-12);
            System.out.println(student);
        } catch (MyException e) {
            e.printStackTrace(e.getMessage());
        }
        System.out.println(student);
    }
}

class Student {
    int id;

    public void regist(int id) throws MyException {
        if (id > 0){
            this.id=id;
        }else {
            throw new MyException("传入的学号有误!");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}