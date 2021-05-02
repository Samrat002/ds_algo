package com.ds_algo.recursion;

public class SortingUsingRecursion {
    int[] sort(int[] arr){
        if(arr.length == 0) return new int[0];
        sortByRecursion(arr, arr.length-1);
        return arr;
    }

    private void sortByRecursion(int[] arr, int pos){
        if(pos == 0) return;
        sortByRecursion(arr, pos-1);
        insert(arr, pos);

    }
    private void insert(int[] arr, int pos){
        if(pos==0 || arr[pos-1]<=arr[pos])
            return;
        else {
            swap(arr, pos, pos-1);
            insert(arr, pos-1);
        }
    }

    private void swap(int[] arr, int pos1, int pos2){
        int res = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = res;
    }
}
