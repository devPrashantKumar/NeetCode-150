package Trees.NeetCode_50_LeetCode_;

/*
 * Time Complexity - O(n)
 * Space Complexity - O(n)  
 * space occupied by recursive stack in work case,
 * if tree is balanced then time complexity will be (logn)
 */

class SolutionRecursiveApprochTest {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(!((p==null && q==null) || (p!=null && q!=null && p.val==q.val))) return false;
        if(p==null && q==null) return true;
        //if((p==null && q!=null) || (p!=null && q==null)) return false; 
        if(!(isSameTree(p.left, q.left) && isSameTree(p.right, q.right))) return false;
        return true;
    }
}

public class RecursiveApprochTest {
    public static void main(String[] args) {
        SolutionRecursiveApprochTest solution = new SolutionRecursiveApprochTest();
        TreeNode root11 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode root21 = new TreeNode(1, new TreeNode(2), new TreeNode(3));

        System.out.println("isSameTree : "+solution.isSameTree(root11,root21));
        System.out.println("----------------------------");

        TreeNode root12 = new TreeNode(4, new TreeNode(7), null);
        TreeNode root22 = new TreeNode(4, null, new TreeNode(7));

        System.out.println("isSameTree : "+solution.isSameTree(root12,root22));
        System.out.println("----------------------------");

        TreeNode root31 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode root32 = new TreeNode(1, new TreeNode(3), new TreeNode(2));

        System.out.println("isSameTree : "+solution.isSameTree(root31,root32));
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
