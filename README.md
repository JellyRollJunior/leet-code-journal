# LeetCodeJournal
 - Produce brute force solution (without IDE!)
 - Optimize solution
 - If solution not optimal, search discussions optimal solution
 - Understand the optimal solution 
 - Questions where I had to look at the answer to get a good time complexity marked *

## Things I've Learned
 - Don't use data structures unnecessarily
   - try not to use prebuilts (ex: arraylist) unless necessary
 - Don't over engineer code (is there a simpler approach? Do I really need to use this algorithm? etc.)
 - When in doubt, write it out
 - Follow your instinct when deciding an approach to take
 - Completing by proof: Write out the formula for an optimal intermediate step and ask yourself in what situation would you increment values. 
 - Make use of work already done for you (ex: presorted array)
 - Sample process
   - decide on an approach
   - do some work on paper (ex: work out cases, work out optimal formulas, etc.)
   - write pseudo code 
   - code
 - Try to eliminate intermediate variables for clarity
 - If you feel mental strain start to set in, just take a break and reset mental
 - Only run code if you think it's correct. Don't run code to check correctness! This promotes lazy coding. They won't let you submit the answer over and over again to check correctness in a job interview lol. 

## Reflections - easy
 - #1 TwoSum: Simplify code! Always be trying to code less. In this case, I should have figured out a way to combine my two loops into one. 
 - #104 Maximum Depth of Binary Tree: I need to practice writing recursive functions specifically work on choosing the most efficient base case. 
 - #121 Best Time to Buy and Sell Stocks: Don't use data structures unnecessarily and Don't over engineer code.
 - #217 Contains Duplicate: An easy question to solve using HashSet. 
 - #253 Maximum Subarray*: Decide on an approach (follow instinct) and work out cases. I had the right idea but thought I could work everything out in my head. When in doubt, put pen to paper. 
 - #191 Number of one bits: an easy question but smart use of bit operators can save a lot of time compared to "dumb" use of bit operators like I did like makeing use of bit mask to save if statements when checking if odd or not! so smart!
 - #338 Counting Bits*: I got the N Log N solution and mistakenly rested on my laurels. Don't get cocky!!! Always try to reuse previous work done if applicable. 
 - #268 Missing Number: I've done this before 8)
 - #190 Reverse Bits*: Taught me how to properly use bitmasks and bit shifting operations!
 - #70 Climbing Stairs: 8)
 - #206 Reverse Linked List*: I still have trouble saving space. I can usually write an optimal time algorithm but not a optimal space one. I need to work on keeping track of pointers because sometimes I get lost in the pointer shuffle. Try to write everything down to make things more clear. 
 - #141 Linked List Cycle*: Don't underestimate linked lists. They're trickier than you think! A lot of these can be solved using two pointers so try to figure out a way to do it like that haha. 

