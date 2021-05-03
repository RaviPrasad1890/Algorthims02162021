package com.misc;
/*
Fimd maximum subarr of window size k given
* */
public class SlidingWindow01 {
    public static int findMaxSumArr(int[] arr,int n,int k){
        int sum=0;
        int max=0;
        int windowStart=0;
        int windowEnd=0;
        while(windowEnd<n){
            sum=sum+arr[windowEnd];
            if(windowEnd-windowStart+1==k){
                if(max<sum){
                    max=sum;
                }
                sum=sum-arr[windowStart];
                windowStart=windowStart+1;
            }
            windowEnd=windowEnd+1;
        }
        return max;
    }
    public static void main(String[] args){
        int arr[]={2,5,3,1,3,6};
        int k=2;
        int res= findMaxSumArr(arr,arr.length,k);
        System.out.println(res);
    }
}
