package com.company;

public class ClimbingStairs {

    // initial solutions
    // time limit exceeded haha
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        } else if(n == 2) {
            return 2;
        }

        return climbStairs(n - 2) + climbStairs(n - 1);
    }

    // second solution (uses too much space)
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
    // Memory Usage: 37.8 MB, less than 10.29% of Java online submissions for Climbing Stairs.
    public int climbStairsSecond(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            int[] result = new int[n];
            result[0] = 1;
            result[1] = 2;

            for (int i = 2; i < n; i++) {
                result[i] = result[i-1] + result[i-2];
            }
            return result[n-1];
        }
    }

    // third solution
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
    // Memory Usage: 37.4 MB, less than 40.20% of Java online submissions for Climbing Stairs.
    public int climbStairsThird(int n) {
        if (n == 1) {
            return 1;
        }

        int prevprev = 1;
        int prev = 2;
        int current = 2;
        for (int i = 2; i < n; i++) {
            current = prev + prevprev;

            prevprev = prev;
            prev = current;
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println((0-1) % 3);

    }
}
