package backend.Mentor;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N-i daxil edin");
        int n=scan.nextInt();

        for (int i=n;i>0;i--){
            for(int j=0;j<n;j++){
                if(i==j){
                    break;
                }
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i>j){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
