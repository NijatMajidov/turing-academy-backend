package backend.eolympProblems.problem8827;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = ((x * x + 3 * x - 4) / (2 * x - 3)) - ((x + 2) / (x * x - 5 * x + 7));
        System.out.printf("%.3f",y);
    }
}
