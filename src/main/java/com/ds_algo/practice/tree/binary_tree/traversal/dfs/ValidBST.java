package com.ds_algo.practice.tree.binary_tree.traversal.dfs;

import com.ds_algo.practice.tree.binary_tree.traversal.TreeNode;

import java.util.Stack;

/*
    Given the root of a binary tree, determine if it is a valid binary search tree (BST).

    A valid BST is defined as follows:

    The left subtree of a node contains only nodes with keys less than the node’s key.
    The right subtree of a node contains only nodes with keys greater than the node’s key.
    Both the left and right subtrees must also be binary search trees.
    Input:[7, 3, 15, null, null, 9, 20]

    Output: true

 */
public class ValidBST {
    boolean isValidBST(TreeNode root){
        if(root == null)
            return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;
        while(root!=null) {
            stack.push(root);
            root = root.left;
        }
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            if(pre!=null && curr.data<= pre.data) return false;
            if(curr.right!=null) stack.push(curr.right);
            pre = curr;
        }
        return true;
    }
}
