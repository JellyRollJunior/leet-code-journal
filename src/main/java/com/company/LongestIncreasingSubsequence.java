package com.company;

public class LongestIncreasingSubsequence {

    // initial O(N^2) solution : 41 mins
    // Runtime: 77 ms, faster than 35.01% of Java online submissions for Longest Increasing Subsequence.
    // Memory Usage: 41.5 MB, less than 23.77% of Java online submissions for Longest Increasing Subsequence.
    public int lengthOfLIS(int[] nums) {
        int max = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int previousLongest = 0;
            int j = i - 1;
            while(j > -1) {
                if (nums[i] > nums[j]) {
                    previousLongest = Math.max(previousLongest, result[j]);
                }
                j--;
            }
            result[i] = 1 + previousLongest;
            max = Math.max(result[i], max);
        }
        return max;
    }
}
