package backend.eolympProblems.problem10029;

import java.util.Scanner;

public class Corona2020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a+b+c==2020){
            System.out.println(a+"+"+b+"+"+c);
        }
        else if(a+b-c==2020){
            System.out.println(a+"+"+b+"-"+c);
        }
        else if(a-b+c==2020){
            System.out.println(a+"-"+b+"+"+c);
        }
        else if(a-b-c==2020){
            System.out.println(a+"-"+b+"-"+c);
        }
        else{
            System.out.println("CORONA");
        }
    }
}
