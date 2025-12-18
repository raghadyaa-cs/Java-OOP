package edu.zuj.oop.week6.lecture1;

public class Employee {
    private String name;
    private int salary;

    public Employee() {
        this.salary=290;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void printInfo(){
        System.out.println("Name " +name+" Salary "+salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary>=290){
            this.salary = salary;
        }else{
            System.out.println("Error");
        }
    }
    
    
    
}
