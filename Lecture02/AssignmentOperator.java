package Lecture02;

import java.util.Scanner;

public class AssignmentOperator {
    public static void main(String[] args) {
        System.out.println("Assignment Operator ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value  of n is : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of m is : ");
        int m = sc.nextInt();
        n +=5;
        System.out.println(n);
        n-=2;
        System.out.println(n);
        m*=2;
        System.out.println(m);
        m/=2;
        System.out.println(m);
        n%=10;
        System.out.println(n);
        m&=n;
        System.out.println(m);
        m|=n;
        System.out.println(m);
        m^=n;
        System.out.println(m);
        m>>=n;
        System.out.println(n);
        m<<=n;
        System.out.println(n);
    }
}
