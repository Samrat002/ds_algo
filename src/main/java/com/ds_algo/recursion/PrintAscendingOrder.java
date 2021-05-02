package com.ds_algo.recursion;

public class PrintAscendingOrder {
    void print(int n){
        if(n==0) return ;
        print(n-1);
        System.out.println(n);
    }
}
