package N003_L001_Two_Sum;
import java.util.*;

class SolutionHashMapTest {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            } 
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}

public class HashMapTest {
    public static void main(String[] args) {
        SolutionHashMapTest solution = new SolutionHashMapTest();
        int[] nums1 = { 3,4,5,6 };
        int target1 = 7;
        int target2 = 10;
        int[] nums2 = { 4,5,6 };
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums1) +" , "+ target1);
        System.out.println("Output : " +Arrays.toString(solution.twoSum(nums1,target1)));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums2) +" , "+ target2);
        System.out.println("Output : " + Arrays.toString(solution.twoSum(nums2,target2)));
        System.out.println("---------------------------------------------------");
    }
}
