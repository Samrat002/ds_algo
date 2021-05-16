package com.ds_algo.practice.tree.binary_tree.traversal.bfs;
/*
    Given a binary tree, populate an array to represent its zigzag level order traversal.
    You should populate the values of all nodes of the first level from left to right,
    then right to left for the next level and keep alternating in the same manner for the following levels.

    Input: [12, 7, 1, 9, NULL, 10, 5]
    Output: [[12], [1, 7], [9, 10, 5]]
 */

import com.ds_algo.practice.tree.binary_tree.traversal.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagTraversal {

    static List<List<Integer>> zigzagTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        boolean leftToRight = true;
        List<Integer> currentList = new ArrayList<>();
        TreeNode currentNode;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while(!queue.isEmpty()){
            currentNode = queue.poll();
            if(currentNode==null){
                if(!queue.isEmpty()){
                    queue.offer(null);
                }
                result.add(currentList);
                currentList = new ArrayList<>();
                leftToRight = !leftToRight;
            }else {
                if (leftToRight)
                    currentList.add(currentNode.data);
                else
                    currentList.add(0, currentNode.data);
                if (currentNode.left != null)
                    queue.offer(currentNode.left);
                if (currentNode.right != null)
                    queue.offer(currentNode.right);

            }

        }
        return result;


    }
}
