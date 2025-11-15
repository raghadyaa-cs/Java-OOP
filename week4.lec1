package edu.zuj.oop.week4.lecture1;
import java.util.Scanner;
public class ArrayTest {
    public static void main(String[] args) {
        System.out.print("Enter size: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter value "+i+" :");
            arr[i]=s.nextInt();
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        double avg=sum/arr.length;
        System.out.println("=============================");
        for(int i=0;i<arr.length;i++){
            System.out.println(i+" - "+arr[i]);
        }
        System.out.println("=============================");
        System.out.println("Sum = "+sum+"        Avg = "+avg);
    }
}
