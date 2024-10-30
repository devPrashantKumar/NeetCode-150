package NeetCode_11_LeetCode_;
import java.util.Arrays;

/*
 * Time Complexity O(n)
 * Space Complexity O(1)
 */
class SolutionTwoPonterApproachTest {
    public int[] twoSum(int[] numbers, int target) {
        int startIndex=0;
        int endIndex=numbers.length-1;
        while(startIndex<endIndex){
            int sum = numbers[startIndex]+numbers[endIndex];
            if(sum==target) return new int[]{startIndex+1,endIndex+1};
            else if(sum<target) startIndex++;
            else endIndex--;
        }
        return new int[]{};
    }
}

public class TwoPonterApproachTest {
    public static void main(String[] args) {
        SolutionTwoPonterApproachTest solution = new SolutionTwoPonterApproachTest();
        int[] nums1 = { 1,2,3,4 };
        int target1 = 7;
        int[] nums2 = { 1,1,2,3,4 };
        int target2 = 15;
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums1));
        System.out.println("Output : " + Arrays.toString(solution.twoSum(nums1,target1)));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums2));
        System.out.println("Output : " + Arrays.toString(solution.twoSum(nums2,target2)));
        System.out.println("---------------------------------------------------");

    }
}
