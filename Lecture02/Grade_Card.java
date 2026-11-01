package Lecture02;

import java.util.Scanner;

public class Grade_Card {
    public static void main(String[] args) {
        System.out.println("Grade Marks Print ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = sc.nextInt();
        if(n>=90){
            System.out.println("Grade is A ");
        }
        else if(n>80 && n<90){
            System.out.println("Grade is B ");
        } else if (n > 70 && n < 80) {
            System.out.println("Grade is C ");
        } else if (n > 50 && n <= 70) {
            System.out.println("Grade is D");
        }
        else {
            System.out.println("your failed");
        }

    }
}
