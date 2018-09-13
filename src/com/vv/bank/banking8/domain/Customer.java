package com.vv.bank.banking8.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by vv on 2018/8/23.
 */
public class Customer {
    private String firstName;
    private String lastName;
    //private Account account;
    private List<Account> accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        accounts = new ArrayList<Account>();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    //添加一个账户到Account[]中
    public void addAccount(Account account) {
       accounts.add(account);
    }

    //返回账户的个数
    public int getNumberOfAccounts() {
        return accounts.size();
    }

    //返回指定索引处的账户
    public Account getAccount(int index) {
        return accounts.get(index);
    }

     public Iterator<Account> getAccounts(){
         return accounts.iterator();
     }
}