## Reflections - medium 
 - #238 Product of Array Except Self: I'm very proud to have figured this out by myself! Need to keep in mind when it's necessary to save intermediate values and when they can just be discarded (in order to save space)
 - #152 Maximum Product Subarray: This question drove home the importance of constructing algorithms mathematically. I thought up an algorithm and coded it. What I should have done was decide on an approach, carefully plan out all the cases, then code. 
 - #11 Container with Most Water: You don't always have to go through the inputs in a linear fashion. Start with the largest potential value and work from there!
 - #153 Find Minimum In Rotated Sorted Array: I'm starting to see the patterns in these question! Just need to learn to work faster.
 - #33 Search In Rotated Sorted Array*: This question is so much harder than the previous one. Don't just mindlessly map out cases. Try to notice patterns, make use of work already done for you (in this case sorted areas) to eliminate ranges of input (which is easily done with sorting already done for you).
 - #13 Three Sum*: Remember two pointer traversals and again, always try to use sorted arrays in your favor. 
 - #371 Sum of Two Integers*: Explanation of bitwise operators + solution in reflection. The only way I would have figured this out is by writing out examples using a ^ b, a & b, etc. and noticing the pattern. I'm not sure how I would have solved this without prior knowledge of this but at least now I have that prior knowledge. 
   - [helpful bitwise operator cheat sheet](https://leetcode.com/problems/sum-of-two-integers/discuss/84278/A-summary%3A-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently)
 - #322 Coin Change: While my problem solving was sound, I need to work on concision and clarity. Eliminate Intermediate variables whenever possible. 
 - #300 Longest Increasing Subsequence*: Figured out O(N^2) quickly, O(NLogN) took me 3 hours. I understand it but I don't know how I would figure this out myself to be honest. Run through EXAMPLE TEST CASES to understand a solution quicker (although at this point you already gave up on figuring it out yourself lol). REMEMBER TO TAKE BREAKS TO RESET MENTAL. MENTAL DRAIN STOLE LIKE TWO HOURS OF MY LIFE.
 - #198 House Robber*: Not a particularly hard question (my fastest medium at 20mins for O(N) solution) but I could have done better with space complexity and reducing redundant code. 
 - #62 Unique Paths: Implement the inefficient space solution first, then work on saving space. 
 - #55 Jump Game: I implemented the O(N) O(1) solution myself this time (48 mins)! I'm improving! Although I realized my approach to doing questions promotes lazy coding so I'll work on changing that (explained above).
 - #1143 Longest Common Subsequence: Again, notice mental boom. Prove your steps are correct. Don't just write a line of code and pray it works. PROVE IT PROVE IT PROVE IT PROVE IT PROVE IT. 
 - #3 Longest Substring Without Repeating Characters: Actually a pretty easy question for a medium. However, I didnt do this question properly. I fell back to my old ways of not proving and just running til I see a success message. Don't do this!!! 

## Random Musings
 - 03/20/2022: BEEN A WHILE. I come back from a break after finding a job and do one of the hardest I've seen so far #1143. I get anniihilated even though I watched a video on how the algorithm works. Good to know that taking a break probably wasn't a good idea. I'm getting back into the swing of things again. When I look back at the change history, I actually only stopped for 22 days. Why is this so hard got damn. 






# ----- something from reddit -- I'll organize this later --- 

Once you've given a honest attempt to solve a problem, I agree that you should use all the materials you need to deeply understand the problem. But you DO need to spend some time struggling on your own to practice the PROCESS OF PROBLEM SOLVING.
To deeply understand a tricky problem (solution/discussion/youtube/etc) you are already spending 1 to 2 hours. Spending 20-30 minutes extra to try to come up with a solution on your own is not that much more extra time, so just do it. Also, you definitely aren't going to be cranking out 300 problems in 3 weeks either (even if you just look at the solutions....).
Here is how I go about leetcode prep. Take this advice with a grain of salt, I am preparing for interviews right now, but not I am an employed SWE yet.
- Pick any book / resource / whatever you like to guide you and feed you problems (structy, algoexpert, Blind 75, Grokking, CTCI, EPI, etc -- they all basically teach you the same problems/patterns with slight variations).
- When solving a problem I do this in a basic code editor (steps 1-4 and 6 in a multi line comment on top of the file):
Copy/paste the problem definition. Read it out loud and understand what they want.
Look at the examples they give you for what the algorithm should do. "Solution(input) -> output". Come up with 1 or 2 examples on your own, and write them down.
Think out loud, and write down (!!) the possible high-level approaches to solving the problem. Eg: "this two-sum problem can be brute-forced in O(n^2) time using two for-loops, or it can be solved in O(n) using a hashmap." This doesn't have to be detailed, just a possible approach. Think about possible edge cases and how they could break the solution.
Here, if you are completely blanking after 5 minutes, and can't even do a brute-force solution, then do what the OP said - abort mission, and spend the next hour understanding the problem by looking at the solution. Once you understood the solution go to step 4.
Pick one of the approaches, and write out the pseudo code for it, while taking out loud as to what your thought process is.
CODE THE ACTUAL SOLUTION. If you actually followed steps 1-4, this part is going to be trivial. You will bang out the actual code often in under 5 minutes. Paste the code into leetcode (or whatever platform you are using) to ensure it works. You can even write your own test cases, and run locally.
If you haven't addressed this in step 3 (when you were talking about approaches), think about how you would optimize the solution. Talk about big O here.
Basically, doing it this way, I train myself to do 2 things: first, to understand and potentially break down a complicated problem without panicking, and second, to communicate my thought process out loud. The hope here is that even if I can't solve the problem, clearly communicating my thought process will make it easy for the interviewer to give me tips, and maybe score me bonus points on the "communicates well" axis.
Anyway, that's how I am doing it. It's slow. I realistically, do 2-3 problems a day only, and maybe only 1 problem when I am busy, but that's how I roll.
I am a relative newbie trying to break into the field, so maybe this advice is shit. I'll update my thinking in 3 months >_> Based on whether it has worked for me or not.
