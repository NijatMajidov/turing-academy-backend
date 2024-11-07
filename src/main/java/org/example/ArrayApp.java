package org.example;

import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        int[] num ={35,43,545,23,12};

        int max = num[0];
        for(int i=1;i<num.length;i++){
            if(max<num[i]){
                max=num[i];
            }
        }

        System.out.println(max);
    }
}
