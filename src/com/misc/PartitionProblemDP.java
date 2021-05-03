package com.misc;
/*
Partition problem is to determine whether a given set can be partitioned into
two subsets such that the sum of elements in both subsets is the same.

arr[] = {1, 5, 11, 5}
Output: true
The array can be partitioned as {1, 5, 5} and {11}
 */
public class PartitionProblemDP {

    // Returns true if arr[] can be partitioned in two
    // subsets of equal sum, otherwise false
    static boolean findPartition(int arr[], int n)
    {

        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        if(sum%2!=0){
            return false;
        }
        boolean[][] dp= new boolean[sum/2+1][n+1];
        for(int i=0;i<=n;i++){
            dp[0][i]=true;
        }
        for(int i=1;i<=sum/2;i++){
            dp[i][0]=false;
        }
        for(int i=1;i<=sum/2;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=dp[i][j-1];
                if(i>=arr[j-1]){
                    dp[i][j] |=dp[i-arr[j-1]][j-1];
                }
            }
        }
        return dp[sum/2][n];

    }

    public static void main(String[] args)
    {
        int arr[] = { 3, 1, 1, 2, 2, 1 };
        int n = arr.length;
        if (findPartition(arr, n) == true)
            System.out.println(
                    "Can be divided into two subsets of equal sum");
        else
            System.out.println(
                    "Can not be divided into two subsets of equal sum");
    }
}
