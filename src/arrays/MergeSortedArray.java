package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.*;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=0;
        int j=0;
        int k=0;
        int[] res=new int[m+n];
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                res[k++]=nums1[i++];
            }else
            {
                res[k++]=nums2[j++];
            }
        }
        while (i<m)
        {
            res[k++]=nums1[i++];
        }
        while (j<n)
        {
            res[k++]=nums2[j++];
        }

        System.out.println(Arrays.toString(res));

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,0,0,0};
        int[] arr2={2,5,6};

        merge(arr,3,arr2,3);



    }
}
