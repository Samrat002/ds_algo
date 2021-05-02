package com.ds_algo.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NearestGreaterElementToRight {

    List<Integer> nearestGreaterElementToRight(int[] arr){
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            if(stack.isEmpty())
                result.add(-1);
            else if(stack.peek()>arr[i])
                result.add(stack.peek());
            else {
                while(!stack.isEmpty() && arr[i]> stack.peek())
                    stack.pop();
                if(stack.isEmpty()) result.add(-1);
                else result.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        Collections.reverse(result);
        return result;
    }
}
