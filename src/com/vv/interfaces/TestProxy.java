package com.vv.interfaces;

/**
 * Created by vv on 2018/9/1.
 * 接口的应用 :代理模式
 */
public class TestProxy {
    public static void main(String[] args) {
        Object object= new ProxyObject();
        object.action();
    }
}

interface Object {
    void action();
}

//代理类
class ProxyObject implements Object {
    Object object;

    public ProxyObject() {
        System.out.println("代理类创建成功!");
        object = new ObjctImpl();
    }

    @Override
    public void action() {
        System.out.println("代理累开始执行");
        object.action();
        System.out.println("代理类执行结束");
    }
}

//被代理类
class ObjctImpl implements Object {

    @Override
    public void action() {
        System.out.println("========被代理类开始执行=========");
        System.out.println("========具体操作=========");
        System.out.println("========被代理类执行完毕=========");

    }
}