package ArrayNHashing.N004_L049_Group_Anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionBruteForceOptimizedTest {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        String[] sortedStrings = new String[strs.length];
        boolean[] visited = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            sortedStrings[i] = new String(charArray);
        }
        for (int i = 0; i < strs.length; i++) {
            if (visited[i])
                continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;
            for (int j = i + 1; j < strs.length; j++) {
                if (sortedStrings[i].equals(sortedStrings[j])) {
                    group.add(strs[j]);
                      visited[j] = true;
                }
            }
            result.add(group);
        }
        return result;
    }
}

public class BruteForceOptimizedTest {
    public static void main(String[] args) {
        SolutionBruteForceOptimizedTest solution = new SolutionBruteForceOptimizedTest();
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
