package ArrayNHashing.NeetCode_7_LeetCode_238;

import java.util.Arrays;

/*
 * Time Complexity O(n)
 * Space Compexity O(1)
 */
class SolutionPrefixSuffixSpaceOptimizedApprochTest {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // storing prefix sum in result array;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                result[i] = 1;
            } else {
                result[i] = result[i - 1] * nums[i - 1];
            }
        }

        int suffixProd = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                suffixProd = 1;
            } else {
                suffixProd = suffixProd * nums[i + 1];
                result[i] *= suffixProd;
            }
        }

        return result;
    }

}

public class PrefixSuffixSpaceOptimizedApprochTest {
    public static void main(String[] args) {
        SolutionPrefixSuffixSpaceOptimizedApprochTest solution = new SolutionPrefixSuffixSpaceOptimizedApprochTest();
        int[] nums1 = { 1, 2, 4, 6 };
        int[] nums2 = { -1, 0, 1, 2, 3 };
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums1));
        System.out.println("Output : " + Arrays.toString(solution.productExceptSelf(nums1)));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums2));
        System.out.println("Output : " + Arrays.toString(solution.productExceptSelf(nums2)));
        System.out.println("---------------------------------------------------");
    }
}
