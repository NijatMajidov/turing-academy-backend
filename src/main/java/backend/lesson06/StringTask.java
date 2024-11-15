package backend.lesson06;

import java.util.Scanner;

public class StringTask {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a word: ");
            String word = scanner.next();
            // 1. Insert a word and print the last character
            char lastChar = word.charAt(word.length() - 1);
            System.out.println("Last character: " + lastChar);

            // 2. Insert a word and check if the last character is a vowel
            if ("AEIOUaeiou".indexOf(lastChar) != -1) {
                System.out.println("The last character is a vowel.");
            } else {
                System.out.println("The last character is not a vowel.");
            }

            // 3. Insert a word, reverse it, and convert it to uppercase
            String reversedWord = new StringBuilder(word).reverse().toString().toUpperCase();
            System.out.println("Reversed and uppercased word: " + reversedWord);
        }
}



