package backend.eolympProblems.problem3;

import java.util.Scanner;

public class MatchsModelApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int S = 20, i, j, h = 1;

        int[] vec = new int[50];
        vec[0] = 8;
        vec[1] = 5;
        int currentSize = 2;

        if (n == 1) {
            System.out.println(12);
            return;
        } else if (n == 2) {
            System.out.println(20);

        } else {
            n -= 2;

            while (n > 0) {
                // Add elements of the array to S and decrement n
                for (i = 0; i < currentSize; i++) {
                    S += vec[i];
                    n -= 1;
                    if (n == 0) {
                        System.out.println(S);
                        return;
                    }
                }

                // Increase the array size by adding new elements (5 and 3s)
                // First, resize the array to accommodate new elements
                if (currentSize + h + 1 > vec.length) {
                    int[] newVec = new int[vec.length * 2]; // Double the size
                    System.arraycopy(vec, 0, newVec, 0, vec.length); // Copy old elements
                    vec = newVec; // Assign the new larger array to vec
                }

                // Add new elements: 5 followed by h number of 3s
                vec[currentSize++] = 5; // Add 5
                for (j = 1; j <= h; j++) {
                    vec[currentSize++] = 3; // Add h number of 3s
                }

                // Add the elements again to the sum
                for (int k = 0; k < 2; k++) {
                    for (i = 0; i < currentSize; i++) {
                        S += vec[i];
                        n -= 1;
                        if (n == 0) {
                            System.out.println(S);
                            return;
                        }
                    }
                }

                // Add another round of 5 and 3s for the next iteration
                vec[currentSize++] = 5; // Add 5
                for (j = 1; j <= h; j++) {
                    vec[currentSize++] = 3; // Add h number of 3s
                }

                h++; // Increase the repetition counter
            }
        }
    }
}