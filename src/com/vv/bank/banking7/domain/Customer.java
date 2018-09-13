package com.vv.bank.banking7.domain;

/**
 * Created by vv on 2018/8/23.
 */
public class Customer {
    private String firstName;
    private String lastName;
    //private Account account;
    private Account[] accounts;
    private int numberOfAccounts;//记录Account的个数

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new Account[5];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    //添加一个账户到Account[]中
    public void addAccount(Account account) {
        accounts[numberOfAccounts] = account;
        numberOfAccounts++;
    }

    //返回账户的个数
    public int getNumberOfAccounts() {
        return numberOfAccounts;
    }

    //返回指定索引处的账户
    public Account getAccount(int index) {
        return accounts[index];
    }

}
