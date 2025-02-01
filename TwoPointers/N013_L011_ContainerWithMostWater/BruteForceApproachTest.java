package TwoPointers.N013_L011_ContainerWithMostWater;
import java.util.Arrays;

/*
 * Time Complexity O(n^2)
 * Space Complexity O(1)
 */
class SolutionBruteForceApproachTest {
    public int maxArea(int[] heights) {
        int maximumArea=0;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                int area = Math.min(heights[i], heights[j])*(j-i);
                maximumArea = Math.max(area,maximumArea);
            }
        }
        return maximumArea;
    }
}

public class BruteForceApproachTest {
    public static void main(String[] args) {
        SolutionBruteForceApproachTest solution = new SolutionBruteForceApproachTest();
        int[] nums1 = { 1,7,2,5,4,7,3,6 };
        int[] nums2 = { 2,2,2 };
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums1));
        System.out.println("Output : " + solution.maxArea(nums1));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums2));
        System.out.println("Output : " + solution.maxArea(nums2));
        System.out.println("---------------------------------------------------");
    }
}

