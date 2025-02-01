package ArrayNHashing.N001_L217_Contains_Duplicate;

import java.util.Arrays;
import java.util.HashMap;

/*
Time Complexity : O(n)
Space Complexity : O(n)
 */
class SolutionHashMapTest {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hmap.containsKey(nums[i])) {
                return true;
            }
            hmap.put(nums[i],1);
        }
        return false;
    }
}

public class HashMapTest {
    public static void main(String[] args) {
        SolutionHashMapTest solution = new SolutionHashMapTest();
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
