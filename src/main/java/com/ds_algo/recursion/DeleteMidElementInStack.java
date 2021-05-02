package com.ds_algo.recursion;

import java.util.Stack;

public class DeleteMidElementInStack<T> {

    Stack<T>  delete(Stack<T> stack){
        if(stack.isEmpty()) return null;
        deleteUsingRecursion(stack, stack.size()/2);
        return stack;
    }
    private void deleteUsingRecursion(Stack<T> stack, int pos){
        if(pos == 0)
            stack.pop();
        else {
            T data =  stack.pop();
            deleteUsingRecursion(stack, pos - 1);
            stack.push(data);
        }
    }
}
