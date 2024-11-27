package backend.lesson09;

import java.util.Scanner;

public class SchoolApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Student student1 = new Student(scan.nextLine(),scan.nextLine(),scan.nextInt());

        System.out.println(student1.toString());
        student1.name="jsfhjsdf";

        student1.setStudentId(2000);
        System.out.println(student1.toString());
    }
}