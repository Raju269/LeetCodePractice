package Lecture02;

import java.util.Scanner;

public class Increment_and_Dcrement_Operator {
    public static void main(String[] args) {
        System.out.println("Increament and Decreament Operator");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of m is : ");
        int m = sc.nextInt();   
      
//        question 
        int x = n++ - ++n - n-- - --n + ++n; 
        System.out.println(x);
        int y = ++m -m++ - --m - m-- - m--;
        System.out.println(y);
        
        int v = 8;
		System.out.println(v++);// --> x = x + 1;
		System.out.println(v);

		System.out.println(--v);// --> x = x - 1;
		System.out.println(v);
		int d = v++ + --v + v-- + --v;
		int c = v++ - ++v - v-- - --v + ++v;
		System.out.println(d);
		System.out.println(c);
    }
}
