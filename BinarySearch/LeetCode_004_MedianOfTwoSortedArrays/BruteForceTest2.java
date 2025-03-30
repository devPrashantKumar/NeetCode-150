package BinarySearch.LeetCode_004_MedianOfTwoSortedArrays;

import java.util.Arrays;

class SolutionBruteForceTest2 {
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int nums1_length = nums1.length;
            int nums2_length = nums2.length;
            int nums1_curr = 0;
            int nums2_curr = 0;
            double median_nums = 0;
    
            int i=0,j=0;
            int current = -1;
            while(i<nums1_length || j<nums2_length){
                nums1_curr = (i<nums1_length) ? nums1[i] : Integer.MAX_VALUE;
                nums2_curr = (j<nums2_length) ? nums2[j] : Integer.MAX_VALUE;
                current++;
                if(nums1_curr<nums2_curr){
                    i++;
                }
                else{
                    j++;
                }
    
                if(current == (nums1_length+nums2_length-1)/2){
                    median_nums = (nums1_curr<nums2_curr) ? nums1_curr : nums2_curr;
                    break;
                }
            }
            if((nums1_length+nums2_length)%2 == 0){
                nums1_curr = (i<nums1_length) ? nums1[i] : Integer.MAX_VALUE;
                nums2_curr = (j<nums2_length) ? nums2[j] : Integer.MAX_VALUE;
                double median_nums2 = (nums1_curr<nums2_curr) ? nums1_curr : nums2_curr;
                return (median_nums+median_nums2)/2;
            }
            return median_nums;
            
        }
    }
}

public class BruteForceTest2 {
    public static void main(String[] args) {
        SolutionBruteForceTest solution = new SolutionBruteForceTest();
        int[] nums11 = { 1, 3 };
        int[] nums12 = { 2 };

        int[] nums21 = { 1, 3 };
        int[] nums22 = { 2, 4 };

        System.out.println("---------------------------------------------------");
        System.out.println("Input11 : " + Arrays.toString(nums11));
        System.out.println("Input12 : " + Arrays.toString(nums12));
        System.out.println("Output : " + solution.findMedianSortedArrays(nums11,nums12));
        System.out.println("---------------------------------------------------");
        System.out.println("Input21 : " + Arrays.toString(nums21));
        System.out.println("Input22 : " + Arrays.toString(nums22));

        System.out.println("Output : " + solution.findMedianSortedArrays(nums21, nums22));
        System.out.println("---------------------------------------------------");
    }

}
