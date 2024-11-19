package backend.eolympProblems.problem2;

import java.util.Scanner;

public class DigitsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;

        if(n==0){
            count = 1;
        }
        while(n!=0){
                count++;
                n/=10;
        }

        System.out.print(count);
    }
}