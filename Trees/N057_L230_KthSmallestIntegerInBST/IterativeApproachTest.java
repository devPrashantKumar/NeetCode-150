package Trees.N057_L230_KthSmallestIntegerInBST;

import java.util.Stack;

class SolutionRecursiveApproachTest {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) return root.val;
            root = root.right;
        }
    }

}

public class IterativeApproachTest {
    public static void main(String[] args) {
        SolutionRecursiveApproachTest solution = new SolutionRecursiveApproachTest();
        TreeNode root1 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode root2 = new TreeNode(4, new TreeNode(3, new TreeNode(2), null), new TreeNode(5));
        int k1 = 1;
        int k2 = 4;
        System.out.println("kthSmallest : " + solution.kthSmallest(root1, k1));
        System.out.println("----------------------------");
        System.out.println("kthSmallest : " + solution.kthSmallest(root2, k2));
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
