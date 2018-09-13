package com.vv.bank.banking7.domain;

/**
 * Created by vv on 2018/8/24.
 * bank实现单例模式
 */
public class Bank {
    private Customer[] customers;//用于存放客户
    private int numberOfCustomers;//记录客户的个数

    private Bank() {
        customers = new Customer[5];
    }
    private static Bank bank=new Bank();
    public static Bank getBanking(){
        return bank;
    }

    //添加一个Customer到数组中
    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f, l);
        customers[numberOfCustomers] = customer;
        numberOfCustomers++; //自增
    }

    //获取Customer 的个数
    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    //返回指定索引位置的Customer
    public Customer getCustomer(int index) {
        return customers[index];
    }


}
