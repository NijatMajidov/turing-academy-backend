package org.example;

public class LoopsApp {
    public static void main(String[] args) {
        //input
        int i=0;
        //for
        //proses
        for(; i<=10;i++){
            System.out.println("Value:" +i);
        }

        //output
        System.out.println(i++);

        //While
        //input
        int j=0;
        //proses
        while(j<=10){
            System.out.println(j);
            j++;
        }
        //output
        System.out.println(j);
        System.out.println(j++);
        }
}
