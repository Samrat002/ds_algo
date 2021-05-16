package com.ds_algo.practice.tree.binary_tree.traversal.bfs;

import com.ds_algo.practice.tree.binary_tree.traversal.TreeNode;

import java.util.*;

public class KDistantNodesFromTargetNode {
    static List<Integer> kDistance(TreeNode root, TreeNode target, int k){
        List<Integer> result = new ArrayList<>();
        Map<TreeNode, TreeNode> backMap= new HashMap<>();
        // find the targetNode and built backMap along
        // O(n)
        // assuming unique values in the tree
        TreeNode kNode = dfs(root, target.data, backMap);
        if(k<0 || kNode == null)
            return result;

        // perform bfs in the kNode to find the nearest leaves
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(kNode);
        queue.offer(null);
        Set<TreeNode> visited = new HashSet<>();
        visited.add(kNode);
        int level = 0;
        while(!queue.isEmpty() && level<k){
            TreeNode curr = queue.poll();

            if(curr != null){
                visited.add(curr);
                if(curr.left!=null && !visited.contains(curr.left))
                    queue.add(curr.left);
                if(curr.right!=null && !visited.contains(curr.right))
                    queue.add(curr.right);
                if(backMap.containsKey(curr) && !visited.contains(backMap.get(curr)))
                    queue.add(backMap.get(curr));
            }else {
                level++;
                if(!queue.isEmpty())
                    queue.add(null);
            }

        }

        for(TreeNode n: queue){
            if(n!=null)
                result.add(n.data);
        }
        return result;
    }

    static TreeNode dfs(TreeNode root, int target, Map<TreeNode, TreeNode> backMap){
        if(root.data == target)
            return root;
        if(root.left!=null) {
                backMap.put(root.left, root);
                TreeNode t0 = dfs(root.left, target, backMap);
                if(t0!=null)
                    return t0;
        }

        if(root.right!=null){
                backMap.put(root.right, root);
                TreeNode t1 = dfs(root.right, target, backMap);
                if(t1!=null)
                    return t1;

        }
        return null;


    }
}
