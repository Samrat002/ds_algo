package com.ds_algo.practice.tree.binary_tree.traversal.bfs;

import com.ds_algo.practice.tree.binary_tree.traversal.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideView {
    static List<Integer> rightView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null ) return result;
        TreeNode currentNode = root , temp;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);
        while(!queue.isEmpty()){
            temp = queue.poll();
            if(temp == null) {
                if (!queue.isEmpty())
                    queue.offer(null);
                result.add(currentNode.data);

            }else{
                currentNode = temp;
                if(temp.left!=null) queue.offer(temp.left);
                if(temp.right!=null) queue.offer(temp.right);
            }
        }
        return result;
    }
}
