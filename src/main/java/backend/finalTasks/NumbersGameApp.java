package backend.finalTasks;

import java.util.Random;
import java.util.Scanner;

public class NumbersGameApp {

    public static void main(String[] args) {
        //input
        Scanner scanner = new Scanner(System.in);
        //start game
        System.out.println("Let the game begin!");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Random random = new Random();
        int targetNumber = random.nextInt(101);

        int[] guesses = new int[1];
        int guessCount = 0;
        //proses
        while(true){
            System.out.print("Enter your guess: ");
            String input = scanner.nextLine();

            if(!isNumeric(input)){
                System.out.println("Invalid input. Please enter a valid number.");
                continue;
            }
            int userNumber = Integer.parseInt(input);
            //array-in olcusunu artiraraq, istifadəcinin daxil etdiyi ededi array-e elave edirik
            if(guessCount == guesses.length){
                int[] newGuesses = new int[guesses.length+1];
                for(int i = 0; i < guesses.length; i++){
                    newGuesses[i] = guesses[i];
                }
                guesses = newGuesses;
            }
            guesses[guessCount] = userNumber;
            guessCount++;
            //check
            if(userNumber < targetNumber){
                System.out.println("Your number is too small. Please, try again..");
            }else if(userNumber > targetNumber){
                System.out.println("Your number is too big. Please, try again..");
            }else{
                System.out.println("Congratulations, " + name + "!");
                break;
            }
        }
        System.out.println("Your numbers:");
        for(int i = 0; i < guessCount - 1; i++){
            for(int j = i + 1; j < guessCount; j++){
                if(guesses[i] < guesses[j]){
                    int temp = guesses[i];
                    guesses[i] = guesses[j];
                    guesses[j] = temp;
                }
            }
        }
        //output
        for (int i = 0; i < guessCount; i++) {
            System.out.print(guesses[i] + " ");
        }
    }

    public static boolean isNumeric(String str) {
        if(str == null || str.isEmpty()){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}