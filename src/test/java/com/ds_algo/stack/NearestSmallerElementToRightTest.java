package com.ds_algo.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NearestSmallerElementToRightTest {

    private NearestSmallerElementToRight obj;
    private int[] arr;
    @BeforeEach
    void setUp() {
        obj = new NearestSmallerElementToRight();
        arr = new int[] {1, 3, 2, 4};
    }
    @Test
    void nearestSmallerElementToRight() {
        List<Integer> res = obj.nearestSmallerElementToRight(arr);
        assertFalse(res.isEmpty());
        assertTrue(res.size() == arr.length);
        assertTrue(res.get(0) == -1);
        assertTrue(res.get(1) == 2);
        assertTrue(res.get(2) == -1);
        assertTrue(res.get(3) == -1);
    }
}