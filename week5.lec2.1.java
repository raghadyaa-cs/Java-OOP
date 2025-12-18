package edu.zuj.oop.week5.lecture2;

public class Employee {
    //Instance variables
    String name;
    int basic;
    int deductions;
    int allownces;
    
    public int getSalary(){
        int salary=basic+allownces-deductions;
        return salary;
    }
    
    public void printInfo(){
        System.out.println("Name "+name+" , Salary "+getSalary());
    }
}
