package com.company;

/* #55
 * Reflection: slow solution in 20 mins, fast solution in 48 mins with O(1) space! Not bad. Making some improvement.
 *             My answer is based on the lemma: if i+k is reachable, then i to i+k is also reachable.
 *
 * Optimal Solution Reflection: I'm getting better at saving space. Although I realize that my approach to question
 *                              solving is not healthy. I run the tests over and over again til I get the right answer.
 *                              This approach promotes lazy behavior like not debugging cuz ill just check in the tests
 *                              to see if there's a bug. No more lazy coding for me!
 *
 */
public class JumpGame {

    // extremely slow initial solution. surprised it didn't time limit exceed. O(MN)
    // Runtime: 441 ms, faster than 14.53% of Java online submissions for Jump Game.
    // Memory Usage: 70 MB, less than 5.06% of Java online submissions for Jump Game.
    public boolean canJump(int[] nums) {
        int[] reachable = new int[nums.length];

        int firstHop = nums[0];
        for (int i = 0; i <= firstHop && i < nums.length; i++) {
            reachable[i] = 1;
        }

        for (int i = 1; i < nums.length; i++) {
            if (reachable[i] > 0) {
                int hops = nums[i];

                int j = 1;
                while ((i + j) < nums.length && j <= hops) {
                    reachable[i + j] = 1;
                    j++;
                }
            }
        }

        return reachable[nums.length - 1] > 0
                || nums.length == 1;
    }

    // second solution : 48 mins O(N)
    // Runtime: 1 ms, faster than 100.00% of Java online submissions for Jump Game.
    // Memory Usage: 42.5 MB, less than 62.50% of Java online submissions for Jump Game.
    public boolean canJumpSecond(int[] nums) {
        int furthest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i <= furthest) {
                furthest = Math.max(furthest, i + nums[i]);
            }

            if (furthest + 1 >= nums.length) {
                return true;
            }
        }
        return false;
    }

    // cleaner solution
    // Runtime: 1 ms, faster than 100.00% of Java online submissions for Jump Game.
    // Memory Usage: 42.8 MB, less than 60.88% of Java online submissions for Jump Game.
    public boolean canJumpClean(int[] nums) {
        int furthest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i <= furthest) {
                furthest = Math.max(furthest, i + nums[i]);
            }
        }
        return nums.length == 1 || furthest >= nums.length - 1;
    }
}
