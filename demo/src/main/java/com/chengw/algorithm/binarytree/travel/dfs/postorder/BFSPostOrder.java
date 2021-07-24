package com.chengw.algorithm.binarytree.travel.dfs.postorder;

import com.chengw.algorithm.binarytree.common.TreeNode;
import com.chengw.algorithm.binarytree.travel.Travel;

/**
 *  BFS 先序遍历
 *
 * @author chengwei
 */
public class BFSPostOrder implements Travel {

    @Override
    public void travel(TreeNode root) {

        if (root == null) {
            return;
        }
        travel(root.left);
        travel(root.right);
        System.out.print(root.val + " ");

    }

}
