package com.ds_algo.practice.tree.binary_tree.traversal.dfs;

import com.ds_algo.practice.tree.binary_tree.traversal.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumBinaryTreeTest {

    TreeNode root;
    @BeforeEach
    void setUp() {
        root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.left.right = new TreeNode(1);

    }

    @Test
    void rangeSum() {
        int res = RangeSumBinaryTree.rangeSum(root, 1, 9);
        assertEquals(17, res);
    }
}