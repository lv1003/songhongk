package com.vv.interfaces;

/**
 * Created by vv on 2018/9/2.
 */
public class HourlyEmployee extends Employee {
    private double wage;
    private double hour;

    public double earnings() {
        return wage * hour;
    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }


    @Override
    public String toString() {
        return "HourlyEmployee{" + super.toString() +
                "wage=" + wage +
                ", hour=" + hour +
                '}';
    }


}
