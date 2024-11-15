package backend.lesson08;

public class Method {

        // İki ədədin cəmini qaytarır
        public int add(int a, int b) {
            return a + b;
        }

        // Üç ədədin cəmini qaytarır
        public int add(int a, int b, int c) {
            return a + b + c;
        }

        // İki ondalık (double) ədədin cəmini qaytarır
        public void add(double a, double b) {
            System.out.println(a+b);
        }

        public static void main(String[] args) {
            Method calculator = new Method();

            System.out.println("İki tam ədədin cəmi: " + calculator.add(5, 10));
            System.out.println("Üç tam ədədin cəmi: " + calculator.add(5, 10, 15));
            System.out.print("İki ondalık ədədin cəmi: ");  calculator.add(5.5, 10.2);
        }
}


