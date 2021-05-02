package com.ds_algo.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NearestSmallerElementToLeftTest {

    private NearestSmallerElementToLeft obj;
    private int[] arr;
    @BeforeEach
    void setUp() {
        obj = new NearestSmallerElementToLeft();
        arr = new int[]{1, 3, 2, 4};
    }

    @Test
    void nearestSmallerElementToLeft() {
        List<Integer> result = obj.nearestSmallerElementToLeft(arr);
        assertFalse(result.isEmpty());
        assertTrue(result.get(0) == -1);
        assertTrue(result.get(1) == 1);
        assertTrue(result.get(2) == 1 );
        assertTrue(result.get(3) == 2 );
    }
}