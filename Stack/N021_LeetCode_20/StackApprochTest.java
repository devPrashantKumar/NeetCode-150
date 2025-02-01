package Stack.N021_LeetCode_20;
import java.util.Stack;

/*
 * Time Complexity O(n)
 * Space Complexity O(n)
 */
class SolutionStackApproachTest {
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char ch : charArray){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(!((top=='(' && ch==')') || (top=='{' && ch=='}') || (top=='[' && ch==']'))) return false;
            }
        }
        return stack.isEmpty();
    }
}
public class StackApprochTest {
    public static void main(String[] args) {
        SolutionStackApproachTest solution = new SolutionStackApproachTest();
        String stringInput1 = "()";
        String stringInput2 = "()[]{}";
        String stringInput3 = "(]";
        String stringInput4 = "([])";

        System.out.println("Input String : " + stringInput1 + " Output : "+solution.isValid(stringInput1));
        System.out.println("Input String : " + stringInput2 + " Output : "+solution.isValid(stringInput2));
        System.out.println("Input String : " + stringInput3 + " Output : "+solution.isValid(stringInput3));
        System.out.println("Input String : " + stringInput4 + " Output : "+solution.isValid(stringInput4));

    }
}
