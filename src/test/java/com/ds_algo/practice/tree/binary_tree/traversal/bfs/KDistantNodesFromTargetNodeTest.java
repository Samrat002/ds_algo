package com.ds_algo.practice.tree.binary_tree.traversal.bfs;

import com.ds_algo.practice.tree.binary_tree.traversal.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class KDistantNodesFromTargetNodeTest {
    TreeNode root;
    @BeforeEach
    void setUp() {
        root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.right.right = new TreeNode(11);
        root.right.left = new TreeNode(14);
        root.left.left = new TreeNode(21);
        root.left.right = new TreeNode(22);

    }
    @Test
    void kDistance() {
        List<Integer> res = KDistantNodesFromTargetNode.kDistance(root, root.right, 1);
        assertEquals(new ArrayList<Integer>(Arrays.asList(14,11,12)), res);
    }

    @Test
    void dfs() {
        Map<TreeNode, TreeNode> backMap = new HashMap<>();
        TreeNode node = KDistantNodesFromTargetNode.dfs(root, 9, backMap);
        assertNotNull(node);
        assertEquals(root.right, node);
    }
}