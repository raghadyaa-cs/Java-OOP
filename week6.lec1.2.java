package edu.zuj.oop.week6.lecture1;
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1=new Employee("Ata", 1000);
        e1.printInfo();
        
        Employee e2=new Employee("Kamal", 1500);
        e2.printInfo();
        
        Employee e3=new Employee();
        e3.setName("Essa");
        e3.setSalary(-500);
        e3.printInfo();
    }
}
