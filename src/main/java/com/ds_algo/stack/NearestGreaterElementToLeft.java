package com.ds_algo.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestGreaterElementToLeft {
    List<Integer> nearestGreaterElementToLeft(int[] arr){
        List<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty())
                res.add(-1);
            else if(stack.peek() > arr[i])
                res.add(stack.peek());
            else {
                while(!stack.isEmpty() && stack.peek()<=arr[i])
                    stack.pop();
                if(stack.isEmpty())
                    res.add(-1);
                else
                    res.add(stack.peek());

            }
            stack.push(arr[i]);
        }
        return res;

    }
}
