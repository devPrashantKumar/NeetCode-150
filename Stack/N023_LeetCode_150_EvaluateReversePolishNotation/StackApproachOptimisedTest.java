package Stack.N023_LeetCode_150_EvaluateReversePolishNotation;
import java.util.Arrays;
import java.util.Stack;

/*
 * Time Complexity O(n)
 * Space Complexity O(n)
 */
class SolutionStackApproachOptimisedTest {
    public int evalRPN(String[] tokens) {
        Stack<Long> tokenstack = new Stack<>();
        for(String token:tokens){
            if(token.equals("-") || token.equals("+") || token.equals("*")|| token.equals("/")){
                Long rightoperand = tokenstack.pop();
                Long leftoperand = tokenstack.pop();
                Character operator = token.charAt(0);
                tokenstack.push(resolve(leftoperand,rightoperand,operator));
            }
            else{
                tokenstack.push(Long.parseLong(token));
            }
        }

     return Integer.parseInt(tokenstack.pop().toString());   
    }

    public Long resolve(Long leftoperand, Long rightOperand, Character operator){
        if(operator.equals('-')) return leftoperand-rightOperand;
        else if(operator.equals('+')) return leftoperand+rightOperand; 
        else if(operator.equals('*')) return leftoperand*rightOperand; 
        else return leftoperand/rightOperand; 
    }
}
public class StackApproachOptimisedTest {
    public static void main(String[] args) {
        SolutionStackApproachOptimisedTest solution = new SolutionStackApproachOptimisedTest();
        String[] stringInput1 = {"2","1","+","3","*"};
        String[] stringInput2 = {"4","13","5","/","+"};
        String[] stringInput3 = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        System.out.println("Input String : " + Arrays.toString(stringInput1) + " Output : "+solution.evalRPN(stringInput1));
        System.out.println("Input String : " + Arrays.toString(stringInput2) + " Output : "+solution.evalRPN(stringInput2));
        System.out.println("Input String : " + Arrays.toString(stringInput3) + " Output : "+solution.evalRPN(stringInput3));

    }
}
