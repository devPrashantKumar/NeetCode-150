package ArrayNHashing.N002_L242_Valid_Anagram;
import java.util.HashMap;

class SolutionCompareHashMapOptimizedTest {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hmap1 = new HashMap<>();

        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            hmap1.put(s.charAt(i),hmap1.getOrDefault(s.charAt(i), 0)+1);
            hmap1.put(t.charAt(i),hmap1.getOrDefault(t.charAt(i), 0)-1);
        }

        for(int frequency : hmap1.values()){
            if(frequency!=0) return false;
        }
        //hmap1.values().stream().allMatch(frequency -> frequency==0);
        return true;

    }
}
public class CompareHashMapOptimizedTest {
    public static void main(String[] args) {
        SolutionCompareHashMapOptimizedTest solution  = new SolutionCompareHashMapOptimizedTest();
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
