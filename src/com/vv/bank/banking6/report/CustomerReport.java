package com.vv.bank.banking6.report;

import com.vv.bank.banking6.domain.*;

import java.text.NumberFormat;

/**
 * Created by vv on 2018/9/13.
 */
public class CustomerReport {
    Bank bank=Bank.getBanking();
    Customer customer;

    public void generateReport(){
        NumberFormat currency_format=NumberFormat.getCurrencyInstance();
        // Generate a report
        System.out.println("\t\t\tCUSTOMERS REPORT");
        System.out.println("\t\t\t================");

        for ( int cust_idx = 0; cust_idx < bank.getNumOfCustomers(); cust_idx++ ) {
            customer = bank.getCustomer(cust_idx);

            System.out.println();
            System.out.println("Customer: "
                    + customer.getLastName() + ", "
                    + customer.getFirstName());

            for ( int acct_idx = 0; acct_idx < customer.getNumberOfAccounts(); acct_idx++ ) {
                Account account = customer.getAccount(acct_idx);
                String  account_type = "";

                // Determine the account type
                /*** Step 1:
                 **** Use the instanceof operator to test what type of account
                 **** we have and set account_type to an appropriate value, such
                 **** as "Savings Account" or "Checking Account".
                 ***/
                if (account instanceof SavingAccount){
                    account_type="SavingAccount";

                }
                if (account instanceof CheckingAccount){
                    account_type ="CheckingAccount";
                }
                System.out.println(account_type+":current balance is "+currency_format.format(account.getBalance()));
                // Print the current balance of the account

                /*** Step 2:
                 **** Print out the type of account and the balance.
                 **** Feel free to use the currency_format formatter
                 **** to generate a "currency string" for the balance.
                 ***/
            }
        }
    }
}
