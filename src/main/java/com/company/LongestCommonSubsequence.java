package com.company;

import java.util.Arrays;

/* # 1143
 * Reflection: I watched a video to solve this
 *
 * Optimal Solution Reflection: 1. notice when mental boom and rest
 *                              2. WORK through your test cases. Really understand why you're executing a command
 *                                 Don't just mindlessly write something and say yes that works. PROVE IT with a
 *                                 test case.
 */
public class LongestCommonSubsequence {

    // initial wrong answer
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int [text1.length() + 1][text2.length() + 1];
        for (int i = 0; i < text1.length() + 1; i++) {
            Arrays.fill(dp[i], 0);
        }

        for (int i = text1.length() - 1; i > -1; i--) {
            for (int j = text2.length() - 1; j > -1; j--) {
                int max = Math.max(dp[i][j+1], dp[i+1][j]);

                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + max;
                } else {
                    dp[i][j] = max;
                }
            }
        }
        return dp[0][0];
    }

    // second iteration
    // Runtime: 18 ms, faster than 59.65% of Java online submissions for Longest Common Subsequence.
    // Memory Usage: 46.9 MB, less than 17.38% of Java online submissions for Longest Common Subsequence.
    public int longestCommonSubsequenceSecond(String text1, String text2) {
        int[][] dp = new int [text1.length() + 1][text2.length() + 1];

        // fill bottom row and rightmost column with 0
        Arrays.fill(dp[text1.length()], 0);
        for (int i = 0; i < text1.length() + 1; i++) {
            dp[i][text2.length()] = 0;
        }

        // setup adjacency matrix
        int match = 0;
        for (int i = text1.length() - 1; i > -1; i--) {
            for (int j = text2.length() - 1; j > -1; j--) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
}
