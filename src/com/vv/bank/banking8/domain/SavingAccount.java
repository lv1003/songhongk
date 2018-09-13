package com.vv.bank.banking8.domain;


/**
 * Created by vv on 2018/8/28.
 */
//储蓄账户
public class SavingAccount extends Account {
    private double interesReat;//利率

    public SavingAccount(double balance, double init_rate) {
        super(balance);
        this.interesReat = init_rate;
    }

    public double getInteresReat() {
        return interesReat;
    }

    public void setInteresReat(double interesReat) {
        this.interesReat = interesReat;
    }
}
