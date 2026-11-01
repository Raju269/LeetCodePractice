package Lecture02;
class Student {
    String name;                 // instance variable
    static String college = "YMCA"; // static variable

    void show() {
        int marks = 90;          // local variable
        System.out.println(marks);
    }
}
public class Variable {
    public static void main(String[] args) {
        System.out.println("Variable in java ");
        int age = 23;
//            | Type | Where declared | Belongs to |
//            | Local | Inside method/block | Method/block |
//            | Instance | Inside class, outside methods | Object |
//            | Static | With `static` keyword | Class |
        Student s1 = new Student();
        s1.name = "Raju kumar";
        System.out.println(s1.name);
    }
}
