package edu.zuj.oop.week9.lecture1;

public class Test {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.setName("Ata");
        p1.setAge(20);
        
        Employee e=new Employee();
        e.setId(10);
        e.setName("Kamal");
        e.setAge(20);
        e.setSalary(1000);
        
       Manager m=new Manager();
       m.setId(20);
       m.setAge(35);
       m.setName("Talal");
       m.setSalary(5000);
       m.setDepartment("IT");
       m.setAddress("Amman");
    }
}
