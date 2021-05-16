package com.ds_algo.practice.tree.binary_tree.traversal.dfs;

import com.ds_algo.practice.tree.binary_tree.traversal.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
    Given a Binary Tree, do a depth first search traversal with root as first and followed left and right for the tree node.

    Input: [12, 7, 1, 9, null, 10, 5]
    Output: [12, 7, 9, 1, 10, 5]
 */
public class DFSOnTree {
    // 1) Recursive solution
    void dfs(TreeNode root, List<Integer> resultList){
        if(root !=null){
            resultList.add(root.data);
            if(root.left!=null)
                dfs(root.left, resultList);
            if(root.right!=null)
                dfs(root.right, resultList);
        }
    }
    List<Integer> dfs(TreeNode root){
        List<Integer> resultList = new ArrayList<>();
        dfs(root, resultList);
        return resultList;
    }

    // 2) Using stack
    List<Integer> dfsWithoutRecursion(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode node;
        if(!stack.isEmpty()){
            node  = stack.pop();
            result.add(node.data);
            if(node.right!=null)
                stack.push(node.right);
            if(node.left!=null)
                stack.push(node.left);
        }
        return result;
    }


}
