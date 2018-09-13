package com.vv.extendse;

/**
 * Created by vv on 2018/8/25.
 */
public class TestKids {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.setSalary(0);
        someKid.setSex(1);
        someKid.setYearsOld(13);

        someKid.employees();
        someKid.printAge();
        someKid.manOrWoman();

    }
}
