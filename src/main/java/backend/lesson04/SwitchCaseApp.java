package backend.lesson04;

import java.util.Scanner;

public class SwitchCaseApp {
    public static void main(String[] args) {
        //input
        Scanner scan = new Scanner(System.in);
        System.out.print("Eded daxil edin : ");
        int value= scan.nextInt();
        String result = "";

        //proses
        switch (value%3){
            case 0:
                result = "Eded 3-e tam bolunur";
                break;
            case 1:
                result = "Eded 3-e tam bolunmur ve  qaliq 1-dir";
                break;
            case 2:
                result = "Eded 3-e tam bolunmur ve  qaliq 2-dir";
                break;
            default:
                result = "Eded 3-e tam bolunmur ve qaliq "+ value%3+"-dur";
        }

        //output
        System.out.println(result);

    }
}
