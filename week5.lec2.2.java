package edu.zuj.oop.week5.lecture2;

public class EmployeeTestt {
    public static void main(String[] args) {
        //Employee: datatype
        //e1: reference
        //new Employee(): constructions
        //Employee(): constructor
        Employee e1=new Employee();
        e1.name="Ata";
        e1.basic=300;
        e1.allownces=100;
        e1.deductions=50;
        
        e1.printInfo();
        
        Employee e2=new Employee();
        e2.name="Essa";
        e2.basic=500;
        e2.allownces=20;
        e2.deductions=100;        
        
        e1.printInfo();
    }
}
