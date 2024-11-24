package backend.eolympProblems.problem21;

import java.util.Arrays;

public class CorruptionApp {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        double[] balances = new double[N];

        for (int i = 0; i < N; i++) {
            balances[i] = sc.nextDouble();
        }
        Arrays.sort(balances);

        while (N > 1) {
            double account1 = balances[0];
            double account2 = balances[1];

            double mergedBalance = account1 + account2;
            double remainingBalance = mergedBalance - (P / 100.0) * mergedBalance;

            balances[0] = remainingBalance;

            for (int i = 1; i < N - 1; i++) {
                balances[i] = balances[i + 1];
            }

            N--;
            Arrays.sort(balances, 0, N);
        }
        System.out.printf("%.2f\n", balances[0]);
    }
}