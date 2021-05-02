package com.ds_algo.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class Pair{
    int index,  value;
    Pair(int index,int value){
        this.index = index;
        this.value = value;
    }
}
public class MaximumAreaRectangleInHistogram {
    public int maxAreaRectangleInHistogram(int [] arr){
        int[] nsr = findNextSmallerToRight(arr);
        int [] nsl = findNextSmallerToLeft(arr);
        int[] area = computeArea(nsr, nsl, arr);
        return max(area);
    }

    int max(int[] area){
        int tempMax = 0;
        for(int a:area){
            if(a>tempMax){
                tempMax = a;
            }
        }
        return tempMax;
    }
    int[] computeArea(int[] nsr, int[] nsl, int[] arr){
        int[] area = new int[nsr.length];
        for(int i=0;i<nsr.length;i++){
            area[i] = arr[i]*(nsr[i]-nsl[i]-1);
        }
        return area;
    }
    int[] findNextSmallerToRight(int[] arr){
        List<Integer> res = new ArrayList<>();
        Stack<Pair> stack = new Stack<>();
        for(int i = arr.length-1;i>=0; i--){
            if(stack.isEmpty()) res.add(-1);
            else if(stack.peek().value<arr[i])
                res.add(stack.peek().index);
            else {
                while(!stack.isEmpty() && stack.peek().value>arr[i])
                    stack.pop();
                if(stack.isEmpty())
                    res.add(-1);
                else
                    res.add(stack.peek().index);
            }
            stack.push(new Pair(i, arr[i]));
        }
        Collections.reverse(res);
        return res.stream().mapToInt(i -> i).toArray();
    }

    int[] findNextSmallerToLeft(int[] arr){
        Stack<Pair> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(stack.isEmpty())
                res.add(-1);
            else if(stack.peek().value<arr[i])
                res.add(stack.peek().index);
            else {
                while(!stack.isEmpty() && stack.peek().value>arr[i])
                    stack.pop();
                if(stack.isEmpty()) res.add(-1);
                else res.add(stack.peek().index);

            }
            stack.push(new Pair(i, arr[i]));

        }
        return res.stream().mapToInt(i -> i).toArray() ;
    }

}
