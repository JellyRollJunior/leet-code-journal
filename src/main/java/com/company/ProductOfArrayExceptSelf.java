package com.company;

/* #238
 * Reflection:
 *
 * Optimal Solution Reflection:
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

    // second attempt O(N-1 + N-1 + N) == O(3N) == O(N)
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

    // cleaned up previous solution
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
}
