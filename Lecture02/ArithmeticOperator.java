package Lecture02;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        System.out.println("Arithmetic Operator ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n  = sc.nextInt();
        System.out.println("Enter the value of m is : ");
        int m = sc.nextInt();
        System.out.println("The sum of two number is : "+(n+m));
        System.out.println("The substraction of two number is : "+(n-m));
        System.out.println("The multiplication of two number is : "+(n*m));
        System.out.println("The division  of two number is : "+(n/m));
        System.out.println("The remainder of two number is : "+(n%m));
    }
}
