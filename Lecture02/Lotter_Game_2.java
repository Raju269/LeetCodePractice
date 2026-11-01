package Lecture02;

import java.util.Scanner;

public class Lotter_Game_2 {
    public static void main(String[] args) {
        System.out.println("Lotter Grame 2 ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n is : ");
        int n = sc.nextInt();
        if(n>=100 && n<=200){
            System.out.println("Bike");
            if(n<=150){
                System.out.println("Hero");
            }
            else{
                System.out.println("KTM");
            }
        } else if (n >= 248 && n <= 312) {
            System.out.println("MaceBook");
            if(n<300){
                System.out.println("M1 Macebook");
            }
            else{
                System.out.println("M2 Macebook");
            }
        } else if (n >= 456 && n <= 631) {
            System.out.println("Cycle");
            if(n<=555){
                System.out.println("ATLAS Cycle");
            }
            else{
                System.out.println("AVON cycle");
            }
        } else if (n >= 723 && n <= 809) {
            System.out.println("kurkure");
            if(n<775){
                System.out.println("Red kurkure");
            }
            else {
                System.out.println("Green Kurkure");
            }
        }
        else {
            System.out.println("Better Lucky next Time. ");
        }
    }
}
