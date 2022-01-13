package com.company;

import java.util.*;

/* #15
 * Reflection: I was only able to lower the running time down to O(N^2 Log N). I can't figure out how to get an
 *             intermediate pair in constant time or N time.
 *             I know this question has something to do with the structure of three tuple which must consist of
 *             two negatives and a position or two positives and a negative or cases with zero
 *
 *             Third Attempt O(N^2) preprocessing:
 *                  1. construct hashmap to note how many times each value has occurred
 *                  2. iterate through every tuple X + Y
 *                  3. check if hashmap contains Z such that 0 = X + Y + Z
 *                      a. have code to tell if we are just reusing X and Y (which is not allowed)
 *                  Although this is O(N^2) in theory, I think it still timed out because too many if statements and
 *                  it's very inefficient
 *
 * Optimal Solution Reflection: The optimal solution implemented something I talked about earlier where they constructed
 *                              a sum in linear time. I should have played around with this idea more in depth.
 *
 */
public class ThreeSum {

    // my horrible O(N^3) brute force solution 8)
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

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
                        zeroSum.sort((o1, o2) -> 0);
                        if (!result.contains(zeroSum)) {
                            result.add(zeroSum);
                        }
                    }
                }
            }
        }
        return result;
    }


    // second solution O(n^2 logN)
    // for (int i = 0; i < nums.length - 2; i++) {
    //      for (int j = i + 1; j < nums.length - 1; j++) {
    //          int twoSum = nums[i] + nums[j];
    //          bsearch(-twoSum);


    // third solution O(n^2)
    // still time out hahaha
    public List<List<Integer>> threeSumThird(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int value = map.getOrDefault(nums[i], 0);
            map.put(nums[i], ++value);
        }

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int twoSum = nums[i] + nums[j];
                int negTwoSum = twoSum * -1;
                if (map.containsKey(negTwoSum)) {
                    if (negTwoSum == nums[i] && negTwoSum == nums[j]) {
                        // 0 + 0 + 0, confirm > 2 zeros
                        if (map.getOrDefault(negTwoSum, -1) < 3) {
                            continue;
                        }
                    } else if (negTwoSum == nums[i]) {
                        // x + y + x, confirm num[i] > 1 occurrence
                        if (map.getOrDefault(negTwoSum, -1) < 2) {
                            continue;
                        }
                    } else if (negTwoSum == nums[j]) {
                        // x + y + y, confirm num[j] > 1 occurrence
                        if (map.getOrDefault(negTwoSum, -1) < 2) {
                            continue;
                        }
                    }

                    List<Integer> zeroSum = new ArrayList<>();
                    zeroSum.add(nums[i]);
                    zeroSum.add(nums[j]);
                    zeroSum.add(negTwoSum);
                    Collections.sort(zeroSum);
                    if (!result.contains(zeroSum)) {
                        result.add(zeroSum);
                    }
                }
            }
        }
        return result;
    }


    // O(N^2) solution from discussions.
    public List<List<Integer>> threeSumOPTIMAL(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || num[i] != num[i - 1] || num[i] > 0) {
                int lo = i+1, hi = num.length-1, sum = 0 - num[i];
                while (lo < hi) {
                    if (num[lo] + num[hi] == sum) {
                        res.add(Arrays.asList(num[i], num[lo], num[hi]));
                        while (lo < hi && num[lo] == num[lo+1]) lo++;
                        while (lo < hi && num[hi] == num[hi-1]) hi--;
                        lo++; hi--;
                    } else if (num[lo] + num[hi] < sum) lo++;
                    else hi--;
                }
            }
        }
        return res;
    }
}
