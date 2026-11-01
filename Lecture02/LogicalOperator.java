package Lecture02;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("Logical Operator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of m is : ");
        int m = sc.nextInt();
        if (n < 10 && m > 10) {
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }
        
        if (n < 10 || m > 10) {
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }
        
        if (n!=m) {
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }
        
        
    }
}
