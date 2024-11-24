package backend.eolympProblems.problem10;

import java.util.Scanner;

public class GardenerApp {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            double totalWater = 0;
            int daysSkipped = 0;
            int count = n;

            while (totalWater <= 0.5) {
                totalWater += 1.0 / count;
                daysSkipped++;
                count--;
            }

            System.out.println(n - daysSkipped + 1);
        }
}