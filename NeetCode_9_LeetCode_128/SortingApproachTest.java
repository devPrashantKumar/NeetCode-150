package NeetCode_9_LeetCode_128;

import java.util.*;

/*
 * Time Complexity - O(n logn+n) -> O(n logn)
 * Space Complexity - O(1)
 */
class SolutionSortingApproachTest {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longestSequence = 0;
        for (int i = 0; i < nums.length;) {
            int sequence = 1;
            for (i = i + 1; i < nums.length; i++) {
                if(nums[i]==nums[i-1]) continue;
                if (nums[i - 1] + 1 != nums[i]) {
                    break;
                }
                sequence++;
            }
            longestSequence = Math.max(longestSequence, sequence);
        }
        return longestSequence;
    }
}

public class SortingApproachTest {
    public static void main(String[] args) {
        SolutionSortingApproachTest solution = new SolutionSortingApproachTest();
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
