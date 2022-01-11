package com.company;

/* #153
 * Reflection: I based my logN solution on binary search. While im content with the running time, it's not coded very
 *             elegantly. I still have room for improvement in that aspect.
 *
 * Optimal Solution Reflection:
 *
 */
public class FindMinimumInRotatedSortedArray {

    // initial brute force solution
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }

    // logN solution based on binary search
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
    // Memory Usage: 39.3 MB, less than 20.67% of Java online submissions for Find Minimum in Rotated Sorted Array.
    public int findMinLogN(int[] nums) {
        int end = nums.length;
        if (nums[0] <= nums[end-1]) {
            return nums[0];
        }

        int i = end/2;
        while (nums[i] > nums[i-1]) {
            if (nums[i] < nums[0]) {
                // min on the left
                end = i;
                i = i / 2;
            } else {
                // min on the right
                i = (end + i) / 2;
            }
        }
        return nums[i];
    }

}
