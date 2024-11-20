package backend.eolympProblems.problem16;

import java.util.Scanner;

public class DragonApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int legS = sc.nextInt();
        int headDragon = sc.nextInt();
        int totalHeads = sc.nextInt();
        int totalLegs = sc.nextInt();
        int countDragon, legsDragon;

        if(legS * totalHeads == totalLegs){
            System.out.print(legS * headDragon);
        }else{
            countDragon=1;
            while (countDragon<1001){
                if(Math.abs(legS * totalHeads - totalLegs)%countDragon==0){
                    legsDragon = ((totalLegs - legS * totalHeads)/ countDragon)+legS*headDragon;
                    if(legsDragon>=0 && totalHeads > countDragon*headDragon){
                        System.out.print(legsDragon);
                        break;
                    }
                }
                countDragon++;
            }
            if (countDragon == 1001) {
                System.out.print(-1);
            }
        }
    }
}