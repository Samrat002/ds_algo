package com.ds_algo.practice.tree.binary_tree.traversal.dfs;

import com.ds_algo.practice.tree.binary_tree.traversal.TreeNode;

public class LeastCommonAncestor {

    TreeNode leastCommonAncestor(TreeNode root, int p, int q){
        if(root == null || root.data == p || root.data == q)
            return root;
        TreeNode ancestorFromLeftTraverse = leastCommonAncestor(root.left, p, q);
        TreeNode ancestorFromRightTraverse = leastCommonAncestor(root.right, p, q);
        if(ancestorFromLeftTraverse!=null && ancestorFromRightTraverse!=null)
            return root;
        return ancestorFromLeftTraverse!=null?ancestorFromLeftTraverse:ancestorFromRightTraverse;
    }
}
