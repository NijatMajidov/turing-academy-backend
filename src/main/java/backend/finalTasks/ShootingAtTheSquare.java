package backend.finalTasks;

import java.util.Random;
import java.util.Scanner;

public class ShootingAtTheSquare {

    public static void main(String[] args) {
        //input
        char[][] board = new char[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = '-';
            }
        }
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);

        System.out.println("All set. Get ready to rumble!");
        //proses
        while(true){
            int row = getUserInput("Enter row (1-5): ", scanner);
            int col = getUserInput("Enter column (1-5): ", scanner);

            if(row == targetRow && col == targetCol){
                board[row][col] = 'x';
                printBoard(board);
                System.out.println("You have won!");
                break;
            }else if(board[row][col] == '*'){
                System.out.println("You already shot here. Try again.");
            }else{
                board[row][col] = '*';
                printBoard(board);
            }
        }
    }

    public static int getUserInput(String text, Scanner scanner){
        int input = 0;
        while(true){
            System.out.print(text);
            String line = scanner.nextLine();
            if(isNumeric(line)){
                input = Integer.parseInt(line);
                if(input>0 && input<6){
                    break;
                }else{
                    System.out.println("Number out of range. Please enter a number between 1 and 5.");
                }
            }else{
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return input-1;
    }

    public static boolean isNumeric(String str) {
        if(str == null || str.isEmpty()){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if (!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("  | 1 | 2 | 3 | 4 | 5 |");
        for(int i = 0; i < board.length; i++){
            System.out.print((i + 1) + " | ");
            for(int j = 0; j < board[i].length; j++){
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
        }
    }
}