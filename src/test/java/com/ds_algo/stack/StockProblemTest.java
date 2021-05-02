package com.ds_algo.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockProblemTest {

    private StockProblem obj;
    private int[] arr;
    @BeforeEach
    void setUp() {
        obj = new StockProblem();
        arr = new int[]{100, 800, 600, 700, 600, 750, 840};
    }

    @Test
    void stockSpan() {
        int result = obj.stockSpan(arr);
        assertTrue(result == 200);
    }
}