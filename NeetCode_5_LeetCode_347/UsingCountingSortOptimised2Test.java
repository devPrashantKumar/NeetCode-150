package NeetCode_5_LeetCode_347;

import java.util.*;

// when elements with same frequency considered as unique and considered in counting
class SolutionUsingCountingSortOptimised2Test {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
        }
        @SuppressWarnings("unchecked")
        List<Integer>[] bucketArray = new List[nums.length+1];
        for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
            if(bucketArray[entry.getValue()]==null){
                bucketArray[entry.getValue()]=new ArrayList<>();
            }
            bucketArray[entry.getValue()].add(entry.getKey());
        }
        int maxElement=0;
        l2 : for(int i=nums.length;i>0;i--){
            if(bucketArray[i]!=null){
                for(int num : bucketArray[i]){
                    result.add(num);
                    maxElement++;
                    if(maxElement>=k) break l2;
                }
            } 
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class UsingCountingSortOptimised2Test {
    public static void main(String[] args) {
        SolutionUsingCountingSortOptimised2Test solution = new SolutionUsingCountingSortOptimised2Test();
        int[] nums1 = { 1, 2, 2, 3, 3, 3 };
        int k1 = 2;
        int[] nums2 = { 7, 7 };
        int k2 = 1;
        int[] nums3 = { 7, 7,7,2,5,4,4,2,2,1 };
        int k3 = 2;
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums1) + ", " + k1);
        System.out.println("Output : " + Arrays.toString(solution.topKFrequent(nums1, k1)));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums2) + ", " + k2);
        System.out.println("Output : " + Arrays.toString(solution.topKFrequent(nums2, k2)));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(nums3) + ", " + k3);
        System.out.println("Output : " + Arrays.toString(solution.topKFrequent(nums3, k3)));
        System.out.println("---------------------------------------------------");
    }
}
