package Stack.N023_LeetCode_150_EvaluateReversePolishNotation;
import java.util.Arrays;
import java.util.Stack;

/*
 * Time Complexity O(n)
 * Space Complexity O(n)
 */
class SolutionStackApproachTest {
    public int evalRPN(String[] tokens) {
        Stack<String> tokenstack = new Stack<>();
        for(String token:tokens){
            if(token.equals("-")){
                int rightoperand = Integer.parseInt(tokenstack.pop());
                int leftoperand = Integer.parseInt(tokenstack.pop());
                tokenstack.push(Integer.toString(leftoperand-rightoperand));
            }
            else if(token.equals("+")){
                int rightoperand = Integer.parseInt(tokenstack.pop());
                int leftoperand = Integer.parseInt(tokenstack.pop());
                tokenstack.push(Integer.toString(leftoperand+rightoperand));
            }
            else if(token.equals("*")){
                int rightoperand = Integer.parseInt(tokenstack.pop());
                int leftoperand = Integer.parseInt(tokenstack.pop());
                tokenstack.push(Integer.toString(leftoperand*rightoperand));
            }
            else if(token.equals("/")){
                int rightoperand = Integer.parseInt(tokenstack.pop());
                int leftoperand = Integer.parseInt(tokenstack.pop());
                tokenstack.push(Integer.toString(leftoperand/rightoperand));
            }
            else{
                tokenstack.push(token);
            }
        }

     return Integer.parseInt(tokenstack.pop());   
    }
}
public class StackApproachTest {
    public static void main(String[] args) {
        SolutionStackApproachTest solution = new SolutionStackApproachTest();
        String[] stringInput1 = {"2","1","+","3","*"};
        String[] stringInput2 = {"4","13","5","/","+"};
        String[] stringInput3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println("Input String : " + Arrays.toString(stringInput1) + " Output : "+solution.evalRPN(stringInput1));
        System.out.println("Input String : " + Arrays.toString(stringInput2) + " Output : "+solution.evalRPN(stringInput2));
        System.out.println("Input String : " + Arrays.toString(stringInput3) + " Output : "+solution.evalRPN(stringInput3));

    }
}
