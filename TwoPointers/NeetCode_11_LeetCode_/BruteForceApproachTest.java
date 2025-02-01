package TwoPointers.NeetCode_11_LeetCode_;
import java.util.Arrays;

/*
 * Time Complexity O(n^2)
 * Space Complexity O(1)
 */
class SolutionBruteForceApproachTest {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[j]+numbers[i]==target) return new int[]{i+1,j+1};
            }
        }
        return new int[]{};
    }
}

public class BruteForceApproachTest {
    public static void main(String[] args) {
        SolutionBruteForceApproachTest solution = new SolutionBruteForceApproachTest();
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

