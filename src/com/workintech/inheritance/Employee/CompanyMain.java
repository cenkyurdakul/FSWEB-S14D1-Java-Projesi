package com.workintech.inheritance.Employee;

public class CompanyMain {
    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(1, "Ali");
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(2, "Veli");
        juniorDeveloper1.work();
        juniorDeveloper2.work();
        System.out.println("************************");
        MidDeveloper midDeveloper1 = new MidDeveloper(3, "Tezcan");
        MidDeveloper midDeveloper2 = new MidDeveloper(4, "Berk");
        midDeveloper1.work();
        midDeveloper2.work();
        System.out.println("************************");
        SeniorDeveloper seniorDeveloper1 = new SeniorDeveloper(5, "Ezgi");
        seniorDeveloper1.work();
        System.out.println(seniorDeveloper1.getSalary());
        System.out.println("*************************");
        HRManager hrManager = new HRManager(1, "Birsen", new JuniorDeveloper[2],
                new MidDeveloper[2], new SeniorDeveloper[2]);
        hrManager.work();
        System.out.println("*************************");
        hrManager.addEmployee(0, juniorDeveloper1);
        hrManager.addEmployee(1, juniorDeveloper2);
        //hrManager.addEmployee(2, juniorDeveloper2);
        System.out.println(hrManager);
        hrManager.addEmployee(0,midDeveloper1);
        hrManager.addEmployee(1,midDeveloper2);
        hrManager.addEmployee(0,seniorDeveloper1);
        System.out.println(hrManager);


    }
}
