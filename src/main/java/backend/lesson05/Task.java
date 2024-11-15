package backend.lesson05;
import java.util.Arrays;
import java.util.Scanner;
public class Task {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int[][] arr = new int[a][];

        for (int i = 0; i < a; i++) {
            arr[i] = new int[i+1];
            for (int j = 0; j <= i; j++) {
                arr[i][j] = i + 1;
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
//Usaqlar ve yerleri qarissin