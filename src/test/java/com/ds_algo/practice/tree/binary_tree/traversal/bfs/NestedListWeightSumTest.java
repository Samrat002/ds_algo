package com.ds_algo.practice.tree.binary_tree.traversal.bfs;

import com.ds_algo.practice.tree.binary_tree.traversal.bfs.NestedListWeightSum;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NestedListWeightSumTest {

    List<NestedListWeightSum.NestedInteger> input;

    @BeforeEach
    void setUp() {
        input = new ArrayList<>();
        List<NestedListWeightSum.NestedInteger> n1 = new ArrayList<>();
        n1.add(new NestedListWeightSum.NestedInteger(true, 1, null));
        n1.add(new NestedListWeightSum.NestedInteger(true, 1, null));
        input.add(new NestedListWeightSum.NestedInteger(false, null, n1));

        input.add(new NestedListWeightSum.NestedInteger(true, 2, null));

        n1 = new ArrayList<>();
        n1.add(new NestedListWeightSum.NestedInteger(true, 1, null));
        n1.add(new NestedListWeightSum.NestedInteger(true, 1, null));
        input.add(new NestedListWeightSum.NestedInteger(false, null, n1));
    }

    @Test
    void testWeightedDfs() {
        assertEquals(10, NestedListWeightSum.weightedDfs(input));
    }

    @Test
    void weightedBfs() {
        assertEquals(10, NestedListWeightSum.weightedBfs(input));
    }
}