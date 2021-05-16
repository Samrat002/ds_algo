package com.ds_algo.practice.tree.binary_tree.traversal.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Given a nested list of integers, return the sum of all integers in the list weighted by their depth.

Each element is either an integer, or a list — whose elements may also be integers or other lists.

The depth of an integer is the number of lists that it is inside of.

For example, the nested list [1,[4,[6]]]  has each integer’s value set to depth 1 for 1, 2 for 4 and 3 for 6.

 */
public class NestedListWeightSum {

    // dfs
    static int weightedDfs(List<NestedInteger> numbers){
        return dfs(numbers, 1);
    }
    static int dfs(List<NestedInteger> numsList, int depth){
        int sum = 0;
        for(NestedInteger n: numsList){
            if(n.isInteger){
                sum = sum + depth*n.val;

            }else {
                sum = sum + dfs(n.numList, depth+1);
            }

        }
        return sum;
    }

    // bfs
    static  int weightedBfs(List<NestedInteger> numList){
        if(numList == null ) return 0;
        Queue<NestedInteger> queue = new LinkedList<>(numList);
        int depth = 1, sum = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                NestedInteger ni = queue.remove();
                if(ni.isInteger){
                    sum = sum+(ni.val* depth);

                }else {
                    queue.addAll(ni.numList);
                }
            }
            depth++;
        }
        return sum;

    }

    static class NestedInteger {
        boolean isInteger;
        Integer val;
        List<NestedInteger> numList;
        NestedInteger (boolean isInteger, Integer val, List<NestedInteger> numList){
            this.isInteger = isInteger;
            this.val = val;
            this.numList = numList;
        }

        @Override
        public String toString(){
            if (isInteger && val != null) {
                return val.toString();
            } else {
                return numList.toString();
            }
        }

    }
}
