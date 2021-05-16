package com.ds_algo.practice.tree.binary_tree.traversal.bfs;

import com.ds_algo.practice.tree.binary_tree.traversal.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LevelOrderTraversalTest {
    TreeNode root ;
    @BeforeEach
    void setUp() {
        root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);

    }

    @Test
    void levelOrderTraversal() {
        List<List<Integer>> result = LevelOrderTraversal.levelOrderTraversal(root);
        assertNotNull(result);
        assertEquals("[[12], [7, 9]]",result.toString());
    }
}