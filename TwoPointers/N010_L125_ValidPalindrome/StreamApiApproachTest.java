package TwoPointers.N010_L125_ValidPalindrome;

import java.util.Optional;

/*
 * Time Complexity - O(n)
 * Space Complexity - O(n) to store string reversal.
 */
class SolutionStreamApiApproachTest {
    public boolean isPalindrome(String s) {
        return Optional.of(s.toLowerCase().chars().filter(Character::isLetterOrDigit).collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)).map(sb->sb.toString().equals(sb.reverse().toString())).orElse(false);
    }
}

public class StreamApiApproachTest {
    public static void main(String[] args) {
        SolutionStreamApiApproachTest solution = new SolutionStreamApiApproachTest();
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";
        System.out.println("---------------------------------------------------");
        System.out.println("Input : s - " + s1);
        System.out.println("Output : " + solution.isPalindrome(s1));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : s - " + s2);
        System.out.println("Output : " + solution.isPalindrome(s2));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : s - " + s3);
        System.out.println("Output : " + solution.isPalindrome(s3));
        System.out.println("---------------------------------------------------");
    }
}


