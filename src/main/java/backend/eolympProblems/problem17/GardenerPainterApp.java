package backend.eolympProblems.problem17;

import java.util.Scanner;

public class GardenerPainterApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countTrees = sc.nextInt();

        // Rəngləmə üsullarının sayını hesablayırıq
        long netice = 3 * (long) Math.pow(2, countTrees - 1);

        // Nəticəni ekrana yazdırırıq
        System.out.println(netice);
    }
}