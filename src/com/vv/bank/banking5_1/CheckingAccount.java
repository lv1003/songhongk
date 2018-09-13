package com.vv.bank.banking5_1;

/**
 * Created by vv on 2018/8/28.
 */
//信用卡账户
public class CheckingAccount extends Account {
    private double overdraftProtection;//透支额度

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance, double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }

    public double getOverdraftProtection() {
        return overdraftProtection;
    }

    public void setOverdraftProtection(double overdraftProtection) {
        this.overdraftProtection = overdraftProtection;
    }

    public boolean withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            return true;
        } else if (overdraftProtection >= amt - balance) {
            overdraftProtection -= (amt - balance);
            balance = 0;
            return true;
        } else {
            return false;
        }

    }
}
