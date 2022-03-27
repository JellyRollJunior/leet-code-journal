package com.company;

import java.util.HashMap;

/* #3
 * Reflection: First Intuition was to use hashset but I didn't realize you have to backtrack everytime you find a duplicate
 *             too. Ended up coding a very hacky hashmap implementation. Second implementation removed unnecessary variable.
 *             I still feel unsatisfied with my solution even though its O(2N) at worst case. I feel like there's a more elegant
 *             way to do this. Third cleanest solution: I guess calling map.size() uses a lot of resources cuz i removed
 *             the count variable but now its slower lol. In spite of that, I'm actually very satisfied with this solution as
 *             it has a good combination of speed and clarity.
 *
 * Optimal Solution Reflection: Optimal solution uses an array instead of a hashmap. I actually did think of this but
 *                              didn't want to search up how many chars there are in total haha. Stop bein lazy boi.
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {

    // initial solution
    // Runtime: 11 ms, faster than 60.65% of Java online submissions for Longest Substring Without Repeating Characters.
    // Memory Usage: 46.5 MB, less than 23.84% of Java online submissions for Longest Substring Without Repeating Characters.
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;
        int count = 0;
        int startIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (map.containsKey(current)) {
                // delete all values from count start to last appearance of current
                int repeatIndex = map.get(current);
                for (int j = startIndex; j <= repeatIndex; j++) {
                    map.remove(s.charAt(j));
                    count--;
                }
                startIndex = repeatIndex + 1;
            }

            map.put(current, i);
            count++;
            max = Math.max(max, count);
        }
        return max;
    }

    // second solution
    // Runtime: 5 ms, faster than 86.33% of Java online submissions for Longest Substring Without Repeating Characters.
    // Memory Usage: 42.6 MB, less than 85.30% of Java online submissions for Longest Substring Without Repeating Characters.
    public int lengthOfLongestSubstringSecond(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (map.containsKey(current)) {
                // delete all values from count start to last appearance of current
                int repeatIndex = map.get(current);
                for (int j = (i - count); j <= repeatIndex; j++) {
                    map.remove(s.charAt(j));
                    count--;
                }
            }
            map.put(current, i);
            count++;
            max = Math.max(max, count);
        }
        return max;
    }

    // third solution
    // Runtime: 11 ms, faster than 60.65% of Java online submissions for Longest Substring Without Repeating Characters.
    // Memory Usage: 45.9 MB, less than 35.94% of Java online submissions for Longest Substring Without Repeating Characters.
    public int lengthOfLongestSubstringCleanest(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (map.containsKey(current)) {
                // delete all values from count start to last appearance of current
                int repeatIndex = map.get(current);
                int startIndex = i - map.size();
                for (int j = startIndex; j <= repeatIndex; j++) {
                    map.remove(s.charAt(j));
                }
            }
            map.put(current, i);
            max = Math.max(max, map.size());
        }
        return max;
    }
}
