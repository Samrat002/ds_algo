package com.ds_algo.practice.tree.binary_tree.traversal.bfs;


import com.ds_algo.practice.tree.binary_tree.traversal.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
    #####   TYPE-1
    Given a binary tree, connect each node with its level order successor. The last node of each level should point to a null node.
    Input: [12, 7, 1, 9, null, 10, 5]
    Output:
        12
        7 1
        9 10 5

    #####   TYPE-2
    Given a binary tree, connect each node with its level order successor.
    The last node of each level should point to the first node of the next level.

    Input: [12, 7, 1, 9, null, 10, 5]
    Output:
    12 -> 7 -> 1 -> 9 -> 10 > 5
 */
public class ConnectedLevelOrderSibling {
    List<Integer> type_1(TreeNode root){
        return null;
    }

    static List<Integer> type_2(TreeNode root){
        List<Integer> result = new LinkedList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode currentNode;
        while(!queue.isEmpty()){
            currentNode = queue.poll();
            if(currentNode != null){
                result.add(currentNode.data);
                if(currentNode.left!= null)
                    queue.offer(currentNode.left);
                if(currentNode.right!=null)
                    queue.offer(currentNode.right);

            }
        }
        return result;
    }


}
