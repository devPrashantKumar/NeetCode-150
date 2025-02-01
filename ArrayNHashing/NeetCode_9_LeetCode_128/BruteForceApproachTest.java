package ArrayNHashing.NeetCode_9_LeetCode_128;

import java.util.*;
/*
 * Time Complexity - O(n^3)
 * Space Complexity - O(1)
 */
class SolutionBruteForceApproachTest {
    public int longestConsecutive(int[] nums) {
        int longestSequence = 0;
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            int sequence=1;
            for(int j=1;j<nums.length;j++){
                int elementNeedToFind = element+j;
                boolean isElementFound=false;
                for(int k=0;k<nums.length;k++){
                    if(nums[k]==elementNeedToFind){
                        sequence++;
                        isElementFound=true;
                        break;
                    }
                }
                if(!isElementFound) break;
            }
            longestSequence = Math.max(longestSequence, sequence);
        }
        return longestSequence;
    }
}

public class BruteForceApproachTest {
    public static void main(String[] args) {
        SolutionBruteForceApproachTest solution = new SolutionBruteForceApproachTest();
        int[] nums1 = { 2, 20, 4, 10, 3, 4, 5 };
        int[] nums2 = { 0, 3, 2, 5, 4, 6, 1, 1 };
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums1));
        System.out.println("Output : " + solution.longestConsecutive(nums1));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums2));
        System.out.println("Output : " + solution.longestConsecutive(nums2));
        System.out.println("---------------------------------------------------");
    }

}
