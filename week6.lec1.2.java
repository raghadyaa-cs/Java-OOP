package examsample1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Elevator arr[] = new Elevator[4];
        fillArray(arr);
        printArray(arr);
    }

    public static void printArray(Elevator arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getSpeed() == 'F') {
                System.out.println(arr[i]);
            }
        }
    }

    public static void fillArray(Elevator arr[]) {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Elevator();
            System.out.println("enter floors 1-20 : ");
            arr[i].setFloors(s.nextInt());
            System.out.println("enter speed F/S : ");
            arr[i].setSpeed(s.next().charAt(0));
        }

    }
}
