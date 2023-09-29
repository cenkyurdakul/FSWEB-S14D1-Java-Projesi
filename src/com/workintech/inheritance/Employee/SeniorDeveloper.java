package com.workintech.inheritance.Employee;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(55000);
        System.out.println(super.getName() + " senior developer begins to work.");
    }
}
