package TwoPointers.N013_L011_ContainerWithMostWater;
import java.util.Arrays;

/*
 * Time Complexity O(n)
 * Space Complexity O(1)
 */
class SolutionTwoPointerApproachTest {
    public int maxArea(int[] heights) {
        int maximumArea=0;
        int left = 0;
        int right  = heights.length-1;
        while(left<right){
            int area = Math.min(heights[left], heights[right])*(right-left);
            if(heights[left]<heights[right]) left++;
            else right--;
            maximumArea = Math.max(area,maximumArea);
        }
        return maximumArea;
    }
}

public class TwoPointerApproachTest {
    public static void main(String[] args) {
        SolutionTwoPointerApproachTest solution = new SolutionTwoPointerApproachTest();
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

