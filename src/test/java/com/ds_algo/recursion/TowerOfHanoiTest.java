package com.ds_algo.recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TowerOfHanoiTest {

    private TowerOfHanoi obj;
    @BeforeEach
    void setUp() {
        obj = new TowerOfHanoi();

    }

    @Test
    void towerOfHanoi() {
        obj.towerOfHanoi(3, 's', 'm', 'd');
        assertEquals(7, obj.resultList.size());

    }
}