package Trees.NeetCode_46_LeetCode_226;
import java.util.*;

/*
 * Time Complexity - O(n)
 * Space Complexity - O(n)
 */
class SolutionIterativeApprochTest {
    public TreeNode invertTree(TreeNode root) {
        if(root==null) return root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left!=null)queue.add(node.left);
            if(node.right!=null)queue.add(node.right);
            TreeNode tempNode = node.left;
            node.left = node.right;
            node.right = tempNode;
        }
        return root;
    }
}


public class IterativeApprochTest {
    public static void main(String[] args) {
        SolutionIterativeApprochTest solution = new SolutionIterativeApprochTest();
        TreeNode root1 = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(7, new TreeNode(6), new TreeNode(9)));

        printTree("",root1);
        System.out.println("----------------------------");
        TreeNode invertRoot1 = solution.invertTree(root1);
        printTree("",invertRoot1);
        System.out.println("----------------------------");

        System.out.println("----------------------------");
        System.out.println("----------------------------");

        TreeNode root2 = null;

        printTree("",root2);
        System.out.println("----------------------------");
        TreeNode invertRoot2 = solution.invertTree(root2);
        printTree("",invertRoot2);
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
