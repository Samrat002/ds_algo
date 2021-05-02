package com.ds_algo.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NearestGreaterElementToLeftTest {
    NearestGreaterElementToLeft obj;
    int[] arr;
    @BeforeEach
    void setUp() {
        obj = new NearestGreaterElementToLeft();
        arr = new int[] {1,3,2,4};
    }

    @Test
    void nearestGreaterElementToLeft(){
        List<Integer> res = obj.nearestGreaterElementToLeft(arr);
        assertTrue(!res.isEmpty());
        assertTrue(res.size() == 4);
        assertTrue(res.get(0) ==  -1);
        assertTrue(res.get(1) ==  -1);
        assertTrue(res.get(2) ==  3);
        assertTrue(res.get(3) ==  -1);
    }
}