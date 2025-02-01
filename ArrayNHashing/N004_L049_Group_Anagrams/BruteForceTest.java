package ArrayNHashing.N004_L049_Group_Anagrams;

import java.util.*;

class SolutionBruteForceTest {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] visited = new int[strs.length];
        List<List<String>> result = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if (visited[i] == 1)
                continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = 1;
            char[] charArray1 = strs[i].toCharArray();
            Arrays.sort(charArray1);
            l2: for (int j = i + 1; j < strs.length; j++) {
                if (visited[j] == 1)
                    continue;

                char[] charArray2 = strs[j].toCharArray();
                Arrays.sort(charArray2);
                if (charArray1.length != charArray2.length) {
                    continue;
                }
                int k = 0;
                for (; k < charArray1.length; k++) {
                    if (charArray1[k] != charArray2[k]) {
                        continue l2;
                        // break;
                    }
                }
                if (k == charArray1.length) {
                    visited[j] = 1;
                    group.add(strs[j]);
                }
            }
            result.add(group);
        }
        return result;
    }
}

public class BruteForceTest {
    public static void main(String[] args) {
        SolutionBruteForceTest solution = new SolutionBruteForceTest();
        String[] input1 = { "eat","tea","tan","ate","nat","bat" };
        String[] input2 = { "" };
        String[] input3 = { "a" };

        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(input1));
        System.out.println("Output : " +solution.groupAnagrams(input1).toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(input2));
        System.out.println("Output : " +solution.groupAnagrams(input2).toString());
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + Arrays.toString(input3));
        System.out.println("Output : " +solution.groupAnagrams(input3).toString());
    }
}