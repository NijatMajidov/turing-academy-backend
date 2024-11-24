package backend;

import java.util.Scanner;

public class Modul01_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        printTr(size);
    }

    public static void printTr (int size){
        for(int i=1;i<=size;i++){
            for(int j=size;j>0;j--){
                if(i==j || i>j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
