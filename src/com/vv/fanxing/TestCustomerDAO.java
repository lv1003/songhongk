package com.vv.fanxing;

/**
 * Created by vv on 2018/9/11.
 */
public class TestCustomerDAO {
    public static void main(String[] args) {
        CustomerDAO c = new CustomerDAO();
        c.add(new Customer());
        c.get(0);

    }

}
