package Lecture01;

public class Three_condition_check {
    public static void main(String[] args) {
        int a = 10; 
        int b =  8;
        int c = 4;
        if(a>b &&  a>c){
            System.out.println("A is  greater than b and c");
        }
        else if(b>a && b>c){
            System.out.println("B is greater than a and c ");
        }
        else  {
            System.out.println("C is greater than a and b");
        }
    }
}
