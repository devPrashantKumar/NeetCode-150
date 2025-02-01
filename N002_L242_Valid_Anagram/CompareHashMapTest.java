package N002_L242_Valid_Anagram;
import java.util.HashMap;

class SolutionCompareHashMapTest {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hmap1 = new HashMap<>();
        HashMap<Character,Integer> hmap2 = new HashMap<>();
        for(char c : s.toCharArray()){
            hmap1.put(c,hmap1.getOrDefault(c, 0)+1);
        }
        for(char c : t.toCharArray()){
            hmap2.put(c,hmap2.getOrDefault(c, 0)+1);
        }
        return hmap1.equals(hmap2);

    }
}
public class CompareHashMapTest {
    public static void main(String[] args) {
        SolutionCompareHashMapTest solution  = new SolutionCompareHashMapTest();
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
