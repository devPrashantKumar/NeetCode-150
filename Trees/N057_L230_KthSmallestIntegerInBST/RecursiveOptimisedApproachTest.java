package Trees.N057_L230_KthSmallestIntegerInBST;

import java.util.ArrayList;
import java.util.List;

class SolutionRecursiveApproachTest {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorder = new ArrayList<Integer>();
        inOrderTraversal(root, k, inorder);
        return inorder.get(k-1);
    }

    public void inOrderTraversal(TreeNode root, int k, List<Integer> inorder) {
        if (root == null)
            return;
        inOrderTraversal(root.left, k,inorder);
        inorder.add(root.val);
        if(inorder.size()==k) return;
        inOrderTraversal(root.right, k, inorder);
    }
}

public class RecursiveOptimisedApproachTest {
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
