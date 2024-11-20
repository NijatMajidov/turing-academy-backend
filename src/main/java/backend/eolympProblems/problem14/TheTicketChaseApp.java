package backend.eolympProblems.problem14;

import java.util.Scanner;
public class TheTicketChaseApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPassengers = scanner.nextInt();
        int ticketNumber = scanner.nextInt();

        for (int i = 1; i < totalPassengers; i++){
            if (isPrime(ticketNumber + i)){
                System.out.println(i-1);
                break;
            }else if(i==totalPassengers-1){
                System.out.println("-1");
            }
        }
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
}