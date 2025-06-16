package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class RotateArrToRight {
    public static void rotate(int[] nums, int k) {

        k=k % nums.length;
        List<Integer> al=new ArrayList<>();

        for (int i = nums.length-k; i < nums.length; i++) {
            al.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
          al.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i]=al.get(i);
        }

        System.out.println(Arrays.toString(nums));

    }

    public  static void usingLambda(int[] nums,int k)
    {
        k=k % nums.length;

        int[] rotated=IntStream
                .concat(
                        Arrays.stream(nums,nums.length-k,nums.length),
                        Arrays.stream(nums,0,nums.length-k)
                ).toArray();

        System.arraycopy(rotated,0,nums,0,nums.length);

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7};
        int k=3;

        rotate(arr,k);

    }
}
