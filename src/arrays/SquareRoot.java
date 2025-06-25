package arrays;

import java.util.ArrayList;

public class SquareRoot {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int low = 1, high = x, ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // To avoid overflow, use long
            long sq = (long) mid * mid;

            if (sq == x) return mid;
            if (sq < x) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans; // Floor of square root
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
