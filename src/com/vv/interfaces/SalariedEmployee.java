package com.vv.interfaces;

/**
 * Created by vv on 2018/9/2.
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;//月工资

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name,number,birthday);
        this.monthlySalary = monthlySalary;
    }

    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() +
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
