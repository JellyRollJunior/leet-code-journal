package com.company;

/* #253
 * Reflection: A very discouraging question. I basically only came up with a brute for solution.
 *
 * Optimal Solution Reflection: The worst part is I don't even understand the O(N) or the divide and conquer solution.
 *                              I'm gonna take a break and come back to this question at another time.
 *
 */
public class MaximumSubarray {

    // naive brute force solution
    // time limit exceeded hahaha
    public int maxSubArray(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;

            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];

                if (currentSum > max) {
                    max = currentSum;
                }
            }
        }

        return max;
    }

    // O(N)
    public static int maxSubArraySecond(int[] nums) {
        int max = nums[0];
        int maxAtIndex = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxAtIndex = Math.max(maxAtIndex + nums[i], nums[i]);
            max = Math.max(max, maxAtIndex);
        }

        return max;
    }

    // Divide and Conquer
    public static int maxSubArrayOptimal(int[] nums) {
        int max = nums[0];
        int maxAtIndex = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxAtIndex = Math.max(maxAtIndex + nums[i], nums[i]);
            max = Math.max(max, maxAtIndex);
        }

        return max;
    }

}
