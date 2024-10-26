package NeetCode_7_LeetCode_238;

import java.util.Arrays;


/*
 * Time Complexity O(n)
 * Space Compexity O(n)
 */
class SolutionPrefixSuffixApprochTest {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefixArray = new int[n];
        int[] suffixArray = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                prefixArray[0] = 1;
                suffixArray[n - 1] = 1;
            } else {
                prefixArray[i] = prefixArray[i - 1] * nums[i - 1];
                suffixArray[n - 1 - i] = suffixArray[n - 1 - i + 1] * nums[n - 1 - i + 1];
            }
        }

        for (int i = 0; i < n; i++) {
            nums[i] = prefixArray[i] * suffixArray[i];
        }

        return nums;
    }

}

public class PrefixSuffixApprochTest {
    public static void main(String[] args) {
        SolutionPrefixSuffixApprochTest solution = new SolutionPrefixSuffixApprochTest();
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
