package org.example;

import java.util.Scanner;

public class Task3App {

    public static void main(String[] args) {

        System.out.println("Lowercase letters:");
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
        /* Or
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + " ");
        }
        */
        System.out.println("\nUppercase letters:");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }
        /* Or
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }
        */
    }
}
