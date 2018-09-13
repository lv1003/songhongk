package com.vv.bank.testbanking;

import com.vv.bank.banking4.Bank;
import com.vv.bank.banking4.Customer;

/**
 * Created by vv on 2018/9/12.
 */
public class TestBanking4 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        // Add Customer Jane, Simms
        bank.addCustomer("Jane", "Simms");
        //code
        //Add Customer Owen, Bryant
        bank.addCustomer("Owen", "Bryant");
        //code
        // Add Customer Tim, Soley
        bank.addCustomer("Tim", "Tim");
        //code
        // Add Customer Maria, Soley
        bank.addCustomer("Maria", "Soley");
        //code
        for (int i = 0; i < bank.getNumOfCustomers(); i++) {
            Customer customer = bank.getCustomer(i);
            System.out.println("Customer [" + (i + 1) + "] is "
                    + customer.getLastName()
                    + ", " + customer.getFirstName());
        }
    }
}
