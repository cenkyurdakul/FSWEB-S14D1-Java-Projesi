package com.workintech.inheritance.Employee;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.setSalary(30000);
        System.out.println(super.getName() + " junior developer begins to work");
    }
}
