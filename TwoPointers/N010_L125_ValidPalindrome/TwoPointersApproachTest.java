package TwoPointers.N010_L125_ValidPalindrome;
/*
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
class SolutionTwoPointersApproachTest {
    public boolean isPalindrome(String s) {
        int start=0;
        int end = s.length()-1;
        while(start<end){
            if(!isAlphaNumeric(s.charAt(start))) start++;
            else if(!isAlphaNumeric(s.charAt(end))) end--;
            else if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(end))) return false;
            else {
                start++;
                end--;
            }
        }
        return true;
    }

    public boolean isAlphaNumeric(char c){
        return ((c-'a'>=0 && c-'z'<=0) || (c-'A'>=0 && c-'Z'<=0) || (c-'0'>=0 && c-'9'<=0));
    }
}


public class TwoPointersApproachTest {
    public static void main(String[] args) {
        SolutionTwoPointersApproachTest solution = new SolutionTwoPointersApproachTest();
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
