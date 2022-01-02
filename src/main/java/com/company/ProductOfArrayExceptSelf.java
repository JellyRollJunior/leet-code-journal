package com.company;

/* #238
 * Reflection: I'm very happy I got the algorithm for the optimal solution. This was all because I wrote down some test
 *             cases on a piece of scratch paper. I can feel myself learning and getting better!
 *
 * Optimal Solution Reflection: The optimal solution while having equal time complexity as mine, saves quite a bit of
 *                              time and space due to not needing to store right side values. Instead, they multiply
 *                              a variable. I should keep in mind when incrementally building a solution, It's not
 *                              always necessary to save every intermediate value.
 *
 */
public class ProductOfArrayExceptSelf {

    // brute force solution
    // time limit exceed :P
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    product = product * nums[j];
                }
            }

            result[i] = product;
        }

        return result;
    }

    // second attempt (N-1) + (N-1) + N = 3N = O(N)
    // Runtime: 1 ms, faster than 100.00% of Java online submissions for Product of Array Except Self.
    // Memory Usage: 51.7 MB, less than 50.24% of Java online submissions for Product of Array Except Self.
    public int[] productExceptSelfSecond(int[] nums) {
        int[] result = new int[nums.length];
        int[] productOneToEnd = new int[nums.length];
        int[] productMinusEnd = new int[nums.length];

        productOneToEnd[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            productOneToEnd[i] = productOneToEnd[i-1] * nums[i-1];
        }

        productMinusEnd[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            productMinusEnd[i] = productMinusEnd[i+1] * nums[i+1];
        }

        for (int i = 0; i < nums.length; i++) {
            result[i] = productOneToEnd[i] * productMinusEnd[i];
        }

        return result;
    }

    // cleaned up previous solution (N-1) + (N) = 2N-1 = O(N)
    // Runtime: 1 ms, faster than 100.00% of Java online submissions for Product of Array Except Self.
    // Memory Usage: 52.1 MB, less than 44.31% of Java online submissions for Product of Array Except Self.
    public int[] productExceptSelfThird(int[] nums) {
        int[] result = new int[nums.length];
        int[] productOneToEnd = new int[nums.length];
        int[] productMinusEnd = new int[nums.length];

        productMinusEnd[nums.length - 1] = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            productMinusEnd[i] = productMinusEnd[i+1] * nums[i+1];
        }

        productOneToEnd[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            productOneToEnd[i] = productOneToEnd[i-1] * nums[i-1];
            result[i] = productOneToEnd[i] * productMinusEnd[i];
        }
        result[0] = productMinusEnd[0];

        return result;
    }

    // Optimal solution found from discussion
    public int[] productExceptSelfOPTIMAL(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
    }
}
