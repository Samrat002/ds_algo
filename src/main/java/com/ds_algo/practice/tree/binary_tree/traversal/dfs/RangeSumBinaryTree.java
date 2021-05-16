package com.ds_algo.practice.tree.binary_tree.traversal.dfs;

import com.ds_algo.practice.tree.binary_tree.traversal.TreeNode;

import java.util.Stack;

/*
    Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive). Find sum of all numbers in BST greater or equal to L and smaller or equal to R.

    The binary search tree is guaranteed to have unique values.

    Input: [4, 2, 6, 1, 3, 5, 7]
    L: 3
    R: 5
    Output: 12

    Explanation: Element Greater or Equal to L and Smaller or Equal to R are [3, 4, 5].
    so sum is 3 + 4 + 5 = 12
 */
public class RangeSumBinaryTree {
    static int rangeSum(TreeNode root, int lower, int upper){
        int sum = 0;
        if(root == null) return 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            if(currentNode.data>=lower && currentNode.data<=upper)
                sum+=currentNode.data;
            if(currentNode.right!=null) stack.push(currentNode.right);
            if(currentNode.left!=null) stack.push(currentNode.left);
        }
        return sum;
    }
}
