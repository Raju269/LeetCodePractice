package Lecture02;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        System.out.println("Bitwise Operator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of m is : ");
        int m = sc.nextInt();
        System.out.println(n&m);
        System.out.println(n|m);
        System.out.println(n^m);
        System.out.println(~n);
        System.out.println(n<<1);
        System.out.println(n>>1); //Signed right shift
        System.out.println(n>>>1);  //UnSigned right shift
    }
}
