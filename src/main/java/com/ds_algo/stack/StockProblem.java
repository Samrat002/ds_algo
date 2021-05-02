package com.ds_algo.stack;

import javax.xml.bind.annotation.XmlInlineBinaryData;

public class StockProblem {
    public int stockSpan(int[] prices){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, profit = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>max) {
                max = prices[i];
                min = prices[i];
            }
            if(prices[i]<min)
                min = prices[i];
            if(max-min > profit)
                profit = max- min;

        }
        return profit;
    }
}
