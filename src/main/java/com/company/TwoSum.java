package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class TwoSum {

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
}
