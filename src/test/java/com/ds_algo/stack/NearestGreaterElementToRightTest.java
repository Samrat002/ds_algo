package com.ds_algo.stack;

import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NearestGreaterElementToRightTest {
    private int arr[] ;
    NearestGreaterElementToRight obj;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        arr = new int[]{1,3,2,4};
        obj = new NearestGreaterElementToRight();

    }

    @org.junit.jupiter.api.Test
    void nearestGreaterElementToRight() {
        List<Integer> res = obj.nearestGreaterElementToRight(arr);
        int [] expected = new int[] {3, 4, 4, -1};
        assertFalse(res.isEmpty());
        assertTrue(expected.length == res.size());
        assertTrue(res.get(0) == expected[0]);
        assertTrue(res.get(1) == expected[1]);
        assertTrue(res.get(2) == expected[2]);
        assertTrue(res.get(3) == expected[3]);

    }
}