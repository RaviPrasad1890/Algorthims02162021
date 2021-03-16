package com.paypal;
/*
Maximum profit by buying and selling a share at most k times

In share trading, a buyer buys shares and sells on a future date.
Given the stock price of n days, the trader is allowed to make at most k transactions,
where a new transaction can only start after the previous transaction is complete,
find out the maximum profit that a share trader could have made.
*/
public class MaxProfitStockOne {
    static int maxProfit(int price[],
                         int n, int k)
    {

        // table to store results of subproblems
        // profit[t][i] stores maximum profit
        // using atmost t transactions up to day
        // i (including day i)
        int profit[][] = new int[k + 1][ n + 1];

        // For day 0, you can't earn money
        // irrespective of how many times you trade
        for (int i = 0; i <= k; i++)
            profit[i][0] = 0;

        // profit is 0 if we don't do any
        // transation (i.e. k =0)
        for (int j = 0; j <= n; j++)
            profit[0][j] = 0;

        // fill the table in bottom-up fashion
        for (int i = 1; i <= k; i++)
        {
            int prevDiff = Integer.MIN_VALUE;
            for (int j = 1; j < n; j++)
            {
                prevDiff = Math.max(prevDiff,
                        profit[i - 1][j - 1] -
                                price[j - 1]);
                profit[i][j] = Math.max(profit[i][j - 1],
                        price[j] + prevDiff);
            }
        }

        return profit[k][n - 1];
    }

    public static void main (String[] args)
    {
        int k = 3;
        int price[] = {12, 14, 17, 10, 14, 13, 12, 15};

        int n = price.length;

        System.out.println("Maximum profit is: " +
                maxProfit(price, n, k));
    }
}
//TC: O(kn)
/*
Input:
Price = [10, 22, 5, 75, 65, 80]
    K = 2
Output:  87
Trader earns 87 as sum of 12 and 75
Buy at price 10, sell at 22, buy at
5 and sell at 80

Input:
Price = [12, 14, 17, 10, 14, 13, 12, 15]
    K = 3
Output:  12
Trader earns 12 as the sum of 5, 4 and 3
Buy at price 12, sell at 17, buy at 10
and sell at 14 and buy at 12 and sell
at 15

Input:
Price = [100, 30, 15, 10, 8, 25, 80]
    K = 3
Output:  72
Only one transaction. Buy at price 8
and sell at 80.

Input:
Price = [90, 80, 70, 60, 50]
    K = 1
Output:  0
Not possible to earn.
*/