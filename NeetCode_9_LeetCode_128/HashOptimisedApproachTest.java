package NeetCode_9_LeetCode_128;

import java.util.*;
/*
 * Time Complexity - O(n^2)
 * Space Complexity - O(n)
 */
class SolutionHashOptimisedApproachTest {
    public int longestConsecutive(int[] nums) {
        int longestSequence = 0;
        HashSet<Integer> visited = new HashSet<>();
        HashSet<Integer> hSet= new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hSet.add(nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            int sequenceLength=1;
            if (visited.contains(nums[i]))
                continue;
            int leftElement = nums[i] - 1;
            while (hSet.contains(leftElement)) {
                sequenceLength++;
                visited.add(leftElement);
                leftElement--;
            }
            int rightElement = nums[i] + 1;
            while (hSet.contains(rightElement)) {
                sequenceLength++;
                visited.add(rightElement);
                rightElement++;
            }
            longestSequence = Math.max(longestSequence, sequenceLength);
        }
        return longestSequence;
    }
}

public class HashOptimisedApproachTest {
    public static void main(String[] args) {
        SolutionHashOptimisedApproachTest solution = new SolutionHashOptimisedApproachTest();
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

