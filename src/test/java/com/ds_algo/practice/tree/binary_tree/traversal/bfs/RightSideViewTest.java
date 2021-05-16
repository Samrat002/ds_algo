package com.ds_algo.practice.tree.binary_tree.traversal.bfs;

import com.ds_algo.practice.tree.binary_tree.traversal.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RightSideViewTest {
    TreeNode root;
    @BeforeEach
    void setUp() {
        root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.left.right = new TreeNode(1);

    }

    @Test
    void rightView() {
        List<Integer> result = RightSideView.rightView(root);
        assertNotNull(result);
        assertEquals("[12, 9, 1]" , result.toString());
    }
}