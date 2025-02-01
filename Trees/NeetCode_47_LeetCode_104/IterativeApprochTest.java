package Trees.NeetCode_47_LeetCode_104;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Time Complexity - O(n)
 * Space Complexity - O(n)  
 */

class SolutionIterativeApprochTest {
    public int maxDepth(TreeNode root) {
        int maxDepth = 0;
        if (root==null) return maxDepth;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            maxDepth++;
            int elementInLevel = queue.size();
            while(elementInLevel>0){
                TreeNode element = queue.poll();
                if(element.left!=null) queue.add(element.left);
                if(element.right!=null) queue.add(element.right);
                elementInLevel--;
            }
        }
        return maxDepth;
    }
}

public class IterativeApprochTest {
    public static void main(String[] args) {
        SolutionIterativeApprochTest solution = new SolutionIterativeApprochTest();
        TreeNode root1 = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        printTree("", root1);
        System.out.println("Max Depth : "+solution.maxDepth(root1));
        System.out.println("----------------------------");

        TreeNode root2 = new TreeNode(1, null, new TreeNode(2));

        printTree("", root2);
        System.out.println("Max Depth : "+solution.maxDepth(root2));
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
