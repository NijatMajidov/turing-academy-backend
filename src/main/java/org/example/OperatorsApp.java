package org.example;

import java.util.Scanner;

public class OperatorsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a first number: \t");
        int a = scan.nextInt();
        System.out.print("Enter a seccond number: \t");
        int b = scan.nextInt();
        System.out.println("First number -" + a + " Second number -" + b);

        // Unary operators
        System.out.println("a++: " + (a++));
        System.out.println("++a : " + (++a));

        System.out.println("b-- : " + (b--));
        System.out.println("--b : " + (--b));

        // Assignment operators
        System.out.print("Enter a number num: \t");
        int num = scan.nextInt();
        System.out.println("Number is num " + num);
        System.out.println("num += 3: " + (num += 3));
        System.out.println("New num " + num);
        System.out.println("num -= 2: " + (num -= 2));
        System.out.println("num *= 4: " + (num *= 4));
        System.out.println("num /= 3: " + (num /= 3));
        System.out.println("num %= 2: " + (num %= 2));
        System.out.println("num &= 0b1010: " + (num &= 0b1010));
        System.out.println("num |= 0b1100: " + (num |= 0b1100));
        System.out.println("num ^= 0b1010: " + (num ^= 0b1010));
        System.out.println("num <<= 2: " + (num <<= 2));
        System.out.println("num >>= 1: " + (num >>= 1));
        System.out.println("num >>>= 1: " + (num >> 1));

        // Comparison operators
        System.out.print("Enter a number c: \t");
        int c = scan.nextInt();
        System.out.println("First number -" + a + " Second number -" + b + " third number -" + c);

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
    }
}
