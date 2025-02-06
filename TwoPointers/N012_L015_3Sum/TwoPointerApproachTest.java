package TwoPointers.N012_L015_3Sum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Time Complexity O(n^2)
 * Space Complexity O(1)
 */
class SolutionTwoPointerApproachTest {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]>0) continue;
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                if(nums[left]+nums[right]>(-nums[i])){
                    right--;
                }
                else if(nums[left]+nums[right]<(-nums[i])){
                    left++;
                }
                else{
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    
                }
            }
        }
        return result;
    }
}

public class TwoPointerApproachTest {
    public static void main(String[] args) {
        SolutionTwoPointerApproachTest solution = new SolutionTwoPointerApproachTest();
        int[] nums1 = { -1, 0, 1, 2, -1, -4 };
        int[] nums2 = { 0, 1, 1 };
        int[] nums3 = { 0, 0, 0 };

        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums1));
        System.out.println("Output : " + solution.threeSum(nums1).toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums2));
        System.out.println("Output : " + solution.threeSum(nums2).toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums3));
        System.out.println("Output : " + solution.threeSum(nums3).toString());
        System.out.println("---------------------------------------------------");
    }
}
