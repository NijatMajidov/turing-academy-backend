package backend.lesson02;

import java.util.Scanner;

public class SelectionStatementsApp {
    public static void main(String[] args) {

        //input
        Scanner scan = new Scanner(System.in);
        System.out.print("Eded daxil edin : ");
        int value= scan.nextInt();
        String result = "";

        //proses
        if(value%3==0){
            result="Eded 3 e tam bolunur";
        } else if (value%3==1) {
            result="Eded 3 e tam bolunmur ve qaliq 1-dir";
        } else {
            result="Eded 3 e tam bolunmur ve qaliq 2-dir";
        }
        //output
        System.out.println(result);
    }
}
