package com.ds_algo.practice.arrays;

import com.ds_algo.practice.arrays.FindMinMaxFromArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinMaxFromArrayTest {
    FindMinMaxFromArray obj;
    @BeforeEach
    void setUp() {
        obj = new FindMinMaxFromArray();

    }

    @Test
    void linearSearch() {
        FindMinMaxFromArray.Pair res = obj.linearSearch(new int[]{1,2,3,4,5,3,9,40});
        assertEquals(1, res.min);
        assertEquals(40, res.max);
    }

    @Test
    void divideAndSearch() {
        FindMinMaxFromArray.Pair res = obj.divideAndSearch(new int[]{1,2,3,4,5,3,9,40});
        assertEquals(1, res.min);
        assertEquals(40, res.max);
    }

    @Test
    void solve() {
        FindMinMaxFromArray.Pair res = obj.solve(new int[]{1,2,3,4,5,3,9,40});
        assertEquals(1, res.min);
        assertEquals(40, res.max);
    }
}