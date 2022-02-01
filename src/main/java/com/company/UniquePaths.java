package com.company;

public class UniquePaths {

    // initial solution
    // time limit exceeded
    public int uniquePaths(int m, int n) {
        return helper(m - 1, n - 1);
    }

    public int helper(int m, int n) {
        if (m == 0 && n == 0) {
            return 1;
        } else if (m < 0 || n < 0) {
            return 0;
        }

        return helper(m - 1, n) + helper(m, n - 1);
    }

    // second solution
    // Runtime: 1 ms, faster than 39.87% of Java online submissions for Unique Paths.
    // Memory Usage: 40.8 MB, less than 5.46% of Java online submissions for Unique Paths.
    public int uniquePathsSecond(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 0; i < n; i++) {
            dp[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        return dp[m-1][n-1];
    }
}
