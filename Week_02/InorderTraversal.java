package leetcode94;

//给定一个二叉树，返回它的中序 遍历。
//
// 示例:
//
// 输入: [1,null,2,3]
//   1
//    \
//     2
//    /
//   3
//
//输出: [1,3,2]
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
// Related Topics 栈 树 哈希表
// 👍 717 👎 0

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：LiangYe
 * @date ：Created in 2020/9/20 17:38
 * @description：二叉树的中序遍历
 */
public class InorderTraversal {

    /**
     * create by: LiangYe
     * description: 二叉树的中序遍历
     * create time: 2020/9/20 17:42
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    /**
     * create by: LiangYe
     * description: 二叉树的中序遍历(递归)
     * create time: 2020/9/20 17:42
     */
    private void inorder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        // 遍历左子树
        inorder(root.left, res);
        // 添加根元素
        res.add(root.val);
        // 遍历左子树
        inorder(root.right, res);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
