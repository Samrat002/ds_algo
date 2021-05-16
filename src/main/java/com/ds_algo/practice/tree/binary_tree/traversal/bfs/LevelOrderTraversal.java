package com.ds_algo.practice.tree.binary_tree.traversal.bfs;

import com.ds_algo.practice.tree.binary_tree.traversal.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Given a binary tree, return the level order traversal of its nodes’ values. Values should be printed level by level from left to right.

Input:
Binary Tree: [12, 7, 1, 9, null, 10, 5]
Output:
[
    [12],
    [7, 1],
    [9, 10, 5]
]

 */
public class LevelOrderTraversal {
    static List<List<Integer>> levelOrderTraversal(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();

        if(root==null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> innerList = new ArrayList<>();
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()){
            TreeNode temp = queue.remove();
            if(temp == null){
                if(!queue.isEmpty())
                    queue.add(null);
                res.add(innerList);
                innerList = new ArrayList<>();
            }else {
                innerList.add(temp.data);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
        }
        return res;
    }
}
