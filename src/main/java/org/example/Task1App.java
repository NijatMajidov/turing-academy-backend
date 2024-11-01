package org.example;

import java.util.Scanner;

public class Task1App {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String result = "";

        //proses
        if (number > 0) {
            result="The number is positive.";
        } else if (number < 0) {
            result="The number is negative.";
        } else {
            result="The number is zero.";
        }

        if (number % 2 == 0) {
            result+=" The number is even.";
        } else {
            result+=" The number is odd.";
        }

        //output
        System.out.println(result);
    }
}
