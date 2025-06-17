package arrays;


import java.util.Arrays;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int temp=1;
        int count=0;

        if(nums.length==0)
        {
            return 0;
        }
        for (int i=1;i<nums.length;i++) {
            if (nums[i] == nums[i - 1])
            {
                temp++;
            }else {
                if(temp>count)
                {
                    count=temp;
                }
                temp=1;
            }
        }
        if(temp>count)
        {
            count=temp;
        }
        return count;
    }
    public static void main(String[] args) {

        int[] arr={1,1,0,1,1,1};

        System.out.println(findMaxConsecutiveOnes(arr));

    }
}
