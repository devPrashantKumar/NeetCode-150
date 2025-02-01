package ArrayNHashing.NeetCode_9_LeetCode_128;

import java.util.*;
/*
 * Time Complexity - O(n^2)
 * Space Complexity - O(n)
 */
class SolutionMyHashApproachTest {
    public int longestConsecutive(int[] nums) {
        int longestSequence = 0;
        HashMap<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(nums[i]))
                continue;
            int left = hmap.getOrDefault(nums[i] - 1, 0);
            int right = hmap.getOrDefault(nums[i] + 1, 0);
            int sequenceLength = left + right + 1;
            hmap.put(nums[i], sequenceLength);
            int leftElement = nums[i] - 1;
            while (hmap.containsKey(leftElement)) {
                hmap.put(leftElement, sequenceLength);
                leftElement--;
            }
            int rightElement = nums[i] + 1;
            while (hmap.containsKey(rightElement)) {
                hmap.put(rightElement, sequenceLength);
                rightElement++;
            }
            longestSequence = Math.max(longestSequence, sequenceLength);
        }
        return longestSequence;
    }
}

public class MyHashApproachTest {
    public static void main(String[] args) {
        SolutionMyHashApproachTest solution = new SolutionMyHashApproachTest();
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
