package com.vv.stringexer;

/**
 * Created by vv on 2018/8/29.
 */
public class TestMyDate {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(14, 3, 1976);
        MyDate myDate2 = new MyDate(14, 3, 1976);
        if (myDate1 == myDate2) {
            System.out.println("myDate1==myDate2");
        } else {
            System.out.println("myDate1!=myDate2");
        }
        if (myDate1.equals(myDate2)) {
            System.out.println("myDate1 is equals to myDate2");
        } else {
            System.out.println("myDate1 isn't equals to myDate2");

        }
    }

}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        } else if (object instanceof MyDate) {
            MyDate myDate = (MyDate) object;
            return this.day == myDate.day && this.month == myDate.month && this.year == myDate.year;
        } else {
            return false;
        }
    }

}
