package com.ds_algo.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class DeleteMidElementInStackTest {
    private DeleteMidElementInStack<Integer> obj;
    private Stack<Integer> stack;
    @BeforeEach
    void setUp() {
        obj = new DeleteMidElementInStack<Integer>();
        stack = new Stack<>();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
    }

    @Test
    void delete() {
        obj.delete(stack);
        assertEquals(  4, stack.size());
        assertTrue(stack.pop() == 14);
        assertTrue(stack.pop() == 13);
        assertTrue(stack.pop() == 11);
        assertTrue(stack.pop() == 10);
    }
}