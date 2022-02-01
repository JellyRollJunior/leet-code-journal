package com.company;

import java.util.Arrays;

/* #62
 * Reflection: I'm in kind of a slump today. This question should have been a slam dunk but I fucked it up. I found the
 *             optimal sub structure immediately but for some reason my run time analysis is way off today.
 *
 * Optimal Solution Reflection: A really creative way to save space here. I needed to refer to the diagram in the
 *                              question prompt multiple times to get it. It's hard for me to visualize the matrix.
 *                              I need to practice matrix questions more
 *
 */
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

    // Optimal Space Solution From Discussions
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
    // Memory Usage: 41.1 MB, less than 5.46% of Java online submissions for Unique Paths.
    public int uniquePathsOptimal(int m, int n) {
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j - 1] + dp[j];
            }
        }
        return dp[n - 1];
    }
}
