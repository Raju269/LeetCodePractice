package Lecture02;

import java.util.Scanner;

public class Lotter_Game1 {
    public static void main(String[] args) {
        System.out.println("Lotter Game 1 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=100 && n<=200){
            System.out.println("Bike");
        }
        else if(n>=282 && n<=473){
            System.out.println("Macebook");
        } else if (n >= 53 && n <= 94) {
            System.out.println("Cycle");
        }
        else{
            System.out.println("Better lucky next time ! ");
        }
    }
}
