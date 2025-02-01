package Trees.NeetCode_47_LeetCode_104;

/*
 * Time Complexity - O(n)
 * Space Complexity - O(n)  
 * space occupied by recursive stack in work case,
 * if tree is balanced then time complexity will be (logn)
 */

class SolutionRecursiveApproachTest {
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth)+1;
    }
}

public class RecursiveApproachTest {
    public static void main(String[] args) {
        SolutionRecursiveApproachTest solution = new SolutionRecursiveApproachTest();
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
