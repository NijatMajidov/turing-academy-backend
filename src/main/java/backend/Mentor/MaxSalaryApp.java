package backend.Mentor;

import java.util.Scanner;

public class MaxSalaryApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Isci maaslarini daxil edin: ");
        String line = scan.nextLine();
        String[] numbers= line.split(" ");

        double[] salarys = new double[numbers.length];

        for(int i=0;i< numbers.length;i++){
            salarys[i]= Double.parseDouble(numbers[i]);
        }

        double max=salarys[0];
        for(int i=0;i< salarys.length;i++){
            if(salarys[i]>max){
                max=salarys[i];
            }
        }

        System.out.printf("%.2f",max);
    }
}
