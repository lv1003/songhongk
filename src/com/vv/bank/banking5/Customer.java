package com.vv.bank.banking5;

/**
 * Created by vv on 2018/8/23.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;


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

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }


}
