package LeetCode_242;

import java.util.Arrays;

class SolutionsortedCharArrayTest {
    public boolean isAnagram(String s, String t) {
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        if(charArray1.length!=charArray2.length) return false;
        for(int i=0;i<charArray1.length;i++){
            if(charArray1[i]!=charArray2[i]) return false;
        }
        return true;
    }
}

public class sortedCharArrayTest {
    public static void main(String[] args) {
        SolutionsortedCharArrayTest solution  = new SolutionsortedCharArrayTest();
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
