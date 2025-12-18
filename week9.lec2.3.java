package edu.zuj.oop.week9.lecture2;

public class Test {
    public static void main(String[] args) {
        A a=new A();
        a.m1();//m1 from A
        a.m2();//m2 from A
        a.m3();//m3 from A
        
        B b=new B();
        b.m1();//m1 from A
        b.m2();//m            2 from A
        b.m3();//m3 from B
        b.m4();//m4 from B
    }
}
