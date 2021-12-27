package com.company;

import java.util.HashMap;
import java.util.HashSet;

/* #217
 * Reflection: For my initial solution, it was actually pretty good time wise, just not that great memory wise. For my
 *             second attempt, I improved the space usage very very slightly by using HashSet instead of HashMap.
 *
 * Optimal Solution Reflection: I most solutions used a hashSet so I'm satisfied with my answer for once!
 *
 */
public class ContainsDuplicate {

    // Initial Solution
    // Runtime: 6 ms, faster than 62.34% of Java online submissions for Contains Duplicate.
    // Memory Usage: 52.7 MB, less than 16.10% of Java online submissions for Contains Duplicate.
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int value : nums) {
            if (map.containsKey(value)) {
                return true;
            }
            map.put(value, value);
        }

        return false;
    }

    // Second Solution
    // Runtime: 5 ms, faster than 75.97% of Java online submissions for Contains Duplicate.
    // Memory Usage: 52.3 MB, less than 18.08% of Java online submissions for Contains Duplicate.
    public boolean containsDuplicateSecond(int[] nums) {
        HashSet<Integer> map = new HashSet<>();

        for (int value : nums) {
            if (map.contains(value)) {
                return true;
            }
            map.add(value);
        }
        return false;
    }

    public static void main(String[] args) {
        int x = 0;
        int y = x ^ 5;
        int z = y ^ 5;
        System.out.println("y: " + y + " z: " + z );
    }
}
