package com.chengw.algorithm.binarytree.common;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author chengwei
 */
public class TreeUtils {

    private static int index = 0;


    /**
     *  将 BFS 遍历产生的数组转换成二叉树
     *
     * @param input BFS 遍历产生的数组转换成二叉树
     * @return tree root node
     */
    public static TreeNode covertBFSArrayToTree(Integer[] input) {
        assert input != null;
        assert input.length != 0;

        Queue<TreeNode> nodes = new LinkedList<>();
        TreeNode root = new TreeNode(input[0]);
        nodes.offer(root);
        boolean left = true;
        for (int i = 1; i < input.length; i++) {
            TreeNode node = nodes.peek();
            if (left) {
                if (input[i] != null) {
                    TreeNode leftNode = new TreeNode(input[i]);
                    node.left = leftNode;
                    nodes.offer(leftNode);
                }
                left = false;
            } else {
                if (input[i] != null) {
                    TreeNode rightNode = new TreeNode(input[i]);
                    node.right = rightNode;
                    nodes.offer(rightNode);
                }
                left = true;
                nodes.poll();
            }
        }
        return root;
    }

    public static TreeNode covertPreOrderArrayToTree(Integer[] input) {

        if (null == input || input.length == 0) {
            return null;
        }
        TreeNode node = constructTree(input);
        index = 0;
        return node;

    }

    private static TreeNode constructTree(Integer[] input) {
        int level_index = index++;
        if (level_index >= input.length || input[level_index] == null) {
            return null;
        }
        TreeNode node = new TreeNode(input[level_index]);
        node.left = constructTree(input);
        node.right = constructTree(input);
        return node;
    }

}
