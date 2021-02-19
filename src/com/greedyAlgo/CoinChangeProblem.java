package com.greedyAlgo;

/*
Given a amount
Find Min number of coins reqrd to make that Amount
Denominations all in Indian Currency
 */
public class CoinChangeProblem {
    public static void main(String[] args){
        //If available coins are not sorted, than sort it before processing
        int[] coins={1,2,5,10,20,50,100,200,500,2000};
        int amount=3576;
        coinChange(coins,amount);
    }
    private static void coinChange(int[] coins,int amount){
        //Assuming coins allready in sorted
        int index=coins.length-1;
        while(true){
            int coinValue=coins[index];
            index--;
            if (coinValue<=amount) {
                int maxAmount=amount/coinValue*coinValue;
                System.out.println("Coin value: "+coinValue+ " taken count: "+(amount/coinValue));
                amount=amount-maxAmount;
            }
            if(amount==0){
                break;
            }
        }
    }
}
