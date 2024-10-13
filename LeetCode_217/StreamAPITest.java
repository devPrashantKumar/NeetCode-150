package LeetCode_217;

import java.util.Arrays;

/*
Time Complexity : O(n) - distinct will take O(n) time
Space Complexity : O(n) - stream will occupy O(n) space
 */

class SolutionStreamAPITest {
    public boolean hasDuplicate(int[] nums) {
        long uniqueElement = Arrays.stream(nums).distinct().count();
        return nums.length!=uniqueElement;
    }
}


public class StreamAPITest {
    public static void main(String[] args) {
        SolutionStreamAPITest solution = new SolutionStreamAPITest();
        int[] nums1 = { 1, 2, 3, 4, 1, 2, 6, 7, 3, 4 };
        int[] nums2 = { 1, 2, 7, 3, 5 };
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums1));
        System.out.println("Output : " + solution.hasDuplicate(nums1));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums2));
        System.out.println("Output : " + solution.hasDuplicate(nums2));
        System.out.println("---------------------------------------------------");
    }
}
