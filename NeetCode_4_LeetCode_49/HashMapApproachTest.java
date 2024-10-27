package NeetCode_4_LeetCode_49;
import java.util.*;

class SolutionHashMapApproachTest {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> hmap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            List<String> group =  hmap.getOrDefault(sortedString, new ArrayList<>());
            group.add(strs[i]);
            hmap.put(sortedString, group);
        }
        for (List<String> group:hmap.values()) {
            result.add(group);
        }
        return result;
    }
}

public class HashMapApproachTest {
    public static void main(String[] args) {
        SolutionHashMapApproachTest solution = new SolutionHashMapApproachTest();
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
