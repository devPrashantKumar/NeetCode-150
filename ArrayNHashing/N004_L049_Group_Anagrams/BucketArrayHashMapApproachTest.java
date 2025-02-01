package ArrayNHashing.N004_L049_Group_Anagrams;
import java.util.*;

class SolutionBucketArrayHashMapApproachTest {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> hmap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            int[] bucketArray = new int[26];
            for(char ch : charArray){
                bucketArray[ch-'a']++;
            }
            // solution will fail here
            StringBuilder sb = new StringBuilder();
            for (int num : bucketArray) {
                // this solution will work only if frequency of every element is in single digit;
                // sb.append(num);
                // so we have added underscore after num
                sb.append(num+"_"); 
            }
            String key = sb.toString();
            List<String> group = hmap.getOrDefault(key,new ArrayList<>());
            group.add(strs[i]);
            hmap.put(key,group);
        }

        for (List<String> group:hmap.values()) {
            result.add(group);
        }
        return result;
    }
}

public class BucketArrayHashMapApproachTest {
    public static void main(String[] args) {
        SolutionBucketArrayHashMapApproachTest solution = new SolutionBucketArrayHashMapApproachTest();
        String[] input1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
        String[] input2 = { "" };
        String[] input3 = { "a" };
        String[] input4 = { "bdddddddddd","bbbbbbbbbbc"};

        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(input1));
        System.out.println("Output : " + solution.groupAnagrams(input1).toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(input2));
        System.out.println("Output : " + solution.groupAnagrams(input2).toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(input3));
        System.out.println("Output : " + solution.groupAnagrams(input3).toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(input4));
        System.out.println("Output : " + solution.groupAnagrams(input4).toString());
    }
}
