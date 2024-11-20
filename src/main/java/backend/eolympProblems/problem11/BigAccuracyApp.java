package backend.eolympProblems.problem11;

import java.util.Scanner;

public class BigAccuracyApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        System.out.print(m/n);
        int qaliq = m%n;
        m= qaliq*10;
        if(k>0){
            System.out.print(".");
        }
        for (int i = 1; i <= k; i++)
        {
            System.out.print(m/n);
            qaliq = m%n;
            m = qaliq*10;
        }
    }
}