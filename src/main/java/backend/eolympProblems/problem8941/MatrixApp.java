package backend.eolympProblems.problem8941;

import java.util.Scanner;

public class MatrixApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        for (int i=1;i<=n;i++){
            for(int j=1; j<=m;j++){
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}
