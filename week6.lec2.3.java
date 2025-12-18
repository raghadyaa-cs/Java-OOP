package edu.zuj.oop.week6.lecture2;

public class CircleTest2 {
    public static void main(String[] args) {
        Circle circles[]=new Circle[10];
        for(int i=0;i<circles.length;i++){
            circles[i]=new Circle(i+1);
            System.out.println(circles[i]);
        }
        ///
        //print radious for all the circles
        for(int i=0;i<circles.length;i++){
            System.out.println(circles[i].getRad());
        }
    }
}
