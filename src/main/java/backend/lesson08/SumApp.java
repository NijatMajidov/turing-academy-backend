package backend.lesson08;

public class SumApp {

    public static void main(String[] args) {
        int[] nums = new int[2];
        nums[0]=1;
        nums[1]=2;
        int sum= sum(nums);
        System.out.println(sum);

    }

    public static int sum(int[] vekils){

        int sum = vekils[0]+vekils[1];

        return sum;
    }
}
