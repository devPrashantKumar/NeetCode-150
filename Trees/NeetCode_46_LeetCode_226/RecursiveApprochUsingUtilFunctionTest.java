package Trees.NeetCode_46_LeetCode_226;

/*
 * Time Complexity - O(n)
 * Space Complexity - O(n)  
 * space occupied by recursive stack in work case,
 * if tree is balanced then time complexity will be (logn)
 */
class SolutionRecursiveApprochUsingUtilFunctionTest {
    public TreeNode invertTree(TreeNode root) {
        invertTreeUtil(root);
        return root;
    }

    public void invertTreeUtil(TreeNode node){
        if(node==null) return;
        TreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
        invertTreeUtil(node.left);
        invertTreeUtil(node.right);
    }
    
}


public class RecursiveApprochUsingUtilFunctionTest {
    public static void main(String[] args) {
        SolutionRecursiveApprochUsingUtilFunctionTest solution = new SolutionRecursiveApprochUsingUtilFunctionTest();
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
