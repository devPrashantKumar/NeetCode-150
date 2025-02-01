package ArrayNHashing.NeetCode_5_LeetCode_347;

import java.util.*;

class SolutionBruteForceTest {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Map.Entry<Integer,Integer>> mapEntries = new ArrayList<>(hmap.entrySet());
        mapEntries.sort((e1,e2) -> (-1*(e1.getValue().compareTo(e2.getValue()))));
        int elementum=0;
        for(int i=0;i<mapEntries.size();i++){
            if(i==0 || (mapEntries.get(i-1).getValue()!=mapEntries.get(i).getValue())){
                elementum++;
                if(elementum>k){
                    break;
                }
            }
            result.add(mapEntries.get(i).getKey());
            
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class BruteForceTest {
    public static void main(String[] args) {
        SolutionBruteForceTest solution = new SolutionBruteForceTest();
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
