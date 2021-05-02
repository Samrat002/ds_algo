package com.ds_algo.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubsetOfStringTest {

    private SubsetOfString obj;
    @BeforeEach
    void setUp() {
        obj = new SubsetOfString();

    }

    @Test
    void getAllSubset() {
        List<String> l = obj.getAllSubset("abc");
        assertEquals(8, l.size());
        assertEquals("", l.get(0));
        assertEquals("c", l.get(1));
        assertEquals("b", l.get(2));
        assertEquals("bc", l.get(3));
        assertEquals("a", l.get(4));
        assertEquals("ac", l.get(5));
        assertEquals("ab", l.get(6));
        assertEquals("abc", l.get(7));

    }
}