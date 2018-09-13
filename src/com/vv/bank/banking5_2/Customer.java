package com.vv.bank.banking5_2;

/**
 * Created by vv on 2018/8/23.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private SavingAccount savingAccount;//储蓄账户
    private CheckingAccount checkingAccount;//信用卡账户
    public CheckingAccount getChecking() {
        return checkingAccount;
    }

    public void setChecking(CheckingAccount checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public SavingAccount getSaving () {
        return savingAccount;
    }

    public void setSavings(SavingAccount savingAccount) {
        this.savingAccount = savingAccount;
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }


}
