package com.company;


import java.util.HashMap;

// #1
public class TwoSum {
    /*
     * Reflection: This question took me much longer than I would have liked. For my second solution, I played around
     *             with the idea of sorting the array first but that would have given the solution N log N time at best.
     *             Always think hash table first for best time.
     *
     * Optimal Solution Reflection: Always try to simplify code. I should have combined loops put the target check in
     *                              the initial preprocessing loop like in the optimal solution. The optimal solution is
     *                              also simpler than my solution as it doesn't need to deal with the duplicate value
     *                              case.
     */

    // initial brute force solution
    // Runtime: 91 ms, faster than 11.30% of Java online submissions for Two Sum.
    // Memory Usage: 39.2 MB, less than 71.09% of Java online submissions for Two Sum.
    public int[] twoSum(int[] nums, int target) {
        int[] output = {0, 0};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    if (i != j) {
                        output[0] = i;
                        output[1] = j;
                    }
                }
            }
        }

        return output;
    }

    // second attempt
    // Runtime: 3 ms, faster than 65.57% of Java online submissions for Two Sum.
    //Memory Usage: 40.2 MB, less than 30.23% of Java online submissions for Two Sum.
    public static int[] twoSumSecond(int[] nums, int target) {
        int[] output = {0, 0};

        // preprocess
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int sumToTarget = target - nums[i];
            int index = map.getOrDefault(sumToTarget, -1);

            if (index > -1 && i != index) {
                output[0] = i;
                output[1] = index;
                break;
            }
        }

        return output;
    }

    // Copying optimal solution
    // Runtime: 1 ms, faster than 99.69% of Java online submissions for Two Sum.
    // Memory Usage: 39 MB, less than 80.88% of Java online submissions for Two Sum.
    public int[] twoSumOptimal(int[] nums, int target) {
        int[] output = {0, 0};

        // preprocess
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                output[1] = i;
                output[0] = map.get(target - nums[i]);
                return output;
            }
            map.put(nums[i], i);
        }

        return output;
    }
}
