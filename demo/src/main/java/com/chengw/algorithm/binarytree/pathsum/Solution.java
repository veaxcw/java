package com.chengw.algorithm.binarytree.pathsum;

import com.chengw.algorithm.binarytree.common.TreeNode;
import com.chengw.algorithm.binarytree.common.TreeUtils;
import com.chengw.algorithm.binarytree.travel.dfs.inorder.BFSInOrder;
import com.chengw.algorithm.binarytree.travel.dfs.postorder.BFSPostOrder;
import com.chengw.algorithm.binarytree.travel.dfs.preorder.BFSPreOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个二叉树，它的每个结点都存放着一个整数值。
 * <p>
 * 找出所有路径路径。
 * <p>
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 * <p>
 * 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数
 *
 * @author chengw
 */
public class Solution {


    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        cal(root, targetSum, new LinkedList<>());
        return result;

    }

    private void cal(TreeNode root, int sum, LinkedList<Integer> re) {
        LinkedList<Integer> level = new LinkedList<>(re);
        if (root == null) {
            return;
        }
        sum -= root.val;
        level.add(root.val);
        if (root.left == null && root.right == null && sum == 0) {
            result.add(level);
            return;
        }
        cal(root.left, sum, level);
        cal(root.right, sum, level);
    }

    public static void main(String[] args) {

        TreeNode root = TreeUtils.covertPreOrderArrayToTree(new Integer[]{5, 4, 11, 7, null, null, 2, null, null, null, 8, 12, null, null, 4, 5, null, null, 1, null, null});

        new BFSPreOrder().travel(root);
        System.out.println();
        new BFSInOrder().travel(root);
        System.out.println();
        new BFSPostOrder().travel(root);


    }

}
