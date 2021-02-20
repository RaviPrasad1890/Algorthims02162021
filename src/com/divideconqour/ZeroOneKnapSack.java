package com.divideconqour;
/*
Given the weight and profits of N items, we rae asked to put these items in a knapsack which has capacity C.
Restriction is that we cannot break the items into smaller units i.e. fraction is not allowed.
Challenge is to find maximum profit from the items in the knapsack.
Profits={31,26,72,17}
Weight={3,1,5,2}
Capacity 7
O/P=98//26+72, weight==1+5==6
 */
public class ZeroOneKnapSack {
    public int maxProfit(int[] profits,int[] weights,int capacity,int currIndex){
        if(capacity==0||currIndex>=profits.length){
            return 0;
        }
        int profit1=0;
        if(weights[currIndex]<=capacity){
            profit1=profits[currIndex]+
                    maxProfit(profits,weights,capacity-weights[currIndex],currIndex+1);
        }
        int profit2=maxProfit(profits,weights,capacity,currIndex+1);
        return Math.max(profit1,profit2);
    }
    public static void main(String[] args){
        ZeroOneKnapSack obj= new ZeroOneKnapSack();
        int[] profits={31,26,72,17};
        int[] weights={3,1,5,2};
        int capacity=7;
        System.out.println(obj.maxProfit(profits,weights,capacity,0));
    }
}
