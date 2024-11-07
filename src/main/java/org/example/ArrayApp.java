package org.example;

import java.util.Scanner;

public class ArrayApp {

    public static void main(String[] args) {
        //input
        int[] num = new int[6];
        Scanner scan = new Scanner(System.in);
        //proses
        for(int i=0;i<num.length;i++){
            num[i]= scan.nextInt();
        }
        int max = num[0], min = num[0];
        for(int i=1;i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
            if(min>num[i])
                min=num[i];
        }
        //output
        System.out.println("Max: "+max+"\nMin: "+min);
    }
}
