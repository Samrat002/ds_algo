package com.ds_algo.practice.arrays;
/*
    Find the min and max from the array with least number of comparisons
 */
public class FindMinMaxFromArray {

    static class Pair{
        int min, max;
        Pair(){}
        Pair(int min, int max){
            this.min = min;
            this.max = max;
        }
    }

    // linear search needs 2n comparison to find the min and max value
    Pair linearSearch(int [] arr){
        if(arr.length == 0) return new Pair(-1, -1);
        else {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for(int d:arr){
                if(d>max) max = d;
                if(d<min) min = d;
            }
            return new Pair(min, max);
        }
    }

    // divide the array in half's and compare the results

    Pair divideAndSearch(int[] arr){
        if(arr.length == 0) return new Pair(-1, -1);
        return divideAndSearch(arr, 0, arr.length-1);
    }

    Pair divideAndSearch(int[] arr, int low, int high){
        if(low == high){
            return new Pair(arr[low], arr[high]);
        }
        else if(high == low+1){
            return new Pair(Math.min(arr[low], arr[high]), Math.max(arr[low], arr[high]));
        }
        else {
            int mid = (low+high)/2;
            Pair m0 = divideAndSearch(arr, low, mid);
            Pair m1 = divideAndSearch(arr, mid+1, high);
            Pair res = m0;
            if(m1.min<m0.min) res.min = m1.min;
            if(m1.max>m0.max) res.max = m1.max;
            return res;
        }
    }

    // pick in pairs and compare them
    Pair solve(int[] arr){
        Pair minMax = new Pair();
        int i;
        if(arr.length == 0) {
            minMax.min=-1;
            minMax.max = -1;
            return minMax;
        }
        else if(arr.length%2 == 0){
            minMax.min = Math.min(arr[0], arr[1]);
            minMax.max = Math.max(arr[0], arr[1]);
            i=2;

        }else {
            minMax.min = arr[0];
            minMax.max = arr[0];
            i=1;
        }
        while(i<arr.length){
            if(arr[i]> minMax.max) minMax.max = arr[i];
            if(arr[i]< minMax.min) minMax.min = arr[i];
            if(arr[i+1]< minMax.min) minMax.min = arr[i+1];
            if(arr[i+1]> minMax.max) minMax.max = arr[i+1];
            i = i+2;
        }
        return minMax;
    }


}
