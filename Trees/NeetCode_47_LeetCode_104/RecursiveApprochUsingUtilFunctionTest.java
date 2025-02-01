package Trees.NeetCode_47_LeetCode_104;

import java.util.concurrent.atomic.AtomicInteger;

/*
 * Time Complexity - O(n)
 * Space Complexity - O(n)  
 * space occupied by recursive stack in work case,
 * if tree is balanced then time complexity will be (logn)
 */

class SolutionRecursiveApprochUsingUtilFunctionTest {
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        // Integer larget = 0;
        // doesn't work as intended because Integer objects are immutable in Java,
        // and reassigning largest within maxDepthUtil won't change the largest variable in the calling method
        // Solution : Pass largest as an AtomicInteger to maintain state across recursive calls.
        AtomicInteger largest = new AtomicInteger(0);
        maxDepthUtil(root, 0, largest);
        return largest.get();
    }

    public void maxDepthUtil(TreeNode root,int depth,AtomicInteger largest){
        if(root==null){
            largest.set(Math.max(depth,largest.get()));
            return;
        };
        maxDepthUtil(root.left,depth+1,largest);
        maxDepthUtil(root.right,depth+1,largest);
    }
}

public class RecursiveApprochUsingUtilFunctionTest {
    public static void main(String[] args) {
        SolutionRecursiveApprochUsingUtilFunctionTest solution = new SolutionRecursiveApprochUsingUtilFunctionTest();
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
