package com.chengw.algorithm.binarytree.recover;

import com.chengw.algorithm.binarytree.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class SolutionV2 {


    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        root.right.left = new TreeNode(2);
        SolutionV2 so = new SolutionV2();

        so.recoverTree(root);
        System.out.println(1);

    }

    TreeNode x = null;

    TreeNode y = null;

    TreeNode pre = null;


    public void recoverTree(TreeNode root) {
        this.travelNodes(root);
        if (x != null && y != null) {
            int tmp = x.val;
            x.val = y.val;
            y.val = tmp;
        }

    }

    public void travelNodes(TreeNode node) {
        if (node == null) {
            return;
        }
        travelNodes(node.left);
        if (pre != null) {
            if (pre.val > node.val) {
                if (x == null) {
                    x = pre;
                }
                y = node;
            }
        }
        pre = node;

        travelNodes(node.right);
    }
}
