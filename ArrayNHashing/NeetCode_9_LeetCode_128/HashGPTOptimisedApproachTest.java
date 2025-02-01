package ArrayNHashing.NeetCode_9_LeetCode_128;

import java.util.*;
/*
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 */
class SolutionHashGPTOptimisedApproachTest {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        HashSet<Integer> hSet = new HashSet<>();
        for (int num : nums) {
            hSet.add(num);
        }
        int longestSequence = 0;
        for (int num : hSet) {
            if (!hSet.contains(num - 1)) { 
                int currentNum = num;
                int sequenceLength = 1;
                while (hSet.contains(currentNum + 1)) {
                    currentNum++;
                    sequenceLength++;
                }
                longestSequence = Math.max(longestSequence, sequenceLength);
            }
        }
        return longestSequence;
    }
}

public class HashGPTOptimisedApproachTest {
    public static void main(String[] args) {
        SolutionHashGPTOptimisedApproachTest solution = new SolutionHashGPTOptimisedApproachTest();
        int[] nums1 = { 2, 20, 4, 10, 3, 4, 5 };
        int[] nums2 = { 0, 3, 2, 5, 4, 6, 1, 1 };
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums1));
        System.out.println("Output : " + solution.longestConsecutive(nums1));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums2));
        System.out.println("Output : " + solution.longestConsecutive(nums2));
        System.out.println("---------------------------------------------------");
    }

}

