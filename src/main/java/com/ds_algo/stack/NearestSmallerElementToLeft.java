package com.ds_algo.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestSmallerElementToLeft {
    List<Integer> nearestSmallerElementToLeft(int[] arr){
        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty())
                result.add(-1);
            else if (stack.peek()<arr[i])
                result.add(stack.peek());
            else{
                while(!stack.isEmpty() && stack.peek()>=arr[i])
                    stack.pop();
                if(stack.isEmpty())
                    result.add(-1);
                else
                    result.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        return result;

    }
}
