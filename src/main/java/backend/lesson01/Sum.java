package backend.lesson01;

public class Sum {
    public static void main(String[] args) {

       int number1=15;
       int number2=7;

       int sum = number1+number2;
       int ferq = number1-number2;
       int bol = number1/number2;
       float kesr = (float) number1/number2;
       int vur = number1*number2;
       int qaliq = number1%number2;

        System.out.printf("Cem: %d\n",sum);
        System.out.printf("ferq: %d\n",ferq);
        System.out.printf("tam hisse: %d\n",bol);
        System.out.printf("kesr hisse: %f\n", kesr-bol);
        System.out.println(kesr);
        System.out.println(vur);
        System.out.println(qaliq);

    }
}