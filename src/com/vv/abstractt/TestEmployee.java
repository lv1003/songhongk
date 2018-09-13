package com.vv.abstractt;

/**
 * Created by vv on 2018/8/31.
 */
class CommonEmployee extends Employee{

    @Override
    public void work() {
        System.out.println("流水线工作");
    }
}
//管理者
 class Manager extends Employee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理工作,监督员工 提高效率");
    }
}
abstract class Employee {
    private String name;
    private int id;
    private double salary;
   public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class TestEmployee {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Employee employee=new Manager();
        employee.work();
        manager.work();
        Employee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }

}
