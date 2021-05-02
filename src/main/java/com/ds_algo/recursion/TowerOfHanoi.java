package com.ds_algo.recursion;

import java.util.ArrayList;
import java.util.List;

public class TowerOfHanoi {
    List<String> resultList = new ArrayList<>();
    void towerOfHanoi(int n, char source, char mid, char destination){
        if(n==1){
            resultList.add("Move plate "+ n +" from "+source+" to "+destination);
            return;
        }
        towerOfHanoi(n-1, source, destination, mid);
        resultList.add("Move plate "+ n +" from "+source+" to "+destination);
        towerOfHanoi(n-1, mid, source, destination);

    }
}
