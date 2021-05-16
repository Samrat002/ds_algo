package com.ds_algo.practice.tree.binary_tree.traversal.bfs;

import java.util.ArrayList;
import java.util.List;

/*
    You want to build a house on an empty land which reaches all buildings in the shortest amount of distance.
    You can only move up, down, left and right. You are given a 2D grid of values 0, 1 or 2, where:

    Each 0 marks an empty land which you can pass by freely.
    Each 1 marks a building which you cannot pass through.
    Each 2 marks an obstacle which you cannot pass through.
    Input:
    1 - 0 - 2 - 0 - 1
    |   |   |   |   |
    0 - 0 - 0 - 0 - 0
    |   |   |   |   |
    0 - 0 - 1 - 0 - 0

    Output:
    Shortest Distance: 7

    Explanation:
    Buildings at (0,0), (0,4), (2,2)
    Obstacle at (0,2)
    The point
    (1,2)
     is an ideal empty land to build a house, as the total travel distance of 3+3+1=7 is minimal. So return 7.

 */
public class ShortestDistanceFromAllBuildingsInGrid {
    static int shortestDistance(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        List<Point> buildings = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 1){
                    buildings.add(new Point(i,j));
                }
                grid[i][j] = -grid[i][j];
            }
        }
        for(Point k: buildings){

        }
        return 0;
    }

    static class Point{
        int x, y;
        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
