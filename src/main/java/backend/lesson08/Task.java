package backend.lesson08;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
       int[] arr1 = new int[]{1,2,3,4,5};
       int[] arr2 = arr1;

        System.out.printf(Arrays.toString(arr1));
        System.out.printf(Arrays.toString(arr2));
        arr1[0]=50;
        arr2[2]=20;
        System.out.printf(Arrays.toString(arr1));
        System.out.printf(Arrays.toString(arr2));

    }
}
