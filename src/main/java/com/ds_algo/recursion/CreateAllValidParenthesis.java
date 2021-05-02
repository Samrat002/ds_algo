package com.ds_algo.recursion;

import java.util.ArrayList;
import java.util.List;

public class CreateAllValidParenthesis {
    int initialCount ;
    public List<String> createValidParenthesis(int n){
        List<String> resultSet = new ArrayList<>();
        this.initialCount = n;
        findAllSet(resultSet, n, n, "");
        return resultSet;
    }
    private void findAllSet(List<String> resultSet, int open, int closed, String tempRes){
         if(open == 0 && closed == 0) {
             resultSet.add(tempRes);

         }
         else if(open == initialCount || open == closed){
             tempRes = tempRes + "(";
             findAllSet(resultSet, open-1, closed, tempRes);
         }
        else if(open>0){
            String tempRes1 = tempRes+"(";
            String tempRes2 = tempRes+")";
            findAllSet(resultSet, open-1, closed, tempRes1);
            findAllSet(resultSet, open, closed-1, tempRes2);
        }else if (closed>open){
            tempRes = tempRes+")";
            findAllSet(resultSet, open, closed-1, tempRes);
        }


    }

}
