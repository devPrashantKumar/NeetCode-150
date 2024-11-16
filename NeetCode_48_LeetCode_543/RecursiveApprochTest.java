package NeetCode_48_LeetCode_543;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * Time Complexity - O(n)
 * Space Complexity - O(n)  
 * space occupied by recursive stack in work case,
 * if tree is balanced then time complexity will be (logn)
 */

class SolutionRecursiveApprochUsingUtilFunctionTest {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null) return 0;
        // Integer larget = 0;
        // Solution : Pass largest as an AtomicInteger to maintain state across recursive calls.
        AtomicInteger largest = new AtomicInteger(0);
        binaryTreeDiameterUtil(root, largest);
        return largest.get();
    }

    public int binaryTreeDiameterUtil(TreeNode root,AtomicInteger largest){
        if(root==null){
            return 0;
        };
        int left = binaryTreeDiameterUtil(root.left,largest);
        int right = binaryTreeDiameterUtil(root.right,largest);
        largest.set(Math.max(left+right,largest.get()));
        return left>right ? left+1 : right+1;
    }
}

public class RecursiveApprochTest {
    public static void main(String[] args) {
        SolutionRecursiveApprochUsingUtilFunctionTest solution = new SolutionRecursiveApprochUsingUtilFunctionTest();
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
