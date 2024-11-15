package backend.lesson07;

import java.util.Arrays;
import java.util.Scanner;

public class Array2App {

    public static void main(String[] args) {
        //input
        int arr[][] = new int[3][4];
        Scanner scan = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]= scan.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));
        /*
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }*/
    }
}
