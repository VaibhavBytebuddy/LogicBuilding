package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {

    public  static int missingNumber(int[] nums) {
        int n=nums.length;
        int expSum= n*(n+1)/2;//sum of number formula

        int actSum= Arrays.stream(nums).sum();

        return expSum-actSum;
    }
        public static void main(String[] args) {
        int[] arr={9,6,4,2,3,5,7,0,1};
            System.out.println(missingNumber(arr));
    }
}
