import java.util.ArrayList;
import java.util.List;

class SolutionRecursiveApproachWithUtilTest {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        this.generateParenthesisUtil(n,n,"",result);
        return result;
    }

    public void generateParenthesisUtil(int open, int close, String parenthesis, List<String> result){
        if(open==0 && close==0) {
            result.add(parenthesis);
            return;
        }
        else {
            if(open==close){
                generateParenthesisUtil(open-1,close,parenthesis+"(",result);
            }
            else if(open<close){
                if(open>0){
                    generateParenthesisUtil(open-1,close,parenthesis+"(",result);
                }
                generateParenthesisUtil(open,close-1,parenthesis+")",result);
            }
        }
    }
}

public class RecursiveApproachWithUtilTest {
    public static void main(String[] args) {
        SolutionRecursiveApproachWithUtilTest solution = new SolutionRecursiveApproachWithUtilTest();
        int num1 = 1;
        int num2 = 3;
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + num1);
        System.out.println("Output : " + solution.generateParenthesis(num1));
        System.out.println("---------------------------------------------------");
        System.out.println("Input : " + num2);
        System.out.println("Output : " + solution.generateParenthesis(num2));
        System.out.println("---------------------------------------------------");
    }
}
