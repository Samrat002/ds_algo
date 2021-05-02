package com.ds_algo.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingUsingRecursionTest {
    SortingUsingRecursion obj ;
    @BeforeEach
    void setUp() {
        obj = new SortingUsingRecursion();
    }

    @Test
    void sort() {
        int arr[] = new int[]{3,2,1,4};
        int[] res =  obj.sort(arr);
        assertEquals(4, res.length);
        assertTrue(res[0]<res[1]);
        assertTrue(res[1]<res[2]);
        assertTrue(res[2]<res[3]);
    }
}