package com.ds_algo.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumAreaRectangleInHistogramTest {
    private MaximumAreaRectangleInHistogram obj;
    private int[] arr;
    @BeforeEach
    void setUp() {
        obj = new MaximumAreaRectangleInHistogram();
        arr = new int[]{6,2,5,4,5,1,6};
    }

    @Test
    void maxAreaRectangleInHistogram() {
        int res = obj.maxAreaRectangleInHistogram(arr);
        assertEquals(12, res);

    }

    @Test
    void max() {
        assertEquals(6, obj.max(arr));
    }

    @Test
    void computeArea() {
        int[] nsr = obj.findNextSmallerToRight(arr);
        int[] nsl = obj.findNextSmallerToLeft(arr);
        int[] area = obj.computeArea(nsr, nsl, arr);
        assertTrue(area.length == arr.length);
    }

    @Test
    void findNextSmallerToRight() {
    }

    @Test
    void findNextSmallerToLeft() {
    }
}