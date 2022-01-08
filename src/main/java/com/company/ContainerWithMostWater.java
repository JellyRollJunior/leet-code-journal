package com.company;

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
}
