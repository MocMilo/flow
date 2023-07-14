package com.example.demo.algorithms.binarytree;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    /**
     * graph:
     * 3
     * / \
     * 9   20
     * /  \
     * 15   7
     */
    @Test
    void testMinDepth() {
        // Create the binary tree
        TreeNode root = new TreeNode(3); // root node
        root.setLeft(new TreeNode(9)); // leaf node
        root.setRight(new TreeNode(20));
        root.getRight().setLeft(new TreeNode(15)); // leaf node
        root.getRight().setRight(new TreeNode(7)); // leaf node

        RecursionSolution recursionSolution = new RecursionSolution();
        int minDepth = recursionSolution.minDepth(root);

        assertEquals(2, minDepth, "Expected minimum depth of 2");
    }

    /**
     * 1
     * \
     * 2
     * \
     * 3
     * \
     * 4
     * \
     * 5
     */
    @Test
    void testMinDepthWithNullValues() {
        // Create the binary tree with null values
        TreeNode root = new TreeNode(1);  // root node
        root.setLeft(null);

        root.setRight(new TreeNode(2));
        root.getRight().setLeft(null);

        root.getRight().setRight(new TreeNode(3));
        root.getRight().getRight().setLeft(null);

        root.getRight().getRight().setRight(new TreeNode(4));
        root.getRight().getRight().getRight().setLeft(null);

        root.getRight().getRight().getRight().setRight(new TreeNode(5)); // leaf node

        RecursionSolution solution = new RecursionSolution();
        int minDepth = solution.minDepth(root);

        assertEquals(5, minDepth, "Expected minimum depth of 5");
    }

}