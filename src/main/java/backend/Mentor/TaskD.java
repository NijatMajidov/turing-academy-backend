package backend.Mentor;

import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Massiv olcusunu daxil edin: ");
        int count = scan.nextInt();

        int[] numbers = new int[count];
        System.out.print("Ededleri daxil edin: ");
        for(int i=0;i<count;i++){
            numbers[i]= scan.nextInt();
        }

        int max = numbers[0];
        int say=0;
        for(int i=1;i<count-1;i++){
            if(numbers[i]>max){
                max=numbers[i];
                say++;
            }
        }
        System.out.println(max+" "+say);
    }
}
