package com.ds_algo.recursion;

public class PrintDescendingOrder {
    void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
}
