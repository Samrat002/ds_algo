package com.ds_algo.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateAllValidParenthesisTest {
    private CreateAllValidParenthesis obj;
    @BeforeEach
    void setUp() {
        obj = new CreateAllValidParenthesis();

    }

    @Test
    void createValidParenthesis() {
        List<String> res = obj.createValidParenthesis(3);
        assertEquals(5, res.size());
        assertEquals(res.get(0), "((()))");
        assertEquals(res.get(1), "(()())");
        assertEquals(res.get(2), "(())()");
        assertEquals(res.get(3), "()(())");
        assertEquals(res.get(4), "()()()");
    }
}