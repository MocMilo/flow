package com.example.demo.algorithms.binarytree;


/**
 * Solution to find the minimum depth of a binary tree
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class RecursionSolution {
    public int minDepth(BinaryTreeNode root) {

        if (root == null) {
            return 0;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            return 1;
        }
        if (root.getLeft() == null) {
            return minDepth(root.getRight()) + 1;
        }
        if (root.getRight() == null) {
            return minDepth(root.getLeft()) + 1;
        }

        int leftDepth = minDepth(root.getLeft());
        int rightDepth = minDepth(root.getRight());

        return Math.min(leftDepth, rightDepth) + 1;
    }
}
