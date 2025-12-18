package edu.zuj.oop.week6.lecture2;

public class Circle {

    private int rad;

    //public static final double PI=3.14;
    public Circle() {
    }

    public Circle(int rad) {
        this.rad = rad;
    }

    public double calcArea() {
        return Math.PI * rad * rad;
    }
    
    public double calcRound(){
        return 2*Math.PI*rad;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        if (rad > 0) {
            this.rad = rad;
        } else {
            System.out.println("Error");
        }
    }

    @Override
    public String toString() {
        return "Circle{rad=" + rad  +", Area = "+calcArea() 
                +" , Round = "+calcRound()+  '}';
    }

}
