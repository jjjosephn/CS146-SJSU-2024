import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class hw10{
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int queueLength = queue.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < queueLength; i++){
                TreeNode node = queue.poll();
                if (node != null){
                    level.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
              
            if (!level.isEmpty()){
                 results.add(level);
            }
        }
        return results;
    }
}
