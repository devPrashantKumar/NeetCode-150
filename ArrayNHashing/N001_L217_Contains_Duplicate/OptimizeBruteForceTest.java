package ArrayNHashing.N001_L217_Contains_Duplicate;

import java.util.Arrays;

/*
Time Complexity : O(n^2)
Space Complexity : O(1)
 */
class SolutionOptimizeBruteForceTest {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    return true;
            }
        }
        return false;
    }
}

public class OptimizeBruteForceTest {

    public static void main(String[] args) {
        SolutionOptimizeBruteForceTest solution = new SolutionOptimizeBruteForceTest();
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
