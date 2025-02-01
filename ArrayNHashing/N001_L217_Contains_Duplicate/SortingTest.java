package ArrayNHashing.N001_L217_Contains_Duplicate;

import java.util.Arrays;
/*
 * Time Complexity : O(nlogn) 
 * time complexity of sorting of an array is O(nlogn)
 * Space Complexity : O(1) 
 * in place sorting
 */

class SolutionSortingTest {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
}

public class SortingTest {
    public static void main(String[] args) {
        SolutionSortingTest solution = new SolutionSortingTest();
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
