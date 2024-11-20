package backend.eolympProblems.problem19;

import java.util.Scanner;

public class DegreeOfSymmetryApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String mass = scan.next();
        int len = mass.length();
        int count = 0;

        for (int i = 0; i < len / 2 + len % 2; i++) {
            if (mass.charAt(i) == mass.charAt(len - i - 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}