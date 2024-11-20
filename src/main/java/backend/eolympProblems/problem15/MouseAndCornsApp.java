package backend.eolympProblems.problem15;

import java.util.Scanner;

public class MouseAndCornsApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] X = new int[n][m];
        StringBuilder ans = new StringBuilder();

        for (int i = n - 1; i >= 0; i--){
            for (int j = 0; j < m; j++){
                X[i][j] = scan.nextInt();
            }
        }
        for (int i = 1; i < n; i++){
            X[i][0] += X[i-1][0];
        }
        for (int j = 1; j < m; j++){
            X[0][j] += X[0][j-1];
        }
        for (int i = 1; i < n; i++){
            for (int j = 1; j < m; j++){
                X[i][j] += Math.max(X[i - 1][j], X[i][j-1]);
            }
        }
        int k = n - 1, t = m - 1;
        while(k > 0 || t > 0){
            if(k > 0 && t > 0){
                if(X[k-1][t] > X[k][t-1]){
                    ans.append("F");
                    k--;
                }else{
                    ans.append("R");
                    t--;
                }
            }else if (k == 0){
                ans.append("R");
                t--;
            }else if (t == 0){
                ans.append("F");
                k--;
            }
        }
        ans.reverse();
        System.out.println(ans.toString());
    }
}