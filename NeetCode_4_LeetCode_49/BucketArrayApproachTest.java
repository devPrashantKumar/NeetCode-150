package NeetCode_4_LeetCode_49;
import java.util.*;

class SolutionBucketArrayApproachTest {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        int[][] bucketArrayList = new int[strs.length][];
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            int[] bucketArray = new int[26];
            for(char ch : charArray){
                bucketArray[ch-'a']++;
            }
            bucketArrayList[i]=bucketArray;
        }
        for (int i=0;i<strs.length;i++) {
            if(visited[i]) continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(Arrays.equals(bucketArrayList[i], bucketArrayList[j])){
                    visited[j]=true;
                    group.add(strs[j]);
                }
            }
            result.add(group);
        }
        return result;
    }
}

public class BucketArrayApproachTest {
    public static void main(String[] args) {
        SolutionBucketArrayApproachTest solution = new SolutionBucketArrayApproachTest();
        String[] input1 = { "eat", "tea", "tan", "ate", "nat", "bat" };
        String[] input2 = { "" };
        String[] input3 = { "a" };

        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(input1));
        System.out.println("Output : " + solution.groupAnagrams(input1).toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(input2));
        System.out.println("Output : " + solution.groupAnagrams(input2).toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(input3));
        System.out.println("Output : " + solution.groupAnagrams(input3).toString());
    }
}
