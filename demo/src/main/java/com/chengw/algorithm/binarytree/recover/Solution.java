package com.chengw.algorithm.binarytree.recover;

import com.chengw.algorithm.binarytree.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 搜索二叉树中有且仅有两个节点，错误，寻找并恢复
 *
 * @author chengwei
 */
public class Solution {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        root.right.left = new TreeNode(2);

        new Solution().recoverTree(root);

    }

    List<TreeNode> nodes = new ArrayList<>();

    public void recoverTree(TreeNode root) {
        this.travelNodes(root);
        int[] error = new int[]{-1, -1};
        for (int i = 1; i < nodes.size(); i++) {
            if (nodes.get(i - 1).val > nodes.get(i).val) {
                if (error[0] < 0) {
                    error[0] = i - 1;
                }
                error[1] = i;
            }
        }
        if (error[0] >=0 && error[1] >= 0) {
            int tmp = nodes.get(error[0]).val;
            nodes.get(error[0]).val = nodes.get(error[1]).val;
            nodes.get(error[1]).val = tmp;
        }


    }

    public void travelNodes(TreeNode node) {
        if (node == null) {
            return;
        }
        travelNodes(node.left);
        nodes.add(node);
        travelNodes(node.right);
    }


}
