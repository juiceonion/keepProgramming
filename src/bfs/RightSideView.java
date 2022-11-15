package bfs;
import java.util.ArrayList;
import java.util.List;

// 199. 二叉树的右视图

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        List<TreeNode> line = new ArrayList<>();
        line.add(root);

        while (!line.isEmpty()) {
            int size = line.size();

            for (int i = 0; i < size; i++) {
                TreeNode tmp = line.remove(0);
                if (tmp.left != null) line.add(tmp.left);
                if (tmp.right != null) line.add(tmp.right);
                if (i == size - 1) {
                    res.add(tmp.val);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new RightSideView().rightSideView(null);
    }
}
