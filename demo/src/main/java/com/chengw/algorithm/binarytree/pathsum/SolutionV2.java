package com.chengw.algorithm.binarytree.pathsum;

import com.chengw.algorithm.binarytree.common.TreeNode;
import com.chengw.algorithm.binarytree.common.TreeUtils;

import java.util.*;

/**
 * @author chengwei
 */
public class SolutionV2 {

    private List<List<Integer>> result = new LinkedList<>();

    private Deque<Integer> deque = new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        cal(root, targetSum);
        return result;

    }

    private void cal(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        sum -= root.val;
        deque.offerLast(root.val);
        if (root.left == null && root.right == null && sum == 0) {
            result.add(new LinkedList<>(deque));
        }
        cal(root.left, sum);
        cal(root.right, sum);
        deque.pollLast();
    }

    public static void main(String[] args) {

        TreeNode root = TreeUtils.covertBFSArrayToTree(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,5,1});

        System.out.print(new SolutionV2().pathSum(root, 22));

    }
}
