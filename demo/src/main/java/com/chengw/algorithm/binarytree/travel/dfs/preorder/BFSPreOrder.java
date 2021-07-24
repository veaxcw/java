package com.chengw.algorithm.binarytree.travel.dfs.postorder;

import com.chengw.algorithm.binarytree.common.TreeNode;
import com.chengw.algorithm.binarytree.travel.Travel;

/**
 *  BFS 先序遍历
 *
 * @author chengwei
 */
public class BFSPreOrder implements Travel {

    @Override
    public void travel(TreeNode root) {

        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        travel(root.left);
        travel(root.right);
    }

}
