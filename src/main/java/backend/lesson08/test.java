package backend.lesson08;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random rand = new Random();
        for (int i =28; i > 0; i--) {
            int j = rand.nextInt(2);
            System.out.println(i+" "+j);
        }
    }
}
