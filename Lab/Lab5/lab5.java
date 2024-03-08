public class lab5{
    public boolean isValidBST(TreeNode root) {
        return validBST(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);  
    }
    private boolean validBST(TreeNode node, double min, double max){
        if(node == null){
            return true;
        }
        if(!(node.val > min && node.val < max)){
              return false;
        }
        return (validBST(node.left, min, node.val) && validBST(node.right, node.val, max));
    }
}
