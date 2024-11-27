package backend.Mentor;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Eded sayini daxil edin: ");
        int count = scan.nextInt();

        int[] numbers = new int[count];
        System.out.print("Ededleri daxil edin: ");
        for(int i=0;i<count;i++){
            numbers[i]= scan.nextInt();
        }

        int say=0;
        for(int i=1;i<count-1;i++){
            if(numbers[i]>numbers[i-1] && numbers[i]>numbers[i+1]){
                say++;
            }
        }

        System.out.println(say);
    }
}
