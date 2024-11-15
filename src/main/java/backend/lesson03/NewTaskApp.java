package backend.lesson03;

import java.util.Scanner;

public class NewTaskApp {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: \t");
        int number = scan.nextInt();
        System.out.println("Number is "+number);
        System.out.print("Cutdurse true, tekdirse false: \t");
                System.out.print( number % 2 == 0 && true || false);
    }
}
