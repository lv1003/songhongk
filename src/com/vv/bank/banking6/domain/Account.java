package com.vv.bank.banking6.domain;

/**
 * Created by vv on 2018/8/23.
 * 账户
 */
public class Account {
    protected double balance;//账户余额

    public Account(double init_balance) {
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //存钱
    public boolean deposit(double amt) {
        balance += amt;
        return true;
    }

    //取钱
    public boolean withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            return true;
        } else {
            System.out.println("余额不足!");
            return false;
        }
    }
}
