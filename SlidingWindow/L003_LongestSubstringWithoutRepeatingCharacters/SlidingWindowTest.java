package SlidingWindow.L003_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

class SolutionSlidingWindow {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int maxWindow=0;
        for(int right=0;right<s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxWindow = Math.max(set.size(),maxWindow);
        }
        return maxWindow;
    }
}


public class SlidingWindowTest {
    public static void main(String[] args) {
        SolutionSlidingWindow solution = new SolutionSlidingWindow();
        String s1 = "zxyzxyz";
        String s2 = "xxxx";

        System.out.println("---------------------------------------------------");
        System.out.println("Input1 : " + s1);
        System.out.println("Output : " + solution.lengthOfLongestSubstring(s1));
        System.out.println("---------------------------------------------------");
        System.out.println("Input2 : " + s2);
        System.out.println("Output : " + solution.lengthOfLongestSubstring(s2));
        System.out.println("---------------------------------------------------");
    }
}
