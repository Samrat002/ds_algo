package com.ds_algo.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfString {
    List<String> getAllSubset(String s){
        List<String> result = new ArrayList<>();
        findAllSubset(result, s, "", 0);
        return result;
    }

    private void findAllSubset(List<String> result, String s, String tempRes, int pos){
        if(pos == s.length() )
            result.add(tempRes);
        else {
            findAllSubset(result, s, tempRes, pos+1);
            findAllSubset(result, s, tempRes+s.charAt(pos), pos+1);
        }
    }
}
