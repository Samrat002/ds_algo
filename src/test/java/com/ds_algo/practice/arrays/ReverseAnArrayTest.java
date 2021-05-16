package com.ds_algo.practice.arrays;

import com.ds_algo.practice.arrays.ReverseAnArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAnArrayTest {

    private ReverseAnArray obj;
    int arr[];
    @BeforeEach
    void setUp() {
        obj = new ReverseAnArray();


    }

    @Test
    void reverse() {

        arr = obj.reverse( new int[]{1,2,3,4,5,6});
        assertEquals(6, arr[0]);
        assertEquals(5, arr[1]);
        assertEquals(4, arr[2]);
        assertEquals(3, arr[3]);
        assertEquals(2, arr[4]);
        assertEquals(1, arr[5]);

    }

    @Test
    void reverseRecursively() {
        arr = obj.reverseRecursively(new int[]{1,2,3,4,5,6});
        assertEquals(6, arr[0]);
        assertEquals(5, arr[1]);
        assertEquals(4, arr[2]);
        assertEquals(3, arr[3]);
        assertEquals(2, arr[4]);
        assertEquals(1, arr[5]);
    }

    @Test
    void testReverseRecursively() {
    }
}