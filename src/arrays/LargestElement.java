package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.OptionalInt;

public class LargestElement {

    public static int large(int[] num)
    {
        OptionalInt max = Arrays.stream(num).max();
        return max.orElse(Integer.MIN_VALUE);
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,25,1,5};
        System.out.println(large(arr));
    }

}
