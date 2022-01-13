package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* #15
 * Reflection:
 *
 * Optimal Solution Reflection:
 */
public class ThreeSum {

    // my horrible O(N^3) brute force solution 8)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0) {
                while(nums[i] == nums[i-1] && i < nums.length - 2) {
                    i++;
                }
            }
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length ; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        List<Integer> zeroSum = new ArrayList<>();
                        zeroSum.add(nums[i]);
                        zeroSum.add(nums[j]);
                        zeroSum.add(nums[k]);
                        if (!result.contains(zeroSum)) {
                            result.add(zeroSum);
                        }
                    }
                }
            }
        }
        return result;
    }
}
