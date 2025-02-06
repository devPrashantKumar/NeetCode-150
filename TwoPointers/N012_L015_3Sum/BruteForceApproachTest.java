package TwoPointers.N012_L015_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Time Complexity: O(n^3) - Three nested loops iterate through all possible
 * triplets.
 * Space Complexity: O(n) - Using a HashSet to store unique triplets.
 */
class SolutionBruteForceApproachTest {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> uniqueTriplet = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] + nums[i] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet); // Sorting ensures uniqueness
                        uniqueTriplet.add(triplet);
                    }
                }
            }
        }
        result.addAll(uniqueTriplet);
        return result;
    }
}

public class BruteForceApproachTest {
    public static void main(String[] args) {
        SolutionBruteForceApproachTest solution = new SolutionBruteForceApproachTest();
        int[] nums1 = { -1, 0, 1, 2, -1, -4 };
        int[] nums2 = { 0, 1, 1 };
        int[] nums3 = { 0, 0, 0 };

        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums1));
        System.out.println("Output : " + solution.threeSum(nums1).toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums2));
        System.out.println("Output : " + solution.threeSum(nums2).toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums3));
        System.out.println("Output : " + solution.threeSum(nums3).toString());
        System.out.println("---------------------------------------------------");
    }
}
