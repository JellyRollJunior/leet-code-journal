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
}
