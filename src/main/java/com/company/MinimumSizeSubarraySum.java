package com.company;

/* #209
 * Reflection: First solution was super clown. based it on the maximumSubarray question. Second solution was a good
 *             refactor. Third solution was something I wrote after seeing TWO POINTERS SOLUTION in the solutions tab.
 *             I had a DUH moment there. Having two pointers would have solved so many of my issues. REMEMBER THIS
 *
 * Optimal Solution Reflection: TWO POINTER
 *
 * TIME: 1:14:00
 */

public class MinimumSizeSubarraySum {

    // initial disgusting answer - I THOUGHT OF IT MYSELF THOUGH
    // Runtime: 3 ms, faster than 27.56% of Java online submissions for Minimum Size Subarray Sum.
    // Memory Usage: 58 MB, less than 6.22% of Java online submissions for Minimum Size Subarray Sum.
    public int minSubArrayLen(int target, int[] nums) {
        // if we do dynamic programming, itll be slower than N
        // exists O(N) solution

        // RUN MAX LOOP UNTIL MAX > TARGET
        // ONCE AT MAX -> WE HAVE THE WINDOW SIZE
        // SHRINK WINDOW SIZE WITH EACH NEW ADDITION TO ACCOMODATE

        int minWindow = Integer.MAX_VALUE;
        int currentWindow = 1;

        int max = nums[0];
        int current = nums[0];
        if (current >= target) {
            minWindow = Math.min(minWindow, currentWindow);
        }
        for (int i = 1; i < nums.length; i++) {

            // BUILD MAX
            current =  Math.max(current + nums[i], nums[i]);
            max = Math.max(max, current);
            currentWindow++;

            // SHRINK WINDOW
            if (current >= target && currentWindow > 1) {
                int head = nums[i - currentWindow + 1];
                while (current - head >= target) {
                    current -= head;
                    currentWindow--;

                    head = nums[i - currentWindow + 1];
                }
                minWindow = Math.min(minWindow, currentWindow);
            }
        }
        if (max >= target) { return minWindow; }
        return 0;
    }

    // REFACTORED SOLUTION
    // Runtime: 2 ms, faster than 62.55% of Java online submissions for Minimum Size Subarray Sum.
    // Memory Usage: 57.9 MB, less than 6.22% of Java online submissions for Minimum Size Subarray Sum.
     public int minSubArrayLen2(int target, int[] nums) {
        int current = nums[0];
        if (current >= target) {
            return 1;
        }

        boolean hitTarget = false;
        int minWindow = Integer.MAX_VALUE;
        int currentWindow = 1;
        for (int i = 1; i < nums.length; i++) {
            current += nums[i];
            currentWindow++;

            // SHRINK WINDOW IF >= TARGET
            if (current >= target && currentWindow > 1) {
                hitTarget = true;
                int head = nums[i - currentWindow + 1];
                while (current - head >= target) {
                    current -= head;
                    currentWindow--;

                    head = nums[i - currentWindow + 1];
                }
                minWindow = Math.min(minWindow, currentWindow);
            }
        }
        if (hitTarget) { return minWindow; }
        return 0;
    }

    // TWO POINTER SOLUTION
    // Runtime: 1 ms, faster than 100.00% of Java online submissions for Minimum Size Subarray Sum.
    // Memory Usage: 49.9 MB, less than 6.22% of Java online submissions for Minimum Size Subarray Sum.
    public int minSubArrayLenTP(int target, int[] nums) {
        int current = nums[0];
        if (current >= target) {
            return 1;
        }

        boolean hitTarget = false;
        int minWindow = Integer.MAX_VALUE;
        int head = 0;
        for (int i = 1; i < nums.length; i++) {
            current += nums[i];

            // increment head if current >= TARGET
            if (current >= target && i > head) {
                hitTarget = true;
                while (current - nums[head] >= target) {
                    current -= nums[head];
                    head++;
                }
                minWindow = Math.min(minWindow, i - head + 1);
            }
        }
        if (hitTarget) { return minWindow; }
        return 0;
    }
}
