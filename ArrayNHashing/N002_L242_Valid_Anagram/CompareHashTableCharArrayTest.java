package ArrayNHashing.N002_L242_Valid_Anagram;

import java.util.Arrays;

class SolutionCompareHashTableCharArrayTest {
    public boolean isAnagram(String s, String t) {
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        int[] characterArray1 = new int[26];
        int[] characterArray2 = new int[26];

        for(char ch : charArray1){
            characterArray1[ch-'a']++;
        }
        for(char ch : charArray2){
            characterArray2[ch-'a']++;
        }

        return Arrays.equals(characterArray1, characterArray2);
    }
}

public class CompareHashTableCharArrayTest {
    public static void main(String[] args) {
        SolutionCompareHashTableCharArrayTest solution  = new SolutionCompareHashTableCharArrayTest();
        String s1 = "racecar";
        String t1 = "carrace";
        String s2 = "jar";
        String t2 = "jam";
        System.out.println("---------------------------------------------------");
        System.out.println("Input : s - "+s1+" , t - "+t1);
        System.out.println("Output : " + solution.isAnagram(s1,t1));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : s - "+s2+" , t - "+t2);
        System.out.println("Output : " + solution.isAnagram(s2, t2));
        System.out.println("---------------------------------------------------");
        
    }
}
