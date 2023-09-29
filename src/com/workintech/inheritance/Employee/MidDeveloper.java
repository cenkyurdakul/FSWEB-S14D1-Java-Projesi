package com.workintech.inheritance.Employee;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(40000);
        System.out.println(super.getName() + " mid dveloper begins to work.");
    }
}
