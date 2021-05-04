package com.ds_algo.practice;

public class ReverseAnArray {
    int[] reverse(int[] arr){
        int start = 0, end = arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
        return arr;
    }

    private void swap(int[] arr, int pos0, int pos1 ){
        int temp = arr[pos0];
        arr[pos0] = arr[pos1];
        arr[pos1] = temp;
    }

    int[] reverseRecursively(int [] arr){
        reverseRecursively(arr, 0, arr.length-1);
        return arr;
    }

    void reverseRecursively(int[] arr, int start, int end){
        if(start<end){
            swap(arr, start++, end--);
            reverseRecursively(arr, start, end);
        }
    }
}
