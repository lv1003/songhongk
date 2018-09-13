package com.vv.interfaces;

import com.vv.ex.Worker;

/**
 * Created by vv on 2018/9/1.
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
        IWorkFactory iWorkFactory=new StudentWorkFactory();
        iWorkFactory.getWork().doWoek();
        IWorkFactory iWorkFactory1=new TeacherWorkFactory();
        iWorkFactory1.getWork().doWoek();

    }
}

interface IWorkFactory {
    Work getWork();
}

class StudentWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new StudentWork();
    }
}

class TeacherWorkFactory implements IWorkFactory {
    @Override
    public Work getWork() {
        return new TeacherWork();
    }
}

interface Work {
    void doWoek();
}

class StudentWork implements Work {

    @Override
    public void doWoek() {
        System.out.println("学生写作业");
    }
}

class TeacherWork implements Work {

    @Override
    public void doWoek() {
        System.out.println("老师批改作业");
    }
}
