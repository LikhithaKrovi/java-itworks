package com.decembertwenty;

class Employee {
    int basicSalary;
    public Employee(int basicSalary){
        this.basicSalary = basicSalary;
    }

    public void caluculateSalary(){
        System.out.println(basicSalary);
    }
}

class Manager extends Employee{

    int incentives;
    int bonus;
    public Manager(int basicSalary,int incentives,int bonus) {
        super(basicSalary);
        this.incentives = incentives;
        this.bonus = bonus;
    }
    @Override
    public void caluculateSalary(){
        System.out.println(basicSalary + bonus + incentives);
    }
}
class Developer extends Employee{
    int incentives;
    int bonus;
    public Developer(int basicSalary,int incentives,int bonus) {
        super(basicSalary);
        this.incentives = incentives;
        this.bonus = bonus;
    }
    @Override
    public void caluculateSalary(){
        System.out.println(basicSalary + bonus + incentives);
    }
}

class TestEmployee{
    public static void main(String[] args){
        Manager manager1 = new Manager(100,15,30);
        Developer developer1 = new Developer(120,30,50);
        manager1.caluculateSalary();
        developer1.caluculateSalary();
    }
}
