package TwoPointers.N010_L125_Valid_Palindrome;
/*
 * Time Complexity - O(n)
 * Space Complexity - O(n) to store string reversal.
 */
class SolutionStringBuilderReversalApproachTest {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(isAlphaNumeric(s.charAt(i))) sb.append(s.charAt(i));
        }
        return sb.toString().equalsIgnoreCase(sb.reverse().toString());
    }

    public boolean isAlphaNumeric(char c){
        return ((c-'a'>=0 && c-'z'<=0) || (c-'A'>=0 && c-'Z'<=0) || (c-'0'>=0 && c-'9'<=0));
    }
}


public class StringBuilderReversalApproachTest {
    public static void main(String[] args) {
        SolutionStringBuilderReversalApproachTest solution = new SolutionStringBuilderReversalApproachTest();
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

