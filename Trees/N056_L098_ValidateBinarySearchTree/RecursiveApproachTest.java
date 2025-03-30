package Trees.N056_L098_ValidateBinarySearchTree;

import java.util.ArrayList;
import java.util.List;

class SolutionRecursiveApproachTest {
    public boolean isValidBST(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        inOrderTraversal(root, inOrder);
        for(int i=1;i<inOrder.size();i++){
            if(inOrder.get(i)<=inOrder.get(i-1)) return false;
        }
        return true;
    }

    public void inOrderTraversal(TreeNode root, List<Integer> inorder) {
        if (root == null)
            return;
        inOrderTraversal(root.left, inorder);
        inorder.add(root.val);
        inOrderTraversal(root.right, inorder);
    }
}

public class RecursiveApproachTest {
    public static void main(String[] args) {
        SolutionRecursiveApproachTest solution = new SolutionRecursiveApproachTest();
        TreeNode root1 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode root2 = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));

        System.out.println("kthSmallest : " + solution.isValidBST(root1));
        System.out.println("----------------------------");
        System.out.println("kthSmallest : " + solution.isValidBST(root2));
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
