package arrays;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.stream.Collectors;

public class MoveZero {

    public static void moveZeroes(int[] nums) {
        if(nums.length==1)
        {
           if (nums[0]==0)
           {
               System.out.println(nums[0]);
           }
        }

        int count = (int)Arrays.stream(nums)
                .filter(n -> n != 0)
                .count();

        int i=0;
        for(int num:nums)
        {
            if(num!=0)
            {
                nums[i++]=num;
            }
        }

        Arrays.fill(nums,count,nums.length,0);
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        int[] arr={0,1,0,3,12};

        moveZeroes(arr);

    }
}
