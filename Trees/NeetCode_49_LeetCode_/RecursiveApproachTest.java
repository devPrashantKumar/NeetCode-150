package Trees.NeetCode_49_LeetCode_;

/*
 * Time Complexity - O(n)
 * Space Complexity - O(n)  
 * space occupied by recursive stack in work case,
 * if tree is balanced then time complexity will be (logn)
 */

class SolutionRecursiveApproachTest {
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        return isBalancedUtil(root)[0]==1;
    }

    public int[] isBalancedUtil(TreeNode root){
        if(root==null) return new int[]{1,0};
        int[] leftResult = isBalancedUtil(root.left);
        if(leftResult[0]==0) return leftResult;
        int[] rightResult = isBalancedUtil(root.right);
        if(rightResult[0]==0) return rightResult;
        if(Math.abs(Math.subtractExact(leftResult[1], rightResult[1]))>1) {
            return new int[]{0,Math.max(leftResult[1], rightResult[1])+1};
        }
        return new int[]{1,Math.max(leftResult[1], rightResult[1])+1};
    }
}

public class RecursiveApproachTest {
    public static void main(String[] args) {
        SolutionRecursiveApproachTest solution = new SolutionRecursiveApproachTest();
        TreeNode root1 = new TreeNode(1, new TreeNode(2), new TreeNode(3, new TreeNode(4), null));

        printTree("", root1);
        System.out.println("Max Depth : "+solution.isBalanced(root1));
        System.out.println("----------------------------");

        TreeNode root2 = new TreeNode(1, new TreeNode(2), new TreeNode(3,new TreeNode(4,new TreeNode(5),null),null));

        printTree("", root2);
        System.out.println("Max Depth : "+solution.isBalanced(root2));
        System.out.println("----------------------------");

        TreeNode root3 = null;

        printTree("", root3);
        System.out.println("Max Depth : "+solution.isBalanced(root3));
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
