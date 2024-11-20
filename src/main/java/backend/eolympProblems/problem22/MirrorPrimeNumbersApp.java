package backend.eolympProblems.problem22;

import java.util.Scanner;

public class MirrorPrimeNumbersApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int begin = scan.nextInt();
        int end = scan.nextInt();
        int count=0;

        for(int i=begin; i<=end; i++){
            if(isPrime(i)){
                if(isPrime(mirrorNumber(i))){
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static boolean isPrime(int num) {
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int mirrorNumber(int number) {
        int mirror = 0;
        while (number != 0) {
            int digit = number % 10;
            mirror = mirror * 10 + digit;
            number /= 10;
        }
        return mirror;
    }
}