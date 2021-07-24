package com.chengw.algorithm.binarytree.travel.dfs.inorder;

import com.chengw.algorithm.binarytree.common.TreeNode;
import com.chengw.algorithm.binarytree.travel.Travel;

/**
 *  BFS 先序遍历
 *
 * @author chengwei
 */
public class BFSInOrder implements Travel {

    @Override
    public void travel(TreeNode root) {

        if (root == null) {
            return;
        }
        travel(root.left);
        System.out.print(root.val + " ");
        travel(root.right);
    }

}
