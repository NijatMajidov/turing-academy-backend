package org.example;

import java.util.Scanner;

public class Task1App {
    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String result = "";

        //ternary version
        result = number % 2 == 1 && number > 0 ? "Positive Odd number" :
                (number % 2 == 0 && number > 0 ? "Positive Even number" :
                        (number < 0 && number % 2 == 0 ? "Negative Even number" :
                                (number % 2 == -1 && number < 0 ? "Negative Odd number" : "Zero")));

        System.out.println(result);
        //value reset
        result = "";
        //proses
        if (number == 0) {
            result = "The number is zero.";
        } else if (number < 0) {
            result = "The number is negative.";
            if (number % 2 == 0) {
                result += " The number is even.";
            } else {
                result += " The number is odd.";
            }
        } else {
            result = "The number is positive.";
            if (number % 2 == 0) {
                result += " The number is even.";
            } else {
                result += " The number is odd.";
            }
        }
        //output
        System.out.println(result);
    }
}
