package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CheckArrayIsSortedOrNot {

    public static boolean sorted(int[] arr)
    {

        boolean isSorted = IntStream.range(0, arr.length - 1).allMatch(i -> arr[i] <= arr[i + 1]);

        return isSorted;
    }
    public static void main(String[] args) {

        int[] arr={3,4,5,1,2};
        System.out.println(sorted(arr));



    }
}

