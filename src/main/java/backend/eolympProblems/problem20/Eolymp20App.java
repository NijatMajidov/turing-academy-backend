package backend.eolympProblems.problem20;

import java.util.Scanner;

public class Eolymp20App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long temp,count=0;
        long sum=0;
        temp=num;
        while(num>0) {
            while(temp>0) {
                sum+=temp%10;
                temp/=10;
            }
            num-=sum;
            count++;
            temp=num;
            sum=0;
        }
        System.out.print(count);
    }
}