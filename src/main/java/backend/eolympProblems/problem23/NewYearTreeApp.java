package backend.eolympProblems.problem23;

import java.util.Scanner;

public class NewYearTreeApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan. nextInt();
        int count = 0;

        if (n == 1){
           count=k;
        }else if ((k == 1) || ((n%2 == 1) && (k == 2))){
            count=-1;
        }else if ((k == 2) && (n%2 == 0)) {
            count = 2;
        }else{
            count = Counter(n,k);
        }
        System.out.println(count);
    }

    public static int Counter(int n,int k){
        if (n == 2){
            return k*(k - 1);
        }else{
            return k * Step(k - 1,n - 1) - Counter(n - 1, k);
        }
    }

    public static  int Step (int x,int y){
        int t = 1;
        int j = 1;
        while (j <= y){
            t = t*x;
            j++;
        }
        return t;
    }
}