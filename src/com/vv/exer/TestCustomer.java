package com.vv.exer;

import com.vv.exer.*;

/**
 * Created by vv on 2018/8/25.
 */
public class TestCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");
        customer.setAccount(new Account(1000, 2000, 0.0123));
        Account account = customer.getAccount();
        account.deposit(100);
        account.withdraw(960);
        account.withdraw(2000);
        System.out.println("Customer [" + customer.getLastName() + "," + customer.getFirstName() + "]" +
                "id is" + account.getId() + "annualInterstRate is " + account.getAnnualInterestRate() * 100 + "%,balance is\t"
                + account.getBalance()
        );

    }
}
