package com.example.demo.algorithms.binarytree;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    /**
     * graph:
     *      3
     *     / \
     *    9   20
     *       /  \
     *      15   7
     */
    @Test
    void testMinDepth() {
        // Create the binary tree
        TreeNode root = new TreeNode(3); // root node
        root.left = new TreeNode(9);  // leaf node
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15); // leaf node
        root.right.right = new TreeNode(7); // leaf node

        RecursionSolution recursionSolution = new RecursionSolution();
        int minDepth = recursionSolution.minDepth(root);

        assertEquals(2, minDepth, "Expected minimum depth of 2");
    }

    /**
     *         1
     *          \
     *           2
     *            \
     *             3
     *              \
     *               4
     *                \
     *                 5
     */
    @Test
    void testMinDepthWithNullValues() {
        // Create the binary tree with null values
        TreeNode root = new TreeNode(1);  // root node
        root.left = null;

        root.right = new TreeNode(2);
        root.right.left = null;

        root.right.right = new TreeNode(3);
        root.right.right.left = null;

        root.right.right.right = new TreeNode(4);
        root.right.right.right.left = null;

        root.right.right.right.right = new TreeNode(5); // leaf node

        RecursionSolution solution = new RecursionSolution();
        int minDepth = solution.minDepth(root);

        assertEquals(5, minDepth, "Expected minimum depth of 5");
    }

}