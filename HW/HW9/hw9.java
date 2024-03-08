public class hw9{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode current = root;

        while (current != null){
            if(p.val > current.val && q.val > current.val){
                current = current.right;
            }
            else if (p.val < current.val && q.val < current.val){
                current = current.left;
            }
            else {
                return current;
            }
        }
        return null;
     }
}
