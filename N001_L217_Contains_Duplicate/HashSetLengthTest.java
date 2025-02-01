package N001_L217_Contains_Duplicate;

import java.util.Arrays;
import java.util.HashSet;

/*
Time Complexity : O(n)
Space Complexity : O(n)
 */

class SolutionHashSetLengthTest {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hset = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            hset.add(nums[i]);
        }
        if(hset.size()<nums.length) return true;
        return false;
    }
}

public class HashSetLengthTest {
    public static void main(String[] args) {
        SolutionHashSetLengthTest solution = new SolutionHashSetLengthTest();
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
