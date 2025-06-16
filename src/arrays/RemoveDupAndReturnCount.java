package arrays;

import java.util.Arrays;

public class RemoveDupAndReturnCount {

    public static int removeDuplicates(int[] nums) {

        if(nums.length==0)
        {
            return 0;
        }
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};

        int count =(int) Arrays.stream(arr).distinct().count();
        System.out.println(count);
        System.out.println("orrr");

        System.out.println(removeDuplicates(arr));
    }
}
