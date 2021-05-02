package com.ds_algo.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintAscendingOrderTest {

    private PrintAscendingOrder obj;
    @BeforeEach
    void setUp() {
        obj = new PrintAscendingOrder();
    }

    @Test
    void print() {
        obj.print(5);
    }
}