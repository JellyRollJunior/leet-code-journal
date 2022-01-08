package com.company;

/* #11
 * Reflection: I couldn't figure out the non brute force solution without looking at hints. I first tried to use dynamic
 *             programming and did for i = 0 .. N, calculate largest area using value i. This posed a lot of problems
 *             because we can't build a new answer optimal from previous values so dynamic programming doesn't work.
 *
 * Optimal Solution Reflection: After reading proof written by chipbk10, It's clear we have to go through all values of
 *                              the array, but we can eliminate many intermediate values at each iteration. Write out
 *                              formula for optimal intermediate value and try to tweak it to get an improved solution.
 *
 */
public class ContainerWithMostWater {

    // initial brute force solution
    // timeout haha 8)
    public int maxArea(int[] height) {
        int maxArea = 0;

        for (int i = 0; i < height.length - 1; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int left = height[i];
                int right = height[j];

                int area = Math.min(left, right) * (j - i);
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }

    // secondary solution - I used both hints which basically tell you the algorithm to use :(
    // Runtime: 2 ms, faster than 98.42% of Java online submissions for Container With Most Water.
    // Memory Usage: 52.2 MB, less than 95.95% of Java online submissions for Container With Most Water.
    public int maxAreaSecond(int[] height) {
        int maxArea = 0;

        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int area;
            if (height[i] < height[j]) {
                area = height[i] * (j - i);
                i++;
            } else {
                area = height[j] * (j - i);
                j--;
            }

            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
}
