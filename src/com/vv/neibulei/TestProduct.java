package com.vv.neibulei;

/**
 * Created by vv on 2018/9/3.
 */
public class TestProduct {
    public static void main(String[] args) {
        TestProduct testProduct = new TestProduct();
        // 方式一 创建一个实现 接口类的对象  将此对象传入 方法中
        NoteBook noteBook = new NoteBook();
        testProduct.show(noteBook);
        // 方式二 创建一个匿名的类的匿名对象
        testProduct.show(new Product() {
            @Override
            public void getName() {
                System.out.println("Iphone6");
            }

            @Override
            public void getPrice() {
                System.out.println("$10000");
            }
        });

        //方式三
        Product product = new Product() {
            @Override
            public void getName() {
                System.out.println("Iphone7");
            }

            @Override
            public void getPrice() {
                System.out.println("$110000");
            }
        };
        Product product1 = testProduct.getProduct();
        product1.getName();
        product1.getPrice();

    }



    //局部内部类的使用
    public Product getProduct() {
        //方式一: 实现接口的局部内部了
        class Carema implements Product {

            @Override
            public void getName() {
                System.out.println("数码相机");
            }

            @Override
            public void getPrice() {
                System.out.println("4000");
            }
        }
        return new Carema();
    }

    public void show(Product product) {
        product.getName();
        product.getPrice();
    }
}

interface Product {
    void getName();

    void getPrice();
}

class NoteBook implements Product {

    @Override
    public void getName() {
        System.out.println("HP笔记本");
    }

    @Override
    public void getPrice() {
        System.out.println("$5000");
    }
}