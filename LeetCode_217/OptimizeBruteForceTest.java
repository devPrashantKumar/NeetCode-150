package LeetCode_217;

import java.util.Arrays;

class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) return true;
            }
        }
        return false;
    }
}


public class OptimizeBruteForceTest{
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,2,3,4,1,2,6,7,3,4};
        int[] nums2 = {1,2,7,3,5};
        System.out.println("---------------------------------------------------");
        System.out.println("Input : "+Arrays.toString(nums1));
        System.out.println("Output : "+solution.hasDuplicate(nums1));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : "+Arrays.toString(nums2));
        System.out.println("Output : "+solution.hasDuplicate(nums2));
        System.out.println("---------------------------------------------------");
    }
}
