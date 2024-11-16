package NeetCode_48_LeetCode_543;

import java.util.HashMap;
import java.util.Stack;

/*
 * Time Complexity - O(n)
 * Space Complexity - O(n)  
 */

class SolutionIterativeApprochTest {
    public int diameterOfBinaryTree(TreeNode root) {
        int diameter = 0;
        HashMap<TreeNode,Integer> map = new HashMap<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root!=null){
            stack.push(root);
        }

        while(!stack.isEmpty()){
            TreeNode node = stack.peek();
            if(node.left!=null && !map.containsKey(node.left)){
                stack.push(node.left);
            }
            else if(node.right!=null && !map.containsKey(node.right)){
                stack.push(node.right);
            }else{
                stack.pop();
                int leftDepth = map.getOrDefault(node.left, 0);
                int rightDepth = map.getOrDefault(node.right, 0);

                map.put(node, 1+Math.max(leftDepth,rightDepth));
                diameter = Math.max(diameter, leftDepth+rightDepth);
            }
        }
        return diameter;
    }
}

public class IterativeApprochTest {
    public static void main(String[] args) {
        SolutionIterativeApprochTest solution = new SolutionIterativeApprochTest();
        TreeNode root1 = new TreeNode(1, null,new TreeNode(2,new TreeNode(3,new TreeNode(5),null),new TreeNode(4)));

        printTree("", root1);
        System.out.println("Max Depth : "+solution.diameterOfBinaryTree(root1));
        System.out.println("----------------------------");

        TreeNode root2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        printTree("", root2);
        System.out.println("Max Depth : "+solution.diameterOfBinaryTree(root2));
        System.out.println("----------------------------");

    }

    public static void printTree(String space, TreeNode root) {
        if (root == null)
            return;
        printTree(space + "    ", root.right);
        System.out.println(space + root.val);
        printTree(space + "    ", root.left);
    }
}
