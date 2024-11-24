package backend.eolympProblems.problem27;

import java.util.Scanner;

public class CycleShiftsApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String binryNum = Integer.toBinaryString(num);
        int lengthNum = binryNum.length();

        for (int i = 1; i <= lengthNum; i++) {
            binryNum = binryNum.substring(1)+binryNum.charAt(0);
            int newNum = Integer.parseInt(binryNum,2);
            System.out.println(newNum);
            if(newNum>num) {
                num=newNum;
            }
        }
        System.out.println(num);
    }
}